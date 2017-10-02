package adneom.poc_al.splashscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import adneom.poc_al.R
import adneom.poc_al.MainActivity
import android.content.Intent
import android.os.Handler


class SplashScreen : AppCompatActivity() {

    // Splash screen timer
    private val SPLASH_TIME_OUT : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(Runnable /*
                     * Showing splash screen with a timer. This will be useful when you
                     * want to show case your app logo / company
                     */

        {
            // This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(i)

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }
}
