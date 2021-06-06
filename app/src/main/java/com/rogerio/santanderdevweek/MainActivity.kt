package com.rogerio.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater
        inflate.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item_1 -> {
                Log.d( "CLICK", "Clicou no item 1")
                true
            }
            R.id.item_2 -> {
                Log.d( "CLICK", "Item 2 selecionado com sucesso!!")
                true
            }
             R.id.item_3 -> {
                Log.d( "CLICK", " Acionado pelo ícone!!")
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}