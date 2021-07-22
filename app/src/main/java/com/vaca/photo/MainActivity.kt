package com.vaca.photo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mDatas= arrayListOf<String>()
        val imageUri=MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val cursor=contentResolver.query(imageUri,null,MediaStore.Images.Media.MIME_TYPE + "=? or " + MediaStore.Images.Media.MIME_TYPE + "=?",
            arrayOf("image/jpeg", "image/png"),MediaStore.Images.Media.DATE_MODIFIED)
        while (cursor!!.moveToNext()){
            val path=cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA))
            mDatas.add(path)
        }
        cursor.close()
        Log.e("fuck",mDatas.size.toString())
    }
}