package com.example.rxkotlinretrofitexample.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rxkotlinretrofitexample.R
import com.example.rxkotlinretrofitexample.data.remote.response.UserData
import com.example.rxkotlinretrofitexample.utils.*
import kotlinx.android.synthetic.main.recycler_view_layout.view.*


class MyAdapter(private val userData: List<UserData>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = userData.size

    // Maybe I should of used Data Binding...
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.id.text = context.getString(R.string.id, userData.getId(position))
        holder.name.text = context.getString(R.string.name, userData.getName(position))
        holder.userName.text = context.getString(R.string.user_name, userData.getUserName(position))
        holder.email.text = context.getString(R.string.email, userData.getEmail(position))
        holder.phone.text = context.getString(R.string.phone_num, userData.getPhoneNumber(position))
        holder.website.text = context.getString(R.string.website, userData.getWebsite(position))
        holder.companyName.text = context.getString(R.string.company_name, userData.getCompanyName(position))
        holder.catchPhrase.text = context.getString(R.string.catch_phrase, userData.getCatchPhrase(position))
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val id: TextView = itemView.id_view
        val name: TextView = itemView.name_view
        val userName: TextView = itemView.user_name_view
        val email: TextView = itemView.email_view
        val phone: TextView = itemView.phone_view
        val website: TextView = itemView.website_view
        val companyName: TextView = itemView.company_name_view
        val catchPhrase: TextView = itemView.catch_phrase_view
    }
}