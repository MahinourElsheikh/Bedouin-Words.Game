package com.example.mahinour.bedouins;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView step1 = (ImageView)findViewById(R.id.step1);
        step1.setAlpha(0.5f);
        ImageView step2 = (ImageView)findViewById(R.id.step2);
        step2.setAlpha(0.5f);
        ImageView step3 = (ImageView)findViewById(R.id.step3);
        step3.setAlpha(0.5f);
        ImageView step4 = (ImageView)findViewById(R.id.step4);
        step4.setAlpha(0.5f);
        ImageView step5 = (ImageView)findViewById(R.id.step5);
        step5.setAlpha(0.5f);
        ImageView step6 = (ImageView)findViewById(R.id.step6);
        step6.setAlpha(0.5f);
        ImageView step7 = (ImageView)findViewById(R.id.step7);
        step7.setAlpha(0.5f);
        ImageView step8 = (ImageView)findViewById(R.id.step8);
        step8.setAlpha(0.5f);
        ImageView step9 = (ImageView)findViewById(R.id.step9);
        step9.setAlpha(0.5f);
        //ImageView step10 = (ImageView)findViewById(R.id.step10);
       // step10.setAlpha(0.5f);
    }
    public void enterlevel1(View view) {

       startActivity(new Intent(Main3Activity.this, Main4Activity.class));


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
                        finish();  System.exit(0);
                    }

                })
                .setNegativeButton("لا", null)
                .show();
    }
}
