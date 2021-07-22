package com.vaca.photo


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.viatom.littlePu.R
import com.viatom.littlePu.ble.BleServer
import com.viatom.littlePu.er2Room.ER2data
import com.viatom.littlePu.fragment.ReportFragment.Companion.currentDate
import com.viatom.littlePu.fragment.ReportFragment.Companion.currentDetailPath
import com.viatom.littlePu.fragment.ReportFragment.Companion.currentEcgIndex
import com.viatom.littlePu.fragment.ReportFragment.Companion.currentSymptom
import com.viatom.littlePu.fragment.ReportFragment.Companion.ecgDataList
import com.viatom.littlePu.net.NetCmd
import com.viatom.littlePu.view.CustomSwipeLayout
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.util.*

class PhotoAdapter(
    val context: Context,
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ITEM = 0 //正常的Item

    private val TYPE_FOOT = 1 //尾部刷新

    var hasMore = false

    companion object {

    }

    private val mInflater: LayoutInflater = LayoutInflater.from(context)




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return EcgHolder(mInflater.inflate(R.layout.item_ecg, parent, false));
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }










    inner class EcgHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {



        init {



        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}