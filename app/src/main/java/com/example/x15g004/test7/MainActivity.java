package com.example.x15g004.test7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //インスタンスの取得
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        //イベントの設定
        b1.setOnClickListener(this);
        b1.setOnClickListener(this);
        b1.setOnClickListener(this);
        b1.setOnClickListener(this);

        //クラスのプロパティにする
        mTextView = (TextView)findViewById(R.id.textView3);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b1)
            mTextView.setText("ボタン1が押されました");
        else if(v.getId() == R.id.b2)
            mTextView.setText("ボタン2が押されました");
        else if(v.getId() == R.id.b3)
            mTextView.setText("ボタン３がおされました");
        else if(v.getId() == R.id.b4)
            mTextView.setText("ボタン４がおされました");
            mTextView.setText("ボタン４がおされました");
    }
}
