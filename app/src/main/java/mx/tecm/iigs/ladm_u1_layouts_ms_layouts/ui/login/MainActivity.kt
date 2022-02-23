package mx.tecm.iigs.ladm_u1_layouts_ms_layouts.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mx.tecm.iigs.ladm_u1_layouts_ms_layouts.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        siguiente.setOnClickListener {
            llamarVentana()
        }

        salir.setOnClickListener {
            finish()
        }


    }
    fun llamarVentana(){
        val otraventana=Intent(this,FullscreenActivity::class.java)
        startActivity(otraventana)
    }

}