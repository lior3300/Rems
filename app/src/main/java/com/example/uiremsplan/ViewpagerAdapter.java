package com.example.uiremsplan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewpagerAdapter} factory method to
 * create an instance of this fragment.
 */
public class ViewpagerAdapter extends FragmentStateAdapter {


    public ViewpagerAdapter(@NonNull FragmentManager fragmentManager,@NonNull Lifecycle lifecycle) {
        super(fragmentManager,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //TODO:create fragments:1,2,3,4,5,6
        switch (position) {
            case 0:
                return new Home_page();
                /**
            case 1:
                return new keywords();
            case 2:
                return new groups_and_points();
            case 3:
                return new RemindersCollection();
            case 4:
                return new edit_reminder();
             case 5:
             return new RemindersCollection();
                **/
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 6;
    }
}