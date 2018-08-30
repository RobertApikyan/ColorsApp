package robertapikyan.com.colorsapp

import robertapikyan.com.lifecyclemvp.lifecycle.LifecyclePresenter

class ColorPresenter : LifecyclePresenter<ColorView>() {

    /**
     * Here we hold current display color
     */
    private var currentColor = -1

    override fun onCreate() {
        onColorViewClick()
    }

    /**
     * Restoring view color after rotation
     */
    override fun onViewAttach(){
        onColorChanged()
    }

    /**
     * this method called when user clicks on
     * color view
     */
    fun onColorViewClick() {
        currentColor = ColorGenerator.generateColor()
        onColorChanged()
    }

    /**
     * this method opens the view scope,
     * and define the viewAction
     */
    private fun onColorChanged() = view {
        setNewColor(currentColor)
    }
}