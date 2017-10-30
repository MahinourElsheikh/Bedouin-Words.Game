package com.example.mahinour.bedouins;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {
    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<Button> buttonUpper = new ArrayList<Button>();
    ArrayList<String> word = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button mButton = (Button) findViewById(R.id.button1);
        buttonUpper.add(mButton);
        mButton = (Button) findViewById(R.id.button2);
        buttonUpper.add(mButton);
        mButton = (Button) findViewById(R.id.button3);
        buttonUpper.add(mButton);
        mButton = (Button) findViewById(R.id.button4);
        buttonUpper.add(mButton);
        mButton = (Button) findViewById(R.id.button5);
        buttonUpper.add(mButton);

        word.add("ش");
        word.add("ت");
        word.add("ي");
        word.add("و");
        word.add("ة");

    }
    public void downToUp(View v) {
        CharSequence text = ((TextView) v).getText();
        // Do fun stuff with text
        for (int j=0;j<5;j++){
            if (buttonUpper.get(j).getText().equals("")) {
                Button mButton = buttonUpper.get(j);

                mButton.setText(text);
                v.setVisibility(Button.INVISIBLE);
                buttons.add((Button) v);
                break;
            }
        }
        Boolean correct = true;
        for (int i = 0; i <5;i++) {
            if (!word.get(i).equals(buttonUpper.get(i).getText())){
                correct = false;
            }
        }
        if (correct) {
            TextView t = (TextView)findViewById(R.id.rightImage);
            t.setVisibility(TextView.VISIBLE);
            ImageButton bi = (ImageButton) findViewById(R.id.nextButton);
            bi.setVisibility(ImageButton.VISIBLE);
        }
    }

    public void upToDown(View upperButton) {

        for (int x = 0; x < buttons.size(); x++) { // bydous mn fo2
            Button downButton = buttons.get(x);
            if (downButton.getText().equals(((Button) upperButton).getText())) {
                Button b = (Button) upperButton;
                b.setText("");
                downButton.setVisibility(Button.VISIBLE);
                buttons.remove(downButton);
            }


        }

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
