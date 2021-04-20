package com.adlaneould.todo.tasklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adlaneould.todo.R

class TaskListFragment : Fragment() {
    private val taskList = listOf(
            Task(id = "id_1", title = "Task 1", description = "description 1"),
            Task(id = "id_2", title = "Task 2"),
            Task(id = "id_3", title = "Task 3")
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_task_list, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = TaskListAdapter(taskList)
        super.onViewCreated(view, savedInstanceState)
    }
}
