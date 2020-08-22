package can.co.id.cobarecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_hewan.*

class DetailHewanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hewan)

        //menerima data image hewan dari intent
        val image = intent.getIntExtra("image", 0)

        //menerima data nama hewan dari intent
        val nama = intent.getStringExtra("nama") ?: ""

        detail_img_hewan.setImageResource(image)
        detail_tv_nama.text = nama
    }
}