package com.idejie.android.pix2tex.activities;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.idejie.android.pix2tex.R;
import com.idejie.android.pix2tex.adapters.MainViewPagerAdapter;
import com.idejie.android.pix2tex.fragments.CameraFragment;
import com.idejie.android.pix2tex.fragments.HistoryFragment;
import com.idejie.android.pix2tex.fragments.ProfileFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    TabLayout tabLayout;
    TabItem item_history, item_camera, item_profile;
    ViewPager main_vp;
    MainViewPagerAdapter mainViewPagerAdapter;
    List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout);
        item_history = findViewById(R.id.item_history);
        item_camera = findViewById(R.id.item_camera);
        item_profile = findViewById(R.id.item_person);
        main_vp = findViewById(R.id.main_vp);

        fragments.add(HistoryFragment.newInstance());
        fragments.add(CameraFragment.newInstance());
        fragments.add(ProfileFragment.newInstance());


        tabLayout.getTabAt(1).select();

        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#9961e1"), PorterDuff.Mode.SRC_IN);

        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#9961e1"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);


        mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), fragments);
        main_vp.setAdapter(mainViewPagerAdapter);
        main_vp.setCurrentItem(1);
        main_vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                int p = tabLayout.getSelectedTabPosition();
                if (p != i) {
                    tabLayout.getTabAt(i).select();
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        tabLayout.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
        try {
            main_vp.setCurrentItem(tab.getPosition());
        } catch (Exception e) {
            Log.d("#Pix2Tex", e.toString());
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
        tab.getIcon().setColorFilter(Color.parseColor("#9961e1"), PorterDuff.Mode.SRC_IN);

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
