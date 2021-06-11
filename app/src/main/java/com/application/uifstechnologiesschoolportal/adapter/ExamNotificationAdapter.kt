package com.application.uifstechnologiesschoolportal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.model.examnotificationmodel
import com.application.uifstechnologiesschoolportal.model.pendinghomeworkmodel

class ExamNotificationAdapter (val context: Context, val list: ArrayList<examnotificationmodel>) : RecyclerView.Adapter<ExamNotificationAdapter.exam_notification_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exam_notification_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exam_test_notification_single_row,parent,false)

        return exam_notification_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: exam_notification_recycler, position: Int) {
        val examnotification= list[position]
        holder.txtSubjectDate.text= examnotification.txtSubjectDate
        holder.txtSubjectName.text= examnotification.txtSubjectName
        holder.txtSubjectTime.text= examnotification.txtSubjectTime
        holder.txtSubjectDuration.text= examnotification.txtSubjectDuration
        holder.txtSubjectTerm.text= examnotification.txtSubjectTerm
        //holder.imgSubject.setImageResource(pendinghomework.imgSubject)
        //holder.btnSubmit.setOnClickListener()

    }

    class exam_notification_recycler(view: View): RecyclerView.ViewHolder(view) {
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectDate: TextView =view.findViewById(R.id.txtSubjectDate);
        val txtSubjectTime : TextView =view.findViewById(R.id.txtSubjectTime);
        val txtSubjectDuration : TextView =view.findViewById(R.id.txtSubjectDuration);
        val txtSubjectTerm : TextView =view.findViewById(R.id.txtSubjectTerm);
        //val btnSubmit: Button =view.findViewById(R.id.btnSubmit);

       // val llPending: LinearLayout = view.findViewById(R.id.llPending)

    }

}