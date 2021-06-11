package com.application.uifstechnologiesschoolportal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.model.examnotificationmodel
import com.application.uifstechnologiesschoolportal.model.examtestmodel

class ExamTestAdapter (val context: Context, val list: ArrayList<examtestmodel>) : RecyclerView.Adapter<ExamTestAdapter.exam_test_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exam_test_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.examtest_single_row,parent,false)

        return exam_test_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: exam_test_recycler, position: Int) {
        val examtest= list[position]
        holder.txtSubjectDate.text= examtest.txtSubjectDate
        holder.txtSubjectName.text= examtest.txtSubjectName
        holder.txtSubjectTime.text= examtest.txtSubjectTime
        holder.txtSubjectDuration.text= examtest.txtSubjectDuration
        holder.txtSubjectTerm.text= examtest.txtSubjectTerm
        holder.txtSubjectType.text= examtest.txtSubjectType
        holder.txtSubjectStatus.text= examtest.txtSubjectStatus
        //holder.imgSubject.setImageResource(pendinghomework.imgSubject)
        //holder.btnSubmit.setOnClickListener()

    }

    class exam_test_recycler(view: View): RecyclerView.ViewHolder(view) {
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectDate: TextView =view.findViewById(R.id.txtSubjectDate);
        val txtSubjectTime : TextView =view.findViewById(R.id.txtSubjectTime);
        val txtSubjectDuration : TextView =view.findViewById(R.id.txtSubjectDuration);
        val txtSubjectTerm : TextView =view.findViewById(R.id.txtSubjectTerm);
        val txtSubjectType : TextView =view.findViewById(R.id.txtSubjectType);
        val txtSubjectStatus : TextView =view.findViewById(R.id.txtSubjectStatus);
        //val btnSubmit: Button =view.findViewById(R.id.btnSubmit);

        // val llPending: LinearLayout = view.findViewById(R.id.llPending)

    }

}