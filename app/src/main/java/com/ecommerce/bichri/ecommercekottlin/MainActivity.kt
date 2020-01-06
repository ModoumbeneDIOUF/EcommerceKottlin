package com.ecommerce.bichri.ecommercekottlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.util.Log.d
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import com.ecommerce.bichri.ecommercekottlin.Adapter.ProductAdapter
import com.ecommerce.bichri.ecommercekottlin.Model.Product

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navigationView.setNavigationItemSelectedListener {

                when(it.itemId){
                    R.id.actionJeans ->d("dd","")
                }
                it.isChecked = true
                drawerLayout.closeDrawers()
                true
        }
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        }
        val products = arrayListOf<Product>()
        for(i in 0..10){
            products.add(Product("prod","http://via.placeholder.com/325/ffff00/ff0000",3.2))
        }
        recycle_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity,2)
            adapter = ProductAdapter(products)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        drawerLayout.openDrawer(GravityCompat.START)
        return true
        //return super.onOptionsItemSelected(item)
    }


}
