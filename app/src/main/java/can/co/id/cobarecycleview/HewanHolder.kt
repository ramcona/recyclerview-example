package can.co.id.cobarecycleview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HewanHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //deklarasi widget id dari layout item_hewan.xml
    var tvNama: TextView = itemView.findViewById(R.id.ihewan_tv_nama)
    var imgHewan: ImageView = itemView.findViewById(R.id.ihewan_img_hewan)

    //fungsi untuk menambahkan data ke viewholder hewan
    fun setData(data:HewanModel){
        tvNama.text = data.nama
        imgHewan.setImageResource(data.image)
    }
}