package com.application.uifstechnologiesschoolportal.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.application.uifstechnologiesschoolportal.R;
import com.application.uifstechnologiesschoolportal.fragment.DeclineHomeworkFragment;
import com.application.uifstechnologiesschoolportal.fragment.PendingHomeworkFragment;
import com.application.uifstechnologiesschoolportal.fragment.StatusHomeworkFragment;
import com.application.uifstechnologiesschoolportal.fragment.SubmittedHomeworkFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES =
            new int[] {R.string.pending , R.string.submitted , R.string.decline , R.string.status};
    private final Context mContext;
    public MyAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PendingHomeworkFragment pending_object = new PendingHomeworkFragment();
                return pending_object;
            case 1:
                SubmittedHomeworkFragment submitted_obj = new SubmittedHomeworkFragment();
                return submitted_obj;
            case 2:
                DeclineHomeworkFragment decline_obj = new DeclineHomeworkFragment();
                return decline_obj;
            case 3:
                StatusHomeworkFragment status_obj = new StatusHomeworkFragment();
                return status_obj;

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
        return 4;
    }
}
