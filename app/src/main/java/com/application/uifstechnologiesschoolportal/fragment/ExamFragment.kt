package com.application.uifstechnologiesschoolportal.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.activity.MainActivity

class ExamFragment : Fragment() {

    lateinit var examNotif : CardView
    lateinit var downloadAdmitCard : CardView
    lateinit var examTest : CardView
    lateinit var examReport : CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exam, container, false)

        examNotif = view.findViewById(R.id.examNotif)
        downloadAdmitCard = view.findViewById(R.id.downloadAdmitCard)
        examTest = view.findViewById(R.id.examTest)
        examReport = view.findViewById(R.id.examReport)

        examNotif.setOnClickListener {
            val fragment = ExamNotificationFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        downloadAdmitCard.setOnClickListener {
            val fragment = DownloadAdmitCardFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        examTest.setOnClickListener {
            val fragment = ExamTestFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }
        examReport.setOnClickListener {
            val fragment = ExamReportFragment()
            val args = Bundle()
            fragment.arguments = args
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(
                    R.id.frame,
                    fragment
                ).commit()
        }

        return view
    }

}