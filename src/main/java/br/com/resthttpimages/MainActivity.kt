package br.com.resthttpimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {

    var img : String? = null

//    Armaznamento os links consumidos pelo webservice
    val linksDasImagens = arrayOf("","","","","","","","","","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
//      Inicialização da classe que realiza a conexão
            for (i in linksDasImagens.indices){
                val http = HttpService()
                img = http.toString()

//                Inicialização da coleção de links que exibem as magens dos gatos
                linksDasImagens[i-1] = img!!
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

/*
    val linkPadrao = "https://imgur.com/a/"

    var img1 = "GccaRva"
    var img2 = "ONNq8xA"

    var linkexibido = "linkPadrao${img1}"
    var linkexibido = "linkPadrao${img2}"
*/

