package com.adlaneould.todo.tasklist

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adlaneould.todo.R
import java.util.ArrayList


class TaskListAdapter(private val taskList: ArrayList<String>?) : RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>(), Parcelable {

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(taskTitle: ArrayList<String>?) {
            itemView.apply { // `apply {}` permet d'éviter de répéter `itemView.*`
                // TODO: afficher les données et attacher les listeners aux différentes vues de notre [itemView]
            }
        }
    }

    constructor(parcel: Parcel) : this(parcel.createStringArrayList()) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListAdapter.TaskViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TaskListAdapter.TaskViewHolder, position: Int) {
        holder.bind(taskList[position])
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringList(taskList)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TaskListAdapter> {
        override fun createFromParcel(parcel: Parcel): TaskListAdapter {
            return TaskListAdapter(parcel)
        }

        override fun newArray(size: Int): Array<TaskListAdapter?> {
            return arrayOfNulls(size)
        }
    }

}
