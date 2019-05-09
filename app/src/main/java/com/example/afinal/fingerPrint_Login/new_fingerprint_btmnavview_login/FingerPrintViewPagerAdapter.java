package com.example.afinal.fingerPrint_Login.new_fingerprint_btmnavview_login;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FingerPrintViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentArrayList = new ArrayList<>();

    public FingerPrintViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }


    public void addFragment(Fragment fragment) {

        fragmentArrayList.add(fragment);

    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
