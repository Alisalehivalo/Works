package ir.airport.androidworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMenu.setOnClickListener(View.OnClickListener { drawerLayout.openDrawer(GravityCompat.START) })
        about.setOnClickListener(View.OnClickListener { val intent:Intent= Intent(this,AboutActivity::class.java)
                                                          startActivity(intent)})
    }
}