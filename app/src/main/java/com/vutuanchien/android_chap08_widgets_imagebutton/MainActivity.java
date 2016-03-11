package com.vutuanchien.android_chap08_widgets_imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton ibtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usingImageButton();
    }

    public void usingImageButton() {

        ibtnClick = (ImageButton) findViewById(R.id.ibtnClick);

        ibtnClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "ImageButton Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        ibtnClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "ImageButton Long Clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
