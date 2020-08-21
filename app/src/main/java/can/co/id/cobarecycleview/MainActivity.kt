package can.co.id.cobarecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val arrayHewan = listOf(HewanModel(nama = "Panda", image = R.drawable.panda),
        HewanModel(nama = "Gajah", image = R.drawable.gajah),
        HewanModel(nama = "Buaya", image = R.drawable.buaya),
        HewanModel(nama = "Kuda", image = R.drawable.kuda),
        HewanModel(nama = "Harimau", image = R.drawable.harimau))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //menambahkan tata letak pada recyclerview hewan
        main_recy_hewan.layoutManager = LinearLayoutManager(this)

        //menambahkan adapter pada recyclerview hewan
        main_recy_hewan.adapter = HewanAdapter(arrayHewan)
    }
}