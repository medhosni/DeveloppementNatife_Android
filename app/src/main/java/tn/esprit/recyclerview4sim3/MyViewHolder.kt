package tn.esprit.recyclerview4sim3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val nameChamp = itemView.findViewById<TextView>(R.id.nameChamp)
    val imaChamp = itemView.findViewById<ImageView>(R.id.imgchamp)
    val post = itemView.findViewById<TextView>(R.id.post)


}