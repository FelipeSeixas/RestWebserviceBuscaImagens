package br.com.resthttpimages

import com.google.gson.Gson
import java.io.IOException
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*

open class HttpService {

    private lateinit var idImage: String

    //    Construtor - Recebe apenas a numeração do cep digitado na classe Main, em formato de string.
    open fun HttpService() {

    }

    @Override
    fun doInBackground(vararg voids: Void): EstruturaViews {
        val resposta = StringBuilder()

//        Validação do cep: vazio ou quantidade de cracteres desejados
        try {
//                Declaração da URL e armazenamento do endPoint
            val url = URL("https://api.imgur.com/3/gallery/search/?q=cat")

//                Abertura/Início da conexão
            val connection = url.openConnection() as HttpURLConnection

//                Características da comunicação (verbo HTTP)
            connection.requestMethod = "GET"
            connection.setRequestProperty("Content-type", "application/json")
            connection.setRequestProperty("Accept", "application/json")

//            Informação sobre a chave de autorização
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
        return Gson().fromJson(resposta.toString(), EstruturaViews::class.java)
    }
}