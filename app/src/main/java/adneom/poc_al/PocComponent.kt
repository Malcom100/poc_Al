package adneom.poc_al

import android.content.Context
import dagger.Component
import javax.inject.Singleton

/**
 * Created by gtshilombowanticale on 27-06-17.
 */

@Singleton
@Component (modules = arrayOf(PocApplication::class))
interface PocComponent  {
    fun getContext() : Context
}