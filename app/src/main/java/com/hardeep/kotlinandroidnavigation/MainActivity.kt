package com.hardeep.kotlinandroidnavigation

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mainFrame()
        setContentView(R.layout.activity_main)
        Handler().postDelayed({

            // Start activity
            startActivity(Intent(this,HomeActivity::class.java))

            // Animate the loading of new activity
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)

            //close this activity
            finish()

        },2000)
    }

    private fun mainFrame(){
        //Remove Title
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        //Make FullScreen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)

        //Hide the toolbar
        supportActionBar?.hide()

    }
}
