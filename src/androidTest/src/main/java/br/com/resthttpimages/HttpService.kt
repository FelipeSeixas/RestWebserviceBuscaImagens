package br.com.resthttpimages

import com.google.gson.Gson
import java.io.IOException
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*

open class HttpService (){

    private var idImage: String = ""

    //    Construtor secuário - Recebe uma possível id da imagem
    constructor(idImg: String) : this() {
        this.idImage = idImg
    }

    @Override
    fun  doInBackground(vararg voids: Void): EstruturaDados {
        val resposta = StringBuilder()

        try {
//                Declaração da URL e armazenamento do endPoint
            val url = URL("https://api.imgur.com/3/gallery/search/?q=cat")

//                Abertura/Início da conexão
            val connection = url.openConnection() as HttpURLConnection

//                Características da comunicação (HTTP)
            connection.requestMethod = "GET"
            connection.setRequestProperty("Content-type", "application/json")
            connection.setRequestProperty("Accept", "application/json")

//                Informação sobre a chave de autorização
            connection.setRequestProperty("Authorization", "Client-ID 1ceddedc03a5d71")

            connection.doOutput = true
            connection.connectTimeout = 5000
            connection.connect()
            val scanner = Scanner(url.openStream())
            while (scanner.hasNext()) {
                resposta.append(scanner.next())
            }
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return Gson().fromJson(resposta.toString(), EstruturaDados::class.java)
    }
}