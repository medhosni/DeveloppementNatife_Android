package tn.esprit.recyclerview4sim3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapater(val champList: List<Champion>) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =LayoutInflater.from(parent.context).inflate(R.layout.my_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return champList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    holder.post.text = champList[position].post
        holder.nameChamp.text = champList[position].nameChapion
        holder.imaChamp.setImageResource(champList[position].img)



    }
}