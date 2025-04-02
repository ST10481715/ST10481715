package za.co.varsitycollege.st10481715.st10481715

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editText= findViewById<EditText>(R.id.EditText)
        val ProcessButton=findViewById<Button>(R.id.ProcessButton)
        val Resetbutton=findViewById<Button>(R.id.ResetButton)
        val display=findViewById<TextView>(R.id.Display)


        // the meals of the menu
        val morning ="cereal,eggs,avocado toast"
        val lunch ="egg salad sandwich"
        val dinner = "spaghett,rice and chicken"
        ProcessButton.setOnClickListener {
           if (editText.text.toString()=="mornigng"){
               display.text="${morning}"}
            else if(editText.text.toString()=="lunch"){
                display.text="${lunch}"}
           else{ editText.text.toString()=="dinner"
               display.text="${dinner}"
           }
           }
       }
        
        

}
