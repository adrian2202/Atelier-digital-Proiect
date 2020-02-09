package com.example.proiectcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.service.autofill.CharSequenceTransformation;
/*import android.support.v7.app.AppCompatActivity;*/
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton;
       final EditText numar_1=findViewById(R.id.numar1);
        final EditText numar_2=findViewById(R.id.numar2);
        final EditText rezultat=findViewById(R.id.rezultat);

        myButton =(Button) findViewById(R.id.buton);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nr1= String.valueOf(numar_1.getText());
                String nr2= String.valueOf(numar_2.getText());
              int numar1=Integer.valueOf(nr1);
              int numar2=Integer.valueOf(nr2);
              int rez=numar1+numar2;

              String adunare=String.valueOf(rez);
              rezultat.setText(adunare);

            }
        });
        Button myButton2;
        myButton2 =(Button) findViewById(R.id.buton2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nr1= String.valueOf(numar_1.getText());
                String nr2= String.valueOf(numar_2.getText());
                int numar1=Integer.valueOf(nr1);
                int numar2=Integer.valueOf(nr2);
                int rez=numar1-numar2;

                String scadere=String.valueOf(rez);
                rezultat.setText(scadere);

            }
        });
        Button myButton3;
        myButton3 =(Button) findViewById(R.id.buton3);
        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nr1= String.valueOf(numar_1.getText());
                String nr2= String.valueOf(numar_2.getText());
                int numar1=Integer.valueOf(nr1);
                int numar2=Integer.valueOf(nr2);
                int rez=numar1*numar2;

                String Inmultire=String.valueOf(rez);
                rezultat.setText(Inmultire);

            }
        });

        Button myButton4;
        myButton4 =(Button) findViewById(R.id.buton4);
        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nr1= String.valueOf(numar_1.getText());
                String nr2= String.valueOf(numar_2.getText());
                int numar1=Integer.valueOf(nr1);
                int numar2=Integer.valueOf(nr2);
                int rez=numar1/numar2;

                String Inpartire=String.valueOf(rez);
                rezultat.setText(Inpartire);

            }
        });



    }


}
