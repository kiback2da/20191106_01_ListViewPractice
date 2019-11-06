package com.tjoeun.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191106_01_listviewpractice.Data.NoticeDatas
import kotlinx.android.synthetic.main.activity_notice_detail.*

class NoticeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_detail)

        var notice:NoticeDatas = intent.getSerializableExtra("list") as NoticeDatas

        detailTitleTxt.text = notice.dTitle
        detailContentTxt.text = notice.dContent
    }
}
