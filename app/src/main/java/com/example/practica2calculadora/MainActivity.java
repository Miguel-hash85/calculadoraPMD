package com.example.practica2calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button myButton1=null;
    private Button myButton2=null;
    private Button myButton3=null;
    private Button myButton4=null;
    private Button myButton5=null;
    private Button myButton6=null;
    private Button myButton7=null;
    private Button myButton8=null;
    private Button myButton9=null;
    private Button myButton0=null;
    private Button myButtonMas=null;
    private Button myButtonMenos=null;
    private Button myButtonIgual=null;
    private TextView myTextView=null;
    private TextView myTextViewOperation=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton1=(Button)findViewById(R.id.button1);
        myButton1.setOnClickListener(this);
        myButton2=(Button)findViewById(R.id.button2);
        myButton2.setOnClickListener(this);
        myButton3=(Button)findViewById(R.id.button3);
        myButton3.setOnClickListener(this);
        myButton4=(Button)findViewById(R.id.button4);
        myButton4.setOnClickListener(this);
        myButton5=(Button)findViewById(R.id.button5);
        myButton5.setOnClickListener(this);
        myButton6=(Button)findViewById(R.id.button6);
        myButton6.setOnClickListener(this);
        myButton7=(Button)findViewById(R.id.button7);
        myButton7.setOnClickListener(this);
        myButton8=(Button)findViewById(R.id.button8);
        myButton8.setOnClickListener(this);
        myButton9=(Button)findViewById(R.id.button9);
        myButton9.setOnClickListener(this);
        myButton0=(Button)findViewById(R.id.button0);
        myButton0.setOnClickListener(this);
        myButtonMas=(Button)findViewById(R.id.buttonMas);
        myButtonMas.setOnClickListener(this);
        myButtonMenos=(Button)findViewById(R.id.buttonMenos);
        myButtonMenos.setOnClickListener(this);
        myButtonIgual=(Button)findViewById(R.id.buttonIgual);
        myButtonIgual.setOnClickListener(this);
        myTextView=(TextView)findViewById(R.id.numeroIntroducido);
        myTextViewOperation=(TextView)findViewById(R.id.resultadoOpe);
    }

    @Override
    public void onClick(View view) {

        String textoAntesOpe=myTextView.getText().toString();

        switch(view.getId()){

            case R.id.button1:
                myTextView.setText(func(myButton1.getText().toString(), textoAntesOpe));

                break;
            case R.id.button2:
                myTextView.setText(func(myButton2.getText().toString(), textoAntesOpe));

                break;
            case R.id.button3:
                myTextView.setText(func(myButton3.getText().toString(), textoAntesOpe));

                break;
            case R.id.button4:
                myTextView.setText(func(myButton4.getText().toString(), textoAntesOpe));

                break;
            case R.id.button5:
                myTextView.setText(func(myButton5.getText().toString(), textoAntesOpe));

                break;
            case R.id.button6:
                myTextView.setText(func(myButton6.getText().toString(), textoAntesOpe));

                break;
            case R.id.button7:
                myTextView.setText(func(myButton7.getText().toString(), textoAntesOpe));

                break;
            case R.id.button8:
                myTextView.setText(func(myButton8.getText().toString(), textoAntesOpe));

                break;
            case R.id.button9:
                myTextView.setText(func(myButton9.getText().toString(), textoAntesOpe));

                break;
            case R.id.button0:
                myTextView.setText(func(myButton0.getText().toString(), textoAntesOpe));

                break;
            case R.id.buttonMas:
                myTextView.setText(func(myButtonMas.getText().toString(), textoAntesOpe));
                break;
            case R.id.buttonMenos:
                myTextView.setText(func(myButtonMenos.getText().toString(), textoAntesOpe));
                break;
            case R.id.buttonIgual:
                break;
        }

    }

    private String func(String textoAdd, String texto) {

        texto=texto+textoAdd;

        return texto;


    }
}