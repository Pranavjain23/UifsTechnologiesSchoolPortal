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
import com.application.uifstechnologiesschoolportal.adapter.ExamNotificationAdapter
import com.application.uifstechnologiesschoolportal.adapter.ExamTestAdapter
import com.application.uifstechnologiesschoolportal.model.examnotificationmodel
import com.application.uifstechnologiesschoolportal.model.examtestmodel

class ExamTestFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llExamTest : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: ExamTestAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_exam_test, container, false)

        recyclerView = view.findViewById(R.id.recycler_exam_test)
        llExamTest = LinearLayoutManager(activity)
        val examtest = arrayListOf<examtestmodel>()


        examtest.add(examtestmodel("Physics","22-06-2021","Physics","03:00:00","2","Objective","Not completed"))
        examtest.add(examtestmodel("Mathematics","26-06-2021","Chemistry","03:00:00","2","Subjective","Not completed"))

        recyclerAdapter = ExamTestAdapter(activity as Context,examtest)
        recyclerView.layoutManager = llExamTest
        recyclerView.adapter = recyclerAdapter

        return view
    }

}