package com.example.exemplodesegundatela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class segundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
        //criando variavel para poder renomear a actionBar padrão
        val actionBar = supportActionBar

        /** para poder renomear a actionBar é preciso definir que esta não é null utilizando
         * o operador de safe call !! e chamando o atributo .title para assim depois poder
         * atribuir a String desejada nele
         */
        actionBar!!.title = "Second Activity"

        /**
         * actionBar.setDisplayHomeAsUpEnabled(true)
         * é um metodo boolean utilizado para chamar o button na parte superior que serve para
         * chamar a tela anterior
         */
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}