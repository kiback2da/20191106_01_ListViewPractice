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

        var mList = mList.get(position)
        var title = row?.findViewById<TextView>(R.id.noticeTitle)
        var content = row?.findViewById<TextView>(R.id.noticeContent)
        var date = row?.findViewById<TextView>(R.id.noticeDate)

        title?.text = mList.dTitle
        content?.text = mList.dContent
        date?.text = mList.dDate

        return row
    }

    constructor(context: Context, list: ArrayList<NoticeDatas>) : this(context, R.layout.notice_list_item,list)


}