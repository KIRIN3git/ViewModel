package kirin3.jp.viewmodel

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // アクティビティに属するカウンター
        var counterA = 0

        // インスタンスを作成
        val viewModel: CountViewModel = ViewModelProviders.of(this).get(CountViewModel::class.java)

        val text1 = findViewById(R.id.text1) as TextView
        val text2 = findViewById(R.id.text2) as TextView

        val button = findViewById(R.id.button) as Button
        button.setOnClickListener {
            counterA++
            viewModel.counterB++

            text1.setText(counterA.toString())
            text2.setText(viewModel.counterB.toString())
        }

    }
}
