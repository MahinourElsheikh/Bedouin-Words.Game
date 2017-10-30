package com.example.mahinour.bedouins;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by mahin on 10/9/2017.
 */

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton nextButton = (ImageButton)findViewById(R.id.nextButton);
        nextButton.setAlpha(0.8f);
    }
    public void enterlevel(View view) {
        startActivity(new Intent(Main2Activity.this, Main3Activity.class));
        finish();

    }
    public void PressX(View view) {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("إغلاق اللعبة")
                .setMessage("هل أنت متأكد من إغلاق اللعبة؟")
                .setPositiveButton("نعم", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }

                })
                .setNegativeButton("لا", null)
                .show();
    }

}

