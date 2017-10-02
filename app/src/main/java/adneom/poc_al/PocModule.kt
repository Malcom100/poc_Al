package adneom.poc_al

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

@Module
class PocModule(private val application : Application) {

    @Singleton
    @Provides
    fun providesContext() : Context{
        return this.application
    }
}