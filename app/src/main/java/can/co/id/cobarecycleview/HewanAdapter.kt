package can.co.id.cobarecycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HewanAdapter(private var data: List<HewanModel>) : RecyclerView.Adapter<HewanHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HewanHolder {
        // memanggil layout yang akan di gunkan
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hewan, parent, false)
        return HewanHolder(view)
    }

    override fun getItemCount(): Int {

        //menambahkan jumlah yang akan di tampilkan pada recyclerview
        //kali ini menggunakan jumlah yang sama pada list hewan
        return  data.size
    }

    override fun onBindViewHolder(holder: HewanHolder, position: Int) {

        //nemabahkan data hewan ke setiap viewholdernya
        holder.setData(data[position])
    }
}