package tn.esprit.fragment4sim3

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val frag1 = findViewById<Button>(R.id.frag1)
        val frag2 = findViewById<Button>(R.id.frag2)
        val frag3 = findViewById<Button>(R.id.frag3)

        frag1.setOnClickListener {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView2,FragmentOne())
            .commit()
        }
        frag2.setOnClickListener {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView2,FragmentTwo())
            .commit()
        }
        frag3.setOnClickListener {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView2,FragmentThree())
            .commit()
        }



    }
}