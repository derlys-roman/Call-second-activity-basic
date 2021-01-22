package com.example.exemplodesegundatela

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * variavel que da suporte para renomear a actionBar (linha superior da tela)
         *
         */
        val actionBar = supportActionBar

        /** para poder renomear a actionBar é preciso definir que esta não é null utilizando
         * o operador de safe call !! e chamando o atributo .title para assim depois poder
         * atribuir a String desejada nele
         */

        actionBar!!.title = "First Activity"
    }

    /**
     * função para chamada da segunda tela, utilizada no button (id: "secondActivityBtn")
     *
     */
    fun btnClick(view: View){
        /**
         * val of intent valor de intenção declarada para chamada da classe segunda tela,
         *
         */
        val callSecondScreen = Intent(this, segundaTela::class.java)
        //initialization of intent
        startActivity(callSecondScreen)

    }
}