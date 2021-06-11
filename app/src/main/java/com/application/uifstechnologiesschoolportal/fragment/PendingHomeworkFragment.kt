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
import com.application.uifstechnologiesschoolportal.adapter.PendingHomeworkAdapter
import com.application.uifstechnologiesschoolportal.model.declinehomeworkmodel
import com.application.uifstechnologiesschoolportal.model.pendinghomeworkmodel

class PendingHomeworkFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llPending : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: PendingHomeworkAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pending_homework, container, false)

        recyclerView = view.findViewById(R.id.recycler_pending_homework)
        llPending = LinearLayoutManager(activity)
        val pendinghomework = arrayListOf<pendinghomeworkmodel>()


        pendinghomework.add(pendinghomeworkmodel(R.drawable.dummyimg,"Physics","Karan S.","Thermodynamics : Basic explanation and important conclusions"))
        pendinghomework.add(pendinghomeworkmodel(R.drawable.dummyimg,"Mathematics","Pranav S.","Getting started with triangles"))

        recyclerAdapter = PendingHomeworkAdapter(activity as Context,pendinghomework)
        recyclerView.layoutManager = llPending
        recyclerView.adapter = recyclerAdapter

        return view

    }
    
}