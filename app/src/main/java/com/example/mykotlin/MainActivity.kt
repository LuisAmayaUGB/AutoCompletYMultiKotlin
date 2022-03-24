package com.example.mykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val languages = resources.getStringArray(R.array.Languages)
 val adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, languages)
         name_text_field.setAdapter(adapter)







        val countries = resources.getStringArray(R.array.Languages)
        // Create the adapter and set it to the MultiAutoCompleteTextView
        val adaptero = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        multiAutoCompleteTextView.setAdapter(adaptero)

        multiAutoCompleteTextView.threshold = 1
        multiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())









    }




    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menupal, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.uno -> {
                Toast.makeText(this,"Opción 1",Toast.LENGTH_LONG).show()
                 true
            }
            R.id.dos -> {
                Toast.makeText(this,"Opción 2",Toast.LENGTH_LONG).show()
                 true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }



}