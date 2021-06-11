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
import com.application.uifstechnologiesschoolportal.model.declinehomeworkmodel

class DeclineHomeworkFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llDecline : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: DeclineHomeworkAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_decline_homework, container, false)

        recyclerView = view.findViewById(R.id.recycler_decline_homework)
        llDecline = LinearLayoutManager(activity)
        val declinehomework = arrayListOf<declinehomeworkmodel>()


        declinehomework.add(declinehomeworkmodel(R.drawable.dummyimg,"Physics","Karan S.","Do your work again"))
        declinehomework.add(declinehomeworkmodel(R.drawable.dummyimg,"Mathematics","Pranav S.","Do your work again"))

        recyclerAdapter = DeclineHomeworkAdapter(activity as Context,declinehomework)
        recyclerView.layoutManager = llDecline
        recyclerView.adapter = recyclerAdapter

        return view
    }

}