package com.ecommerce.bichri.ecommercekottlin

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.products_details.*

class ProductDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products_details)

        val  title = intent.getStringExtra("title")
        product_name.text = title

        availability.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("$title is in stock")
                .setPositiveButton("OK",object : DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, which: Int) {

                    }

                })
                .create()
                .show()
        }
    }
}