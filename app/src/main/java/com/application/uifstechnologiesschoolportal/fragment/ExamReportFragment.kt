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
import com.application.uifstechnologiesschoolportal.adapter.ExamReportAdapter
import com.application.uifstechnologiesschoolportal.model.examnotificationmodel
import com.application.uifstechnologiesschoolportal.model.examreportmodel

class ExamReportFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llExamReport : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: ExamReportAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exam_report, container, false)

        recyclerView = view.findViewById(R.id.recycler_exam_report)
        llExamReport = LinearLayoutManager(activity)
        val examreport = arrayListOf<examreportmodel>()


        examreport.add(examreportmodel("Physics","22-06-2021","Grade","A+"))
        examreport.add(examreportmodel("Mathematics","26-06-2021","Grade","B"))

        recyclerAdapter = ExamReportAdapter(activity as Context,examreport)
        recyclerView.layoutManager = llExamReport
        recyclerView.adapter = recyclerAdapter

        return view
    }

}