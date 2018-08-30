package robertapikyan.com.colorsapp

import robertapikyan.com.lifecyclemvp.lifecycle.LifecycleView

interface ColorView : LifecycleView {
    fun setNewColor(color: Int) // Set the color value as a view background
}