package ir.airport.androidworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isEmpty
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        exitbtn.setOnClickListener(View.OnClickListener {
            finish()
            System.exit(0)
        })

        enterbtn.setOnClickListener(View.OnClickListener {

            if(isEmpty(useredit.text))
            {
                useredit.setError("نام کاربری را وارد نمایید!!!")

            }else  if(isEmpty(passedit.text))
            {
                passedit.setError("رمز عبور را وارد نمایید!!!")

            }else if(passedit.text.length< 6)
        {
            passedit.setError("رمز عبور حداقل باید 6 کاراکتر یا عدد باشد!!!")

        }else {
                val toast=Toast.makeText(this,"Login ...",Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        })
    }
}