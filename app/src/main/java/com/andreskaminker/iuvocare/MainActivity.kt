package com.andreskaminker.iuvocare

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var appBar: BottomAppBar
    lateinit var navController: NavController
    lateinit var barLayout: CoordinatorLayout
    lateinit var fabButton: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appBar = findViewById(R.id.bar)
        setSupportActionBar(appBar)
        barLayout = findViewById(R.id.bar_coordinator_layout)
        fabButton = findViewById(R.id.fab)
        navController = Navigation.findNavController(this, R.id.fragment)
        barLayout.visibility = View.GONE
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.top_app_bar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
            R.id.profile_opt -> {
                Log.d(TAG, "Fav menu item is clicked!")
            }
            R.id.fragmentHome -> {
                navController.navigate(R.id.fragmentHome)

            }
            R.id.history_opt -> {
                navController.navigate(R.id.calendarFragment)
                appBar.fab.setOnClickListener {
                    navController.navigate(R.id.addAppointmentFragment)
                }
            }
        }
        return true
    }
}