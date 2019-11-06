package com.tjoeun.a20191106_01_listviewpractice.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.a20191106_01_listviewpractice.Data.NoticeDatas
import com.tjoeun.a20191106_01_listviewpractice.R

class NoticeAdapter(context:Context,res:Int,list:ArrayList<NoticeDatas>)
    : ArrayAdapter<NoticeDatas>(context,R.layout.notice_list_item,list){

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.notice_list_item,null)
        }

        //tempRow가 null인 경우를 대비했으니 row에 tempRow는 절대 null 아니라고 하면서 대입
        var row = tempRow!!

        //근거 데이터 변수 추출
        var data = mList.get(position)

        //각 줄에서 데이터를 추출
        var title = row.findViewById<TextView>(R.id.noticeTitle)
        var content = row.findViewById<TextView>(R.id.noticeContent)
        var date = row.findViewById<TextView>(R.id.noticeDate)

        title.text = data.dTitle
        content.text = data.dContent
        date.text = data.dDate

        return row
    }

    constructor(context: Context, list: ArrayList<NoticeDatas>) : this(context, R.layout.notice_list_item,list)


}