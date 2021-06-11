package com.application.uifstechnologiesschoolportal.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.application.uifstechnologiesschoolportal.R;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.FridayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.MondayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.SaturdayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.SundayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.ThursdayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.TuesdayFragment;
import com.application.uifstechnologiesschoolportal.fragment.timetabledays.WednesdayFragment;

public class TimeTableAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES =
            new int[] {R.string.monday , R.string.tuesday , R.string.wednesday , R.string.thursday , R.string.friday , R.string.saturday , R.string.sunday};

    private final Context mContext;
    public TimeTableAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MondayFragment monday_object = new MondayFragment();
                return monday_object;
            case 1:
                TuesdayFragment tuesday_obj = new TuesdayFragment();
                return tuesday_obj;
            case 2:
                WednesdayFragment wednesday_obj = new WednesdayFragment();
                return wednesday_obj;
            case 3:
                ThursdayFragment thursday_obj = new ThursdayFragment();
                return thursday_obj;
            case 4:
                FridayFragment friday_object = new FridayFragment();
                return friday_object;
            case 5:
                SaturdayFragment saturday_object = new SaturdayFragment();
                return saturday_object;
            case 6:
                SundayFragment sunday_object = new SundayFragment();
                return sunday_object;

            default:
                return null;
        }
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
    @Override
    public int getCount() {
        return 7;
    }
}
