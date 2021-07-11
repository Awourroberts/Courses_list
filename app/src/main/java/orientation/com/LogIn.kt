package orientation.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogIn : AppCompatActivity() {
    private lateinit var email2:TextView
    private lateinit var password2:TextView
    private lateinit var logIn: Button
    private lateinit var signUp2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        email2=findViewById(R.id.tvEmail2)
        password2=findViewById(R.id.tvPassword2)
        logIn=findViewById(R.id.btnLog)
        signUp2=findViewById(R.id.btnSign2)
        logIn.setOnClickListener {
            if(email2.text.isEmpty()){
                email2.setError("Fill in all fields")
            }
            if(password2.text.isEmpty()){
                password2.setError("fill in all fields")
            }else{
                val intent=Intent(baseContext, Courses::class.java)
                startActivity(intent)
            }
        }
        signUp2.setOnClickListener {
            val intent2=Intent(baseContext,MainActivity::class.java)
            startActivity(intent2)
        }
    }
}