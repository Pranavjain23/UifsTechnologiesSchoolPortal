package com.application.uifstechnologiesschoolportal.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.model.readingmodel
import com.application.uifstechnologiesschoolportal.model.statushomeworkmodel

class ReadingAdapter (val context: Context, val list: ArrayList<readingmodel>) : RecyclerView.Adapter<ReadingAdapter.reading_recycler>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): reading_recycler {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.reading_single_row,parent,false)

        return reading_recycler(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: reading_recycler, position: Int) {
        val reading= list[position]
        holder.readSubjectName.text= reading.readSubjectName

    }

    class reading_recycler(view: View): RecyclerView.ViewHolder(view) {
        val readSubjectName : TextView =view.findViewById(R.id.readSubjectName);

       // val llStatus: LinearLayout = view.findViewById(R.id.llStatus)

    }

}