package hu.ait.aitsimplecalculator

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//import android.widget.Toast
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import hu.ait.aitsimplecalculator.databinding.ActivityMainBinding
//import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener() {
            add()
        }

        binding.buttonSubtract.setOnClickListener() {
            subtract()
        }
    }

    fun add() {
        val num1 = binding.editText1.text.toString().toFloat()
        val num2 = binding.editText2.text.toString().toFloat()
        val res = num1 + num2
        val result = findViewById<TextView>(R.id.result)
        result.text = "Answer: $res"
    }
    fun subtract() {
        val num1 = binding.editText1.text.toString().toFloat()
        val num2 = binding.editText2.text.toString().toFloat()
        val res = num1 - num2
        val result = findViewById<TextView>(R.id.result)
        result.text = "Answer: $res"
    }
}