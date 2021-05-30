package kg.tutorialapp.hw_43

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    companion object {
        fun create(parent: ViewGroup): MyViewHolder{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.my_viewholder, parent, false)
            return MyViewHolder(view)
        }
    }

    fun bind(item: Todo){
        itemView.run {
            val tv_todo = findViewById<TextView>(R.id.tv_todo)
            tv_todo.text = item.todoText
        }
    }
}