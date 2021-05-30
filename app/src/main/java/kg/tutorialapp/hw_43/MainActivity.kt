package kg.tutorialapp.hw_43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var et_todo: EditText
    private lateinit var btn_add: Button
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_todo = findViewById(R.id.et_todo)
        btn_add = findViewById(R.id.btn_add_todo)
        recyclerView = findViewById(R.id.recycler_view)

        setup()
    }

    private fun setup() {
        val todoList = mutableListOf<Todo>()

        val myAdapter = MyAdapter(todoList)
        recyclerView.adapter = myAdapter

        recyclerView.layoutManager = LinearLayoutManager(this)

        btn_add.setOnClickListener {
            val todoText = et_todo.text.toString()
            val todo = Todo(todoText)
            todoList.add(todo)
            myAdapter.notifyItemInserted(todoList.size - 1)
        }


    }
}