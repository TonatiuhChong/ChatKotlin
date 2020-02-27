package com.example.chat

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class AdapterMensaje(private val context: Context) :
    RecyclerView.Adapter<HolderMensajes>() {
    private val mensaje: MutableList<Mensaje> = ArrayList()
    fun AddMensaje(m: Mensaje) {
        mensaje.add(m)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderMensajes {
        val v =
            LayoutInflater.from(context).inflate(R.layout.cardview, parent, false)
        return HolderMensajes(v)
    }

    override fun onBindViewHolder(holder: HolderMensajes, position: Int) {
        holder.nombre.text = mensaje[position].nombre
        holder.mensaje.text = mensaje[position].mensaje
        holder.hora.text = mensaje[position].hora
    }

    override fun getItemCount(): Int {
        return mensaje.size
    }

}