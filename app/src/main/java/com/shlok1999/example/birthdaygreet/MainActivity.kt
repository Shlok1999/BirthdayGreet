package com.shlok1999.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun CreateBdayCard(view: View) {
        val name=nameInput.editableText.toString();

        Toast.makeText(this, "Happy Birthday $name", Toast.LENGTH_LONG).show()

        val intent=Intent(this, BirthdayCard::class.java)
        intent.putExtra(BirthdayCard.NAME_EXTRA,name)
        startActivity(intent)

    }


}
