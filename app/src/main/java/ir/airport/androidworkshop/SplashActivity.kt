package ir.airport.androidworkshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.logging.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
       Glide.with(this).load(R.drawable.rotating).into(splashImg)

            }
    fun nextActivity(view: View){
        val intent=Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}