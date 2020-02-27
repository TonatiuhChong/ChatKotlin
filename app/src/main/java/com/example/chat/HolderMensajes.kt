package com.example.chat

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import de.hdodenhof.circleimageview.CircleImageView

class HolderMensajes(itemView: View) : ViewHolder(itemView) {
    var nombre: TextView
    var mensaje: TextView
    var hora: TextView
    var fotoMensajes: CircleImageView

    init {
        nombre = itemView.findViewById<View>(R.id.MensajeUsername) as TextView
        mensaje = itemView.findViewById<View>(R.id.MensajeTexto) as TextView
        hora = itemView.findViewById<View>(R.id.MensajeTiempo) as TextView
        fotoMensajes =
            itemView.findViewById<View>(R.id.MensajefotoPerfil) as CircleImageView
    }
}