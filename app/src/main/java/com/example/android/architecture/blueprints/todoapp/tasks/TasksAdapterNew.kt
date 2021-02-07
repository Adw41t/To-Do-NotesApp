package com.example.android.architecture.blueprints.todoapp.tasks

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.architecture.blueprints.todoapp.data.Task

class TasksAdapterNew(private var list: List<Task>,val context: Context): RecyclerView.Adapter<TasksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasksViewHolder {
//        val view = LayoutInflater.from(context).inflate(R.layout.task_item,parent,false)
//        return TasksViewHolder(view)
        return TasksViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: TasksViewHolder, position: Int) {
        return holder.bind(context, list.get(position))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun updateList(list: List<Task>){
        this.list = list
        notifyDataSetChanged()
    }
}