package com.application.uifstechnologiesschoolportal.fragment

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.activity.MainActivity
import com.application.uifstechnologiesschoolportal.adapter.MyAdapter
import com.google.android.material.tabs.TabLayout


class HomeworkFragment : Fragment() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    private lateinit var myContext: MainActivity


    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        myContext = activity as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_homework, container, false)


        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        val adapter = MyAdapter(context, childFragmentManager)

        viewPager.setAdapter(adapter)

        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#eb4034"))

        return view

    }
}