package com.vutuanchien.android_chap08_widgets_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    CheckBox chkMilk;
    CheckBox chkSuggar;
    RadioButton rbCoffee;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);
        chkMilk = (CheckBox) findViewById(R.id.chkMilk);
        chkSuggar = (CheckBox) findViewById(R.id.chkSuggar);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String content = "Your coffee is: ";
                // get selected radio button from radioGroup by getCheckedRadioButtonId
                int selectedId = radioGroup.getCheckedRadioButtonId();
                // using selectedId in order to know what we chose
                rbCoffee = (RadioButton) findViewById(selectedId);

                if (chkSuggar.isChecked()) {
                    content = content + chkSuggar.getText() + " ";
                }
                if (chkMilk.isChecked()) {
                    content = content + chkMilk.getText() + " ";
                }
                Toast.makeText(MainActivity.this, content + rbCoffee.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }
}
