package com.example.chat

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class MainActivity : AppCompatActivity() {
    private val foto: CircleImageView? = findViewById(R.id.FotoPerfil);
    private val username: TextView?=findViewById(R.id.UserName);
    private val mensajes: RecyclerView? = findViewById(R.id.RecyclerText)
    private val txtmensaje: EditText? = findViewById(R.id.PrevMessage)
    private val Enviar: Button? = findViewById(R.id.ButtonSend)
    private var adapter:AdapterMensaje = TODO();


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter= AdapterMensaje(this)
        LinearLayoutManager

    }
}
