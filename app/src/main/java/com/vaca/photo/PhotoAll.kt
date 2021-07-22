package com.vaca.photo

import android.content.Context
import android.provider.MediaStore

object PhotoAll {
    fun getAllPhoto(context: Context):Array<String>{
        var mDatas= arrayOf<String>()
        val imageUri= MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        val cursor=context.contentResolver.query(imageUri,null,
            MediaStore.Images.Media.MIME_TYPE + "=? or " + MediaStore.Images.Media.MIME_TYPE + "=?",
            arrayOf("image/jpeg", "image/png"),
            MediaStore.Images.Media.DATE_MODIFIED)
        while (cursor!!.moveToNext()){
            val path=cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA))
            mDatas+=path
        }
        cursor.close()
        return mDatas
    }
}