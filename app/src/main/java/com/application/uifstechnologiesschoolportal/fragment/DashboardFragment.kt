package com.application.uifstechnologiesschoolportal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.activity.MainActivity

class DashboardFragment : Fragment() {

    lateinit var attendanceReport : CardView
    lateinit var feeDetails : CardView
    lateinit var homework : CardView
    lateinit var marks : CardView
    lateinit var leave : CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        attendanceReport = view.findViewById(R.id.attendanceReport)
        feeDetails = view.findViewById(R.id.feeDetails)
        homework = view.findViewById(R.id.homework)
        marks = view.findViewById(R.id.marks)
        leave = view.findViewById(R.id.leave)

        attendanceReport.setOnClickListener{
            Toast.makeText(context,"Coming Soon!",Toast.LENGTH_SHORT).show()
        }
        feeDetails.setOnClickListener {
            Toast.makeText(context,"Coming Soon!",Toast.LENGTH_SHORT).show()
        }
        homework.setOnClickListener {
            val fragment = HomeworkFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
            getActionBar()?.title = "Home Work"
        }
        marks.setOnClickListener {
            val fragment = ExamReportFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
            getActionBar()?.title = "Examination"
        }
        leave.setOnClickListener {
            Toast.makeText(context,"Coming Soon!",Toast.LENGTH_SHORT).show()
        }


        return view
    }

    private fun getActionBar(): androidx.appcompat.app.ActionBar? {
        return (activity as MainActivity).supportActionBar
    }

}