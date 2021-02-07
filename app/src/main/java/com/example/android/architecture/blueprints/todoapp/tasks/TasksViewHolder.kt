package com.example.android.architecture.blueprints.todoapp.tasks

import android.content.Context
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.data.Task
import com.example.android.architecture.blueprints.todoapp.databinding.TaskItemBinding

class TasksViewHolder private constructor(val binding: TaskItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    companion object {
        fun from(parent: ViewGroup): TasksViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = TaskItemBinding.inflate(layoutInflater, parent, false)

            return TasksViewHolder(binding)
        }
    }
    val titleText: TextView = itemView.findViewById(R.id.title_text)
    val description: TextView = itemView.findViewById(R.id.description_text)
    fun bind(context: Context,task: Task){
        titleText.setText(task.title)
        if(task.description.isNotBlank())
            description.setText(task.description)
        else
            description.visibility=GONE
    }
}