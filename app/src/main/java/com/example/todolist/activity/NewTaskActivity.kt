package com.example.todolist.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.R

class NewTaskActivity: AppCompatActivity() {

    private lateinit var editTaskView: EditText
    private lateinit var editDescriptionView: EditText
    private lateinit var editRequestedView: EditText
    private lateinit var editAssigneeView: EditText
    private lateinit var editDateView: EditText
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newtask_activity)
        editTaskView = findViewById(R.id.task)
        editDescriptionView = findViewById(R.id.description)
        editRequestedView = findViewById(R.id.requested)
        editAssigneeView = findViewById(R.id.assignee)
        editDateView = findViewById(R.id.date)

        val button = findViewById<Button>(R.id.btnTask)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editTaskView.text) && TextUtils.isEmpty(editDescriptionView.text) && TextUtils.isEmpty(editRequestedView.text) && TextUtils.isEmpty(editAssigneeView.text) && TextUtils.isEmpty(editDateView.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val task = editTaskView.text.toString()
                val description = editDescriptionView.text.toString()
                val requested = editRequestedView.text.toString()
                val assignee = editAssigneeView.text.toString()
                val date = editDateView.text.toString()
                replyIntent.putExtra("EXTRA_TASK", task)
                replyIntent.putExtra("EXTRA_DESCRIPTION", description)
                replyIntent.putExtra("EXTRA_REQUESTED", requested)
                replyIntent.putExtra("EXTRA_ASSIGNEE", assignee)
                replyIntent.putExtra("EXTRA_DATE", date)
                setResult(Activity.RESULT_OK, replyIntent)
            }
            finish()
        }
    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }
}