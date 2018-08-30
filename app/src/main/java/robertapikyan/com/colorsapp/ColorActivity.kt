package robertapikyan.com.colorsapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import robertapikyan.com.lifecyclemvp.lifecycle.LifecycleMvp

class ColorActivity : AppCompatActivity(), ColorView {

    private val colorView by lazy { findViewById<View>(R.id.colorView) }

    private lateinit var presenter: ColorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        // Receive presenter instance
        presenter = LifecycleMvp.from(this, ::ColorPresenter)

        colorView.setOnClickListener {
            presenter.onColorViewClick()
        }
    }

    override fun setNewColor(color: Int) {
        colorView.setBackgroundColor(color)
    }
}
