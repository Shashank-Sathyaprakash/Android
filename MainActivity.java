package com.example.rollurdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imgview1,imgview2;
    private Button RollButton;
    private Random Diceface=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgview1=findViewById(R.id.imageView);
        imgview2=findViewById(R.id.imageView2);

        RollButton=findViewById(R.id.button);
        RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice(imgview1);
                rolldice(imgview2);
            }
        });
    }

    private void rolldice(ImageView imgveiw)
    {
        int Rand=Diceface.nextInt(6)+1;
        switch (Rand){
            case 1:
                imgveiw.setImageResource(R.drawable.dic1);
                break;
            case 2:
                imgveiw.setImageResource(R.drawable.dic2);
                break;
            case 3:
                imgveiw.setImageResource(R.drawable.dic3);
                break;
            case 4:
                imgveiw.setImageResource(R.drawable.dic4);
                break;
            case 5:
                imgveiw.setImageResource(R.drawable.dic5);
                break;
            case 6:
                imgveiw.setImageResource(R.drawable.dic6);
                break;
        }
        Toast.makeText(getApplicationContext(),"Dice rolling!!!!!",Toast.LENGTH_SHORT).show();


    }
}
