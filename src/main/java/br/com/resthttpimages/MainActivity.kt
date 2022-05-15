package br.com.resthttpimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var imageeem : String? = "teste"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      Conexão e inicialização da classe que realiza a conexão
        val http = HttpService()

    /*
        val linkPadrao = "https://imgur.com/a/"

        var img1 = "GccaRva"
        var img2 = "ONNq8xA"

        var linkexibido = "linkPadrao${img1}"
        var linkexibido = "linkPadrao${img2}"
*/
    }
}