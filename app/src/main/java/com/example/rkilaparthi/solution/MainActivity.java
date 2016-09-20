package com.example.rkilaparthi.solution;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button b1,b2,b3,b4,b5;
    Intent i;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) this.findViewById(R.id.button1);
        b2 = (Button) this.findViewById(R.id.button2);
        b3 = (Button) this.findViewById(R.id.button3);
        b4 = (Button) this.findViewById(R.id.button4);
        b5 = (Button) this.findViewById(R.id.button5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == b1) {
                    i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:9849911755"));
                    startActivity(i);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == b2) {
                    i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:8712769716"));
                    startActivity(i);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == b3) {
                    i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:9666666515"));
                    startActivity(i);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == b4) {
                    i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:9581231233"));
                    startActivity(i);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == b5) {
                    i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:9704237344"));
                    startActivity(i);
                }
            }
        });
    }
}

