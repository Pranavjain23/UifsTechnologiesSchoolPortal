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
import com.application.uifstechnologiesschoolportal.adapter.SubmittedHomeworkAdapter
import com.application.uifstechnologiesschoolportal.model.declinehomeworkmodel
import com.application.uifstechnologiesschoolportal.model.submittedhomeworkmodel

class SubmittedHomeworkFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llSubmitted : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: SubmittedHomeworkAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_submitted_homework, container, false)

        recyclerView = view.findViewById(R.id.recycler_submitted_homework)
        llSubmitted = LinearLayoutManager(activity)
        val submittedhomework = arrayListOf<submittedhomeworkmodel>()


        submittedhomework.add(submittedhomeworkmodel(R.drawable.dummyimg,"Physics","Karan S.","Thermodynamics : Basic explanation and important conclusions"))
        submittedhomework.add(submittedhomeworkmodel(R.drawable.dummyimg,"Mathematics","Pranav S.","Getting started with triangles"))

        recyclerAdapter = SubmittedHomeworkAdapter(activity as Context,submittedhomework)
        recyclerView.layoutManager = llSubmitted
        recyclerView.adapter = recyclerAdapter

        return view

    }

}