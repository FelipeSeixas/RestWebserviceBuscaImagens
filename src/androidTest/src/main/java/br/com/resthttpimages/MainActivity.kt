package br.com.resthttpimages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var linkPadrao = "https://imgur.com/a/"

    var img : String? = null

    //    Preparação para receber 10 Id´s consumidos via webservice
    val identImagens = arrayOf("", "", "", "", "", "", "", "", "", "")

    //    Preparação para receber 10 Id´s consumidos via webservice
    val linkDasImagens = arrayOf("", "", "", "", "", "", "", "", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
  //      Inicialização da classe responsável pela conexão http
            for (i in identImagens.indices){
                val http = HttpService()
                img = http.toString()

//       Inicialização da coleção de id´s (parte dos links) que exibem as magens dos gatos
                identImagens[i - 1] = img!!
                linkDasImagens[i - 1] = linkPadrao + "/" + identImagens[i - 1]
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        val meuAdaptador: MeuAdaptador
        meuAdaptador = MeuAdaptador(applicationContext, R.layout.meuGrid)

        var i = 0
        for (ident in identImagens) {
            var estruturaDados: EstruturaDados
            estruturaDados = EstruturaDados(linkDasImagens.get(i))
            meuAdaptador.add(estruturaDados)
            i++
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

