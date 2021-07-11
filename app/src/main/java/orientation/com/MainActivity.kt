package orientation.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var name:TextView
    private lateinit var age:TextView
    private lateinit var email:TextView
    private lateinit var nation:Spinner
    private lateinit var phoneNumber:TextView
    private lateinit var gender:Spinner
    private lateinit var password:TextView
    private lateinit var signUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name=findViewById(R.id.tvName)
        age=findViewById(R.id.tvAge)
        email=findViewById(R.id.tvEmail)
        nation=findViewById(R.id.spNationality)
        phoneNumber=findViewById(R.id.tvPhone)
        gender=findViewById(R.id.spGender)
        password=findViewById(R.id.tvPassword)
        signUp=findViewById(R.id.btnSign)
        spinner()
        signUp.setOnClickListener {
            if(name.text.isEmpty()){
                name.setError("Fill in all fields")
            }
            if(age.text.isEmpty()){
                age.setError("Fill in all fields")
            }
            if(email.text.isEmpty()){
                email.setError("Fill in all fields")
            }
            if(phoneNumber.text.isEmpty()){
                phoneNumber.setError("Fill in all fields")
            }
            if(password.text.isEmpty()){
                password.setError("Fill in all fields")
            }else {
                val intent = Intent(baseContext, LogIn::class.java)
                startActivity(intent)
            }
        }
    }
    fun spinner(){
        val genders= arrayOf("Female","Male","Binary","Other")
        val adapter=ArrayAdapter(baseContext, android.R.layout.simple_spinner_item,genders)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.adapter=adapter
        val nationality= arrayOf("Kenyan","Ugandan","Rwandan","South Sudan","Tanzanian")
        val adapter2=ArrayAdapter(baseContext, android.R.layout.simple_spinner_item,nationality)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        nation.adapter=adapter2
    }
}