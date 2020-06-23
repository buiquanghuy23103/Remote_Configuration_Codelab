package com.codelab.remoteconfiguration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRemoteConfig()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.refresh_config -> {
                fetchConfig()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initRemoteConfig() {

        // TODO: set up Remote Configuration service

        fetchConfig()
    }

    private fun fetchConfig() {
        // TODO: fetch and apply Remote Configuration parameters

    }

    private fun showErrorLog(errorMessage: String) {
        animation_view.visibility = View.GONE
        error_view.visibility = View.VISIBLE
        error_message.text = errorMessage
    }

    private fun hideErrorView() {
        animation_view.visibility = View.VISIBLE
        error_view.visibility = View.GONE
    }
}