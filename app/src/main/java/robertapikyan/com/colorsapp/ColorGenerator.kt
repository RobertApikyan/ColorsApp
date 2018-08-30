package robertapikyan.com.colorsapp

import android.graphics.Color
import java.util.*

/*
 * Created by Robert Apikyan on 8/29/2018.
 */

object ColorGenerator {


    fun generateColor(): Int {
        val random = Random()
        return Color.argb(135,
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256))
    }

}