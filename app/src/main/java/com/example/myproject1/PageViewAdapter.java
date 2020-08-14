package com.example.myproject1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PageViewAdapter extends FragmentPagerAdapter {
    public PageViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=new Fragment_nonveg();
                break;
            case 1:
                fragment=new Fragment_veg();
                break;
            case 2:
                fragment=new Fragment_snacks();
                break;
            case 3:
                fragment=new Fragment_desert();
                break;
            case 4:
                fragment=new Fragment_beverges();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
