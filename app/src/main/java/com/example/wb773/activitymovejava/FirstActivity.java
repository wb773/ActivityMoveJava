package com.example.wb773.activitymovejava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //ボタンの取得
        Button button = findViewById(R.id.move_button);

        //クリックイベントの実装
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //SecondActivityへのIntentを作成
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                //画面遷移
                startActivity(intent);
            }
        });
    }
}
