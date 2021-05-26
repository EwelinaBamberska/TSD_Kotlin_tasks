package com.example.excellent_tsd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_name_button.setOnClickListener {
            if (name_text_view.visibility == View.VISIBLE) name_text_view.visibility =
                View.INVISIBLE else name_text_view.visibility = View.VISIBLE
        }
    }


}