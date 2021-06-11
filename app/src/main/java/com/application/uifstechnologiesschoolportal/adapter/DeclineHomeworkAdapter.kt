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
import com.application.uifstechnologiesschoolportal.model.declinehomeworkmodel

class DeclineHomeworkAdapter (val context: Context, val list: ArrayList<declinehomeworkmodel>) : RecyclerView.Adapter<DeclineHomeworkAdapter.decline_homework_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): decline_homework_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.decline_homework_single_row,parent,false)

        return decline_homework_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: decline_homework_recycler, position: Int) {
        val declinehomework= list[position]
        holder.txtSubjectRemarks.text= declinehomework.txtSubjectRemarks
        holder.txtSubjectTeacherName.text= declinehomework.txtSubjectTeacherName
        holder.txtSubjectName.text= declinehomework.txtSubjectName
        holder.imgSubject.setImageResource(declinehomework.imgSubject)

    }

    class decline_homework_recycler(view: View): RecyclerView.ViewHolder(view) {
        val imgSubject : ImageView =view.findViewById(R.id.imgSubject);
        val txtSubjectName : TextView =view.findViewById(R.id.txtSubjectName);
        val txtSubjectTeacherName: TextView =view.findViewById(R.id.txtSubjectTeacherName);
        val txtSubjectRemarks : TextView =view.findViewById(R.id.txtSubjectRemarks);
        val btnSubmit: Button =view.findViewById(R.id.btnSubmit);

        val llDecline: LinearLayout = view.findViewById(R.id.llDecline)

    }

}