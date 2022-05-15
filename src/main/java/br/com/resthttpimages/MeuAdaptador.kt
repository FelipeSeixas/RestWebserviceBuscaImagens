package br.com.resthttpimages

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView

class MeuAdaptador(context: Context, resource: Int) : ArrayAdapter<Any?>(context, resource) {
    override fun add(`object`: Any?) {
        super.add(`object`)
    }

    override fun getCount(): Int {
        return super.getCount()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var minhaView: View
        minhaView = convertView!!
        val estruturaViews: EstruturaViews
        if (convertView == null) {
            val inflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            minhaView = inflater.inflate(R.layout.activity_main, parent, false)
            estruturaViews = EstruturaViews()
            estruturaViews.icone = minhaView.findViewById<View>(R.id.meuicone) as ImageView

//           estruturaViews.whatsApp = (ImageView) minhaView.findViewById(R.id.imageWhatsApp);
            minhaView.tag = estruturaViews
        } else {
            estruturaViews = minhaView.tag as EstruturaViews
        }
        val estruturaDados: EstruturaDados?
        estruturaDados = getItem(position) as EstruturaDados?
        if (estruturaDados != null) {
            estruturaViews.icone?.setImageResource(estruturaDados.getIcone())
        }

        // estruturaViews.whatsApp.setImageResource(estruturaDados.getLinkWhatsapp());
        return minhaView
    }
}