package com.exercicisgokyle.uf1_pelisproyecto0

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.exercicisgokyle.uf1_pelisproyecto0.core.constants
import com.exercicisgokyle.uf1_pelisproyecto0.models.PeliculaModel

class AdapterPeliculas (
    val context: Context,
    val listaPeliculas: List<PeliculaModel>
): RecyclerView.Adapter<AdapterPeliculas.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cvPelicula = itemView.findViewById(R.id.cv_cartelPelicula) as CardView
        val ivCartel = itemView.findViewById(R.id.img_cartel) as ImageView
        val tvtitulo = itemView.findViewById(R.id.titulo_peli) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.item_rv_pelicula, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pelicula = listaPeliculas[position]

        Glide
            .with(context)
            .load("${constants.IMG_URL}${pelicula.cartel}")
            .placeholder(R.drawable.placeholder_image)
            .into(holder.ivCartel)

        holder.tvtitulo.text = pelicula.nombrePelicula

    }

    override fun getItemCount(): Int {
        return listaPeliculas.size
    }

}