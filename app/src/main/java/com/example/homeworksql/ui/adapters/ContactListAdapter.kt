package com.example.homeworksql.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworksql.R
import com.example.homeworksql.models.Contact
import com.example.homeworksql.ui.adapters.viewholders.ContactViewHolder

class ContactListAdapter(private val onClick: (contact: Contact) -> Unit, private val onLongClick: (contact: Contact) -> Unit) :
    RecyclerView.Adapter<ContactViewHolder>() {
    private var contactDataList = emptyList<Contact>()
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ContactViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.item_list_contact, p0, false)
        return ContactViewHolder(view = view, onClick = onClick, onLongClick = onLongClick)
    }

    override fun getItemCount(): Int {
        return contactDataList.size
    }

    override fun onBindViewHolder(viewholder: ContactViewHolder, position: Int) {
        viewholder.setData(contactDataList[position])
    }

    fun setContactList(contactList: List<Contact>) {
        this.contactDataList = contactList
        notifyDataSetChanged()
    }
}