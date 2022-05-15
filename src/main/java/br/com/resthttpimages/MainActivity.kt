package br.com.resthttpimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var imageeem : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//      Conexão e inicialização das variáveis que compõem o endereço completo
        val cep: CEP = HttpService(txtCep.getText().toString().trim { it <= ' ' }).execute().get()
        HttpService.doInBackgroud()

//        Id´s das imagens no site:

//        "link": "https://imgur.com/a/ONNq8xA",
//        https://imgur.com/a/GccaRva

        val linkPadrao = "https://imgur.com/a/"

        var img1 = "GccaRva"
        var img2 = "ONNq8xA"

        var linkexibido = linkPadrao + img1

    }
}