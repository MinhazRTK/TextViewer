package com.batch2.m0nk3y.textviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtView = findViewById(R.id.tv_main);
        final EditText etView = findViewById(R.id.et_main);
        Button button = findViewById(R.id.btn_apply_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etView.getText().toString();
                txtView.setText("Hello "+name+"!");
            }
        });


    }
}
