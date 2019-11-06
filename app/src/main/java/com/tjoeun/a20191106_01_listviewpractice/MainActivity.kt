package com.tjoeun.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191106_01_listviewpractice.Data.NoticeDatas

class MainActivity : AppCompatActivity() {

    var listPractice = ArrayList<NoticeDatas>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotice()
    }

    fun addNotice(){

    }
}
