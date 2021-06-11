package com.application.uifstechnologiesschoolportal.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.adapter.MyAdapter
import com.application.uifstechnologiesschoolportal.adapter.TimeTableAdapter
import com.google.android.material.tabs.TabLayout

class TimeTableFragment : Fragment() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_time_table, container, false)

        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.viewPager);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        val adapter = TimeTableAdapter(context, childFragmentManager)

        viewPager.setAdapter(adapter)

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#eb4034"))

        return view
    }

}