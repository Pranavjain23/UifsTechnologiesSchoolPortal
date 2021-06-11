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
import com.application.uifstechnologiesschoolportal.model.submittedhomeworkmodel

class SubmittedHomeworkAdapter (val context: Context, val list: ArrayList<submittedhomeworkmodel>) : RecyclerView.Adapter<SubmittedHomeworkAdapter.submitted_homework_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): submitted_homework_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.submitted_homework_single_row,parent,false)

        return submitted_homework_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: submitted_homework_recycler, position: Int) {
        val submittedhomework= list[position]
        holder.txtSubjectRemarks.text= submittedhomework.txtSubjectRemarks
        holder.txtSubjectTeacherName.text= submittedhomework.txtSubjectTeacherName
        holder.txtSubjectName.text= submittedhomework.txtSubjectName
        holder.imgSubject.setImageResource(submittedhomework.imgSubject)

    }

    class submitted_homework_recycler(view: View): RecyclerView.ViewHolder(view) {
        val imgSubject : ImageView =view.findViewById(R.id.imgSubject);
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectTeacherName: TextView =view.findViewById(R.id.txtSubjectTeacherName);
        val txtSubjectRemarks : TextView =view.findViewById(R.id.txtSubjectRemarks);

        val llSubmitted: LinearLayout = view.findViewById(R.id.llSubmitted)

    }

}