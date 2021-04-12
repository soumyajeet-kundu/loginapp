package com.example.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        logout_btn.setOnClickListener {
            var intentHere = Intent(this,MainActivity::class.java)

            startActivity(intentHere)
        }

        var myrv = findViewById<RecyclerView>(R.id.myrecyclerview)

        myrv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        var myDatalist = ArrayList<UsersList>()

        myDatalist.add(UsersList("Soumyajeet","soumya@g.com","836606546"))
        myDatalist.add(UsersList("Arvind","arvind@yahoo.com","766565462"))


        myrv.adapter = AdapterUser(myDatalist)
    }
}