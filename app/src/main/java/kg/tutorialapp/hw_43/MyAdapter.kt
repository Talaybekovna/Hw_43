package kg.tutorialapp.hw_43

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var todos: List<Todo>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        return holder.bind(todos[position])
    }

    override fun getItemCount() : Int {
        return todos.count()
    }
}