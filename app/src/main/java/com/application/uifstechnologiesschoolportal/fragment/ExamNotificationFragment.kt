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
import com.application.uifstechnologiesschoolportal.adapter.PendingHomeworkAdapter
import com.application.uifstechnologiesschoolportal.model.examnotificationmodel
import com.application.uifstechnologiesschoolportal.model.pendinghomeworkmodel

class ExamNotificationFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llExamNotification : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: ExamNotificationAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exam_notification, container, false)

        recyclerView = view.findViewById(R.id.recycler_exam_notification)
        llExamNotification = LinearLayoutManager(activity)
        val examnotification = arrayListOf<examnotificationmodel>()


        examnotification.add(examnotificationmodel("Physics","22-06-2021","Physics","03:00:00","2"))
        examnotification.add(examnotificationmodel("Mathematics","26-06-2021","Chemistry","03:00:00","2"))

        recyclerAdapter = ExamNotificationAdapter(activity as Context,examnotification)
        recyclerView.layoutManager = llExamNotification
        recyclerView.adapter = recyclerAdapter

        return view
    }

}