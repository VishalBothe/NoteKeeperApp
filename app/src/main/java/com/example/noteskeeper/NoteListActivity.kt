package com.example.noteskeeper

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }

        val list_notes = findViewById<ListView>(R.id.list_notes)
        list_notes.adapter =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, DataManager.notes)

        list_notes.setOnItemClickListener { parent, view, position, id ->
            val activityIntent = Intent(this, MainActivity::class.java)
            activityIntent.putExtra("EXTRA_NOTE_POSITION", position)
            startActivity(activityIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        val list_notes = findViewById<ListView>(R.id.list_notes)
        (list_notes.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}
