    package com.application.uifstechnologiesschoolportal.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.adapter.PendingHomeworkAdapter
import com.application.uifstechnologiesschoolportal.adapter.ReadingAdapter
import com.application.uifstechnologiesschoolportal.model.pendinghomeworkmodel
import com.application.uifstechnologiesschoolportal.model.readingmodel

    class ReadingFragment : Fragment() {

    lateinit var recyclerView : RecyclerView
    lateinit var llReading : RecyclerView.LayoutManager
    lateinit var recyclerAdapter: ReadingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reading, container, false)

        recyclerView = view.findViewById(R.id.recycler_reading)
        llReading = LinearLayoutManager(activity)
        val reading = arrayListOf<readingmodel>()

        reading.add(readingmodel("Physics"))
        reading.add(readingmodel("Mathematics"))

        recyclerAdapter = ReadingAdapter(activity as Context,reading)
        recyclerView.layoutManager = llReading
        recyclerView.adapter = recyclerAdapter

        return view
    }

}