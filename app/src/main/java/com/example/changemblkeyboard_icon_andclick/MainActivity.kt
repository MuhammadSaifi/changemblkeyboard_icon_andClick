package com.example.changemblkeyboard_icon_andclick

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for change the keyboard icon we have used the imeOption attribute in
        // our xml file. it deponds on previous state and next state of
        // edit text.
        // imeOption can be make able Done, Search, Go etc icon in mobile keyboard.

        val editText1 = findViewById<EditText>(R.id.edit_text1)
        val editText2 = findViewById<EditText>(R.id.edit_text2)
        editText1.setOnEditorActionListener(editorListener)
        editText2.setOnEditorActionListener(editorListener)
    }

    private val editorListener = TextView.OnEditorActionListener { v, actionId, event ->
        when (actionId) {
            EditorInfo.IME_ACTION_NEXT -> Toast.makeText(this@MainActivity, "Next", Toast.LENGTH_SHORT).show()
            EditorInfo.IME_ACTION_SEND -> Toast.makeText(this@MainActivity, "Send", Toast.LENGTH_SHORT).show()
        }
        false
    }
}
