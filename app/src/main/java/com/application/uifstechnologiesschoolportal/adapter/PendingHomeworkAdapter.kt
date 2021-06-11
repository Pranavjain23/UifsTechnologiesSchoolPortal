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

class PendingHomeworkAdapter (val context: Context, val list: ArrayList<pendinghomeworkmodel>) : RecyclerView.Adapter<PendingHomeworkAdapter.pending_homework_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): pending_homework_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pending_homework_single_row,parent,false)

        return pending_homework_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: pending_homework_recycler, position: Int) {
        val pendinghomework= list[position]
        holder.txtSubjectRemarks.text= pendinghomework.txtSubjectRemarks
        holder.txtSubjectTeacherName.text= pendinghomework.txtSubjectTeacherName
        holder.txtSubjectName.text= pendinghomework.txtSubjectName
        holder.imgSubject.setImageResource(pendinghomework.imgSubject)
        //holder.btnSubmit.setOnClickListener()

    }

    class pending_homework_recycler(view: View): RecyclerView.ViewHolder(view) {
        val imgSubject : ImageView =view.findViewById(R.id.imgSubject);
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectTeacherName: TextView =view.findViewById(R.id.txtSubjectTeacherName);
        val txtSubjectRemarks : TextView =view.findViewById(R.id.txtSubjectRemarks);
        val btnSubmit: Button =view.findViewById(R.id.btnSubmit);

        val llPending: LinearLayout = view.findViewById(R.id.llPending)

    }

}