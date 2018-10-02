package babenkovladimir.com.alextest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alexButton.setOnClickListener {
            Toast.makeText(this, "Hellow Alex!!!", Toast.LENGTH_LONG).show()
        }
    }
}
