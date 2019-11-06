package com.tjoeun.a20191106_01_listviewpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.tjoeun.a20191106_01_listviewpractice.Adapter.NoticeAdapter
import com.tjoeun.a20191106_01_listviewpractice.Data.NoticeDatas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var noticeArrayList = ArrayList<NoticeDatas>()
    var adapter:NoticeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotice()

        adapter = NoticeAdapter(this,noticeArrayList)
        noticeListView.adapter = adapter

        noticeListView.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this, "${position}째 줄을 클릭했다, ${noticeArrayList.get(position).dTitle}", Toast.LENGTH_SHORT).show()

            var noticeData = noticeArrayList.get(position)
            var intent = Intent(this, NoticeDetailActivity::class.java)
            intent.putExtra("list",noticeData)
            startActivity(intent)
        }

        noticeListView.setOnItemLongClickListener { parent, view, position, id ->
            Toast.makeText(this, "${position}째 줄을 길게 클릭했다, \n ${noticeArrayList.get(position).dTitle}", Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener true
        }
    }

    fun addNotice(){
        noticeArrayList.add(NoticeDatas("1번 공지","2019-11-01","1번 내용"))
        noticeArrayList.add(NoticeDatas("2번 공지","2019-11-01","2번 내용"))
        noticeArrayList.add(NoticeDatas("3번 공지","2019-10-01","3번 내용"))
        noticeArrayList.add(NoticeDatas("4번 공지","2019-01-01","4번 내용"))
        noticeArrayList.add(NoticeDatas("5번 공지","2019-03-01","5번 내용"))
        noticeArrayList.add(NoticeDatas("6번 공지","2019-04-01","6번 내용"))
        noticeArrayList.add(NoticeDatas("7번 공지","2019-09-01","7번 내용"))
        noticeArrayList.add(NoticeDatas("8번 공지","2019-06-01","8번 내용"))
        noticeArrayList.add(NoticeDatas("9번 공지","2019-03-01","9번 내용"))
        noticeArrayList.add(NoticeDatas("10번 공지","2019-01-01","10번 내용"))
    }
}
