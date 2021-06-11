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
import com.application.uifstechnologiesschoolportal.model.pendinghomeworkmodel
import com.application.uifstechnologiesschoolportal.model.statushomeworkmodel

class StatusHomeworkAdapter (val context: Context, val list: ArrayList<statushomeworkmodel>) : RecyclerView.Adapter<StatusHomeworkAdapter.status_homework_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): status_homework_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.status_homework_single_row,parent,false)

        return status_homework_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: status_homework_recycler, position: Int) {
        val statushomework= list[position]
        holder.txtSubjectGrade.text= statushomework.txtSubjectGrade
        holder.txtSubjectTeacherName.text= statushomework.txtSubjectTeacherName
        holder.txtSubjectName.text= statushomework.txtSubjectName
        holder.txtSubjectMarks.text= statushomework.txtSubjectMarks

    }

    class status_homework_recycler(view: View): RecyclerView.ViewHolder(view) {
        val txtSubjectMarks : TextView =view.findViewById(R.id.txtSubjectMarks);
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectTeacherName: TextView =view.findViewById(R.id.txtSubjectTeacherName);
        val txtSubjectGrade : TextView =view.findViewById(R.id.txtSubjectGrade);

        val llStatus: LinearLayout = view.findViewById(R.id.llStatus)

    }

}