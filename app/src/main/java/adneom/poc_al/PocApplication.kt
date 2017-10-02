package adneom.poc_al

import android.app.Application
import dagger.internal.DaggerCollections

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

class PocApplication : Application() {

    companion object{
        @JvmStatic lateinit var component : PocComponent
    }

    override fun onCreate() {
        super.onCreate()

    }
}