package com.stephanie.whatsapp;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.github.tlaabs.timetableview.Schedule;

public class TabsAccessorAdapter extends FragmentPagerAdapter{

    public TabsAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new ContactsFragment();


            case 1:
                return new ChatsFragment();

            case 2:
                return new ScheduleFragment();

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Friends";

            case 1:
                return "Chats";

            case 2:
                return "Schedule";


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
