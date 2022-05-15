package br.com.deliciasdorn

internal class EstruturaDados {

    private var icone : Int? = null
    private var idWebService : String? = null

    //            Construtores
    fun EstruturaDados(novoIcone: Int) {
        icone = novoIcone
    }

    fun EstruturaDados(novoId: String ) {
        idWebService = novoId
    }

    fun EstruturaDados(novoIcone: Int, novoId: String) {
        icone = novoIcone
        idWebService = novoId
    }

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
