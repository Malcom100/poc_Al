package adneom.poc_al

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.io.OutputStream


/**
 * Created by gtshilombowanticale on 26-06-17.
 */


class MainActivity : AppCompatActivity(), View.OnClickListener{

    var UNINSTALL_REQUEST_CODE : Int = 1
    var app_pkg_name : String  = "adneom.poc_keyboard"
    var pkg_name : String  = "app-debug.apk"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btn_install_app.setOnClickListener(this)
        this.btn_merch.setOnClickListener(this)
        this.btn_site.setOnClickListener(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }


    override fun onClick(v: View?) {
        this.defaultColor()
        if (v != null) {
            when(v.id){
                this.btn_install_app.id -> {
                    selectButton(this.btn_install_app)
                    this.installApplicationKeyboard()
                }
                this.btn_merch.id -> {
                    selectButton(this.btn_merch)
                }
                this.btn_site.id -> {
                    selectButton(this.btn_site)
                }
            }
        }
    }

    private fun defaultColor() {
        this.btn_install_app.setTextColor(ContextCompat.getColor(this,R.color.btn_dash_text_default))
        this.btn_install_app.setBackgroundColor(ContextCompat.getColor(this,R.color.btn_dash_background_default))
        this.btn_merch.setBackgroundColor(ContextCompat.getColor(this,R.color.btn_dash_background_default))
        this.btn_merch.setTextColor(ContextCompat.getColor(this,R.color.btn_dash_text_default))
        this.btn_site.setTextColor(ContextCompat.getColor(this,R.color.btn_dash_text_default))
        this.btn_site.setBackgroundColor(ContextCompat.getColor(this,R.color.btn_dash_background_default))
    }

    private fun selectButton(btn : TextView) {
        btn.setTextColor(ContextCompat.getColor(this,R.color.btn_dash_text_selected))
        btn.setBackgroundColor(ContextCompat.getColor(this,R.color.btn_dash_background_selected))
        Log.i("Adneom",btn.text.toString()+" is selected ")
    }

    private fun installApplicationKeyboard(){
        /*val intent = Intent(Intent.ACTION_UNINSTALL_PACKAGE)
        intent.data = Uri.parse("package:" + app_pkg_name)
        intent.putExtra(Intent.EXTRA_RETURN_RESULT, true)
        startActivityForResult(intent, UNINSTALL_REQUEST_CODE)*/

        //This intent will help you to launch if the package is already installed
        /*val LaunchIntent = packageManager
                .getLaunchIntentForPackage(app_pkg_name)
        startActivity(LaunchIntent)*/

        /*val inputstream : InputStream = assets.open(pkg_name)
        var buffer : ByteArray = ByteArray(inputstream.available())
        inputstream.read(buffer)

        var file : File = assets ("application.apk")
        var outpustStream : OutputStream = FileOutputStream(file)
        outpustStream.write(buffer)

        inputstream.close()
        outpustStream.flush()
        outpustStream.close()

        Log.i("Adneom",Uri.fromFile(file).path)*/
    }
}