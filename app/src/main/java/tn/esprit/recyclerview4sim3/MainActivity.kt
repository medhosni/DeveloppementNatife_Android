package tn.esprit.recyclerview4sim3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val list = ArrayList<Champion>()
            list.add(Champion("Ashe", R.drawable.ic_ashe, "ADC"))
            list.add(Champion("annie", R.drawable.ic_annie, "MID"))
            list.add(Champion("BLITZ", R.drawable.ic_blitzcrank, "SUPPORT"))
            list.add(Champion("THRESH", R.drawable.ic_thresh, "TOP"))
            list.add(Champion("NASUS", R.drawable.ic_nasus, "JUNGLE"))
            list.add(Champion("LEE SIN", R.drawable.ic_leesin, "TOP"))
            list.add(Champion("EKKO", R.drawable.ic_ekko, "MID"))
        recyclerView.adapter = MyAdapater(list)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL  a,false)

    }
}