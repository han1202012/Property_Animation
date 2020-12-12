package kim.hsl.animator

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView.setText("MainActivity")

        // 设置 0 到 360 之间的动画值
        ValueAnimator.ofFloat(0F, 360F).apply {
            // 设置动画持续时间
            duration = 2000

            addUpdateListener {
                //textView.ro
                textView
            }

        }


    }
}