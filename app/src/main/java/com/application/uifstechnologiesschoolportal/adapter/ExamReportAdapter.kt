package com.application.uifstechnologiesschoolportal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.model.examreportmodel

class ExamReportAdapter (val context: Context, val list: ArrayList<examreportmodel>) : RecyclerView.Adapter<ExamReportAdapter.exam_report_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exam_report_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exam_report_single_row,parent,false)

        return exam_report_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: exam_report_recycler, position: Int) {
        val examnotification= list[position]
        holder.txtSubjectDate.text= examnotification.txtSubjectDate
        holder.txtSubjectName.text= examnotification.txtSubjectName
        holder.txtMaxMarks.text= examnotification.txtMaxMarks
        holder.txtMarksObtained.text= examnotification.txtMarksObtained

        //holder.imgSubject.setImageResource(pendinghomework.imgSubject)
        //holder.btnSubmit.setOnClickListener()

    }

    class exam_report_recycler(view: View): RecyclerView.ViewHolder(view) {
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectDate: TextView =view.findViewById(R.id.txtSubjectDate);
        val txtMaxMarks : TextView =view.findViewById(R.id.txtMaxMarks);
        val txtMarksObtained : TextView =view.findViewById(R.id.txtMarksObtained);

        //val btnSubmit: Button =view.findViewById(R.id.btnSubmit);

        // val llPending: LinearLayout = view.findViewById(R.id.llPending)

    }

}