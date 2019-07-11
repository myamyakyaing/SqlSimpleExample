package com.example.homeworksql.ui.adapters.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.homeworksql.models.Contact
import kotlinx.android.synthetic.main.activity_add_contact_detail.view.*
import kotlinx.android.synthetic.main.item_list_contact.view.*

class ContactViewHolder(
    private val view: View,
    private val onClick: (contact: Contact) -> Unit,
    private val onLongClick: (contact: Contact) -> Unit
) :
    RecyclerView.ViewHolder(view) {
    fun setData(contact: Contact) {
        view.apply {
            txtName.text = contact.name
            txtPhone.text = contact.phone
            txtAddress.text = contact.address
        }
        view.setOnClickListener { onClick(contact) }
        view.setOnLongClickListener {
            onLongClick(contact)
            true
        }
    }
}