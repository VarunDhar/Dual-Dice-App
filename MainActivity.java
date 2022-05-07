//Insert the dice1 to dice6 (PNG) photos into drawables folder.
//Also, I have changed the logo of the app.
//Logo was made using Android Asset Studio.


package com.example.assignmenthiteshdiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView iv1, iv2;
    private Random randnum1, randnum2;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv1= findViewById(R.id.imageView1);
        iv2=findViewById(R.id.imageView2);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie();
                Toast.makeText(getApplicationContext(),"Die rolled successfully!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void rollDie(){
        randnum1=new Random();
        randnum2=new Random();
        int randomnumber1= randnum1.nextInt(6)+1;
        int randomnumber2= randnum2.nextInt(6)+1;

        switch (randomnumber1){
            case 1:
                iv1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                iv1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                iv1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                iv1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                iv1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                iv1.setImageResource(R.drawable.dice6);
                break;
        }

        switch (randomnumber2){
            case 1:
                iv2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                iv2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                iv2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                iv2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                iv2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                iv2.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
