package com.ts.alex.fortest

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.ts.alex.fortest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.buttonShow.setOnClickListener{
//
//        }
//
//        binding.vCheckbox.setTextColor(ColorStateList.valueOf(Color.GREEN))
//
//        binding.vCheckbox.isEnabled = true
//        val drawable = ContextCompat.getDrawable(this, R.drawable.ic_get_app_24)
//        binding.vEditText.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null)

    }
}