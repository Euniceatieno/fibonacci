package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NUmbersRecyclerViewAdapter(var numbersList: List<BigInteger>): RecyclerView.Adapter<NumsViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumsViewHolder {
            var numView=
                LayoutInflater.from(parent.context).inflate(R.layout.number_list_item,parent,false)
            return NumsViewHolder(numView)
        }

        override fun onBindViewHolder(holder: NumsViewHolder, position: Int) {

            holder.tvnumbers.text=numbersList.get(position).toString()

        }

        override fun getItemCount(): Int {
            return numbersList.size
        }
    }
    class NumsViewHolder(val numView: View): RecyclerView.ViewHolder(numView){
        var tvnumbers=itemView.findViewById<TextView>(R.id.tvNumbers)

    }
