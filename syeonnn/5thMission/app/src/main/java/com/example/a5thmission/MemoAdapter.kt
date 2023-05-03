package com.example.a5thmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class MemoAdapter(val memoList: ArrayList<Memo>) : RecyclerView.Adapter<MemoAdapter.CustomViewHolder>()
{   //내부클래스임

    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int
    ): MemoAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: MemoAdapter.CustomViewHolder, position: Int) {
        holder.sents.text = memoList.get(position).sents
    }

    override fun getItemCount(): Int {
        return memoList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val sents = itemView.findViewById<TextView>(R.id.tv_memo)
    }

}