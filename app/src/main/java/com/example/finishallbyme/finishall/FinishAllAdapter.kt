package com.example.finishallbyme.finishall

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finishallbyme.R

class FinishAllAdapter(private val list:ArrayList<finishData>)
    : RecyclerView.Adapter<FinishAllAdapter.MyViewHolder>() {
  class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

      val finishTextTwo=itemView.findViewById<TextView>(R.id.finish_text_two)
  }



    override fun getItemCount(): Int {
       return list.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

       holder.finishTextTwo.text=list.get(position).textFinish
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_finish_all,parent,false)
        return MyViewHolder(view)
    }

}