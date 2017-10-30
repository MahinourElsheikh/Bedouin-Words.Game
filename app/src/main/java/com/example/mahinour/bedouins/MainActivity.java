package com.example.mahinour.bedouins;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
        exitButton.setAlpha(0.2f);
    }

    public void enterGame(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
        finish();
    }

    public void ExitGame(View view) {
        finish();
        System.exit(0);
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
