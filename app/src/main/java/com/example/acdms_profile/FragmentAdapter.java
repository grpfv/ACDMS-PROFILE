package com.example.acdms_profile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(FragmentManager fragmentManager, Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Tab_album();
            case 1:
                return new Tab_notes();
            case 2:
                return new Tab_files();
            default:
                return new Tab_album();// Default to AlbumFragment
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}