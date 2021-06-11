package com.application.uifstechnologiesschoolportal.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.adapter.DeclineHomeworkAdapter
import com.application.uifstechnologiesschoolportal.adapter.StatusHomeworkAdapter
import com.application.uifstechnologiesschoolportal.model.declinehomeworkmodel
import com.application.uifstechnologiesschoolportal.model.statushomeworkmodel

class StatusHomeworkFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llStatus : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: StatusHomeworkAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_status_homework, container, false)

        recyclerView = view.findViewById(R.id.recycler_status_homework)
        llStatus = LinearLayoutManager(activity)
        val statushomework = arrayListOf<statushomeworkmodel>()


        statushomework.add(statushomeworkmodel("50","Physics","Karan S.","A"))
        statushomework.add(statushomeworkmodel("55","Mathematics","Pranav S.","A+"))

        recyclerAdapter = StatusHomeworkAdapter(activity as Context,statushomework)
        recyclerView.layoutManager = llStatus
        recyclerView.adapter = recyclerAdapter

        return view

    }

}