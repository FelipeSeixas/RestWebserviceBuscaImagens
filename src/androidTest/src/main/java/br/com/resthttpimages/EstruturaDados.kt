package br.com.resthttpimages

 class EstruturaDados(get: String) {

    private var icone : Int? = null
    private var idWebService : String? = null

    fun getIdWebservice() : String? {
        return idWebService
    }

    fun setIdWebservice(novoId : String) : Unit {
        idWebService = novoId
    }

    fun getIcone(): Int? {
        return icone
    }
    fun setIcone(novoIcone: Int): Unit {
        icone = novoIcone
    }
}
