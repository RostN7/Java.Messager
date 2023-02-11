package com.example.messager

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var editTextMsg: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextMsg = findViewById(R.id.editText)
    }

    fun onClickSendMsg(view: View?) {
        val msg = editTextMsg!!.text.toString()
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, msg)
        val chosenIntent = Intent.createChooser(intent, getString(R.string.chooser_title))
        startActivity(chosenIntent)
    }
}