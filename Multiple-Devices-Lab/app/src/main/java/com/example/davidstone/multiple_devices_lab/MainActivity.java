package com.example.davidstone.multiple_devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    ImageView icon;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textview = (TextView) findViewById(R.id.textview);
        textview.setText(R.string.text1);

        final ImageView icon = (ImageView) findViewById(R.id.icon);
        icon.setImageResource(R.drawable.ic_live_help_black_40dp);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                textview.setText(R.string.text2);
                icon.setImageResource(R.drawable.ic_insert_emoticon_black_40dp);

            }

        });
    }


}
