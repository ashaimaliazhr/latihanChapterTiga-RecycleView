package asha.binar.latihanchaptertiga_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text


class BookAdapter (private var listBook: ArrayList<MyData>)
    : RecyclerView.Adapter<BookAdapter.ViewHolder>() {

        //Class Holder
        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            var avatar :  ImageView = itemView.findViewById(R.id.tvAvatar)
            val judul : TextView = itemView.findViewById(R.id.tvJudul)
            val penulis : TextView = itemView.findViewById(R.id.tvPenulis)
        }

    //Membuat Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val data = listBook[position]
       holder.avatar.setImageResource(data.photoId)
       holder.judul.text = "${data.judul}"
       holder.penulis.text = "Penulis : ${data.penulis}"
    }

    fun setData(myData: List<MyData>) {
        listBook.clear()
        listBook.addAll(myData)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }



}