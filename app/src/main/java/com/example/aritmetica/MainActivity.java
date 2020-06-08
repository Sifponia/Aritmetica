package com.example.aritmetica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private EditText etValor1, etValor2;
 private RadioButton radioSuma, radioResta, radioMulti, radioDivicion, radioModulo;
 private TextView viewMostral;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText)findViewById(R.id.tnNumero1);
        etValor2 = (EditText)findViewById(R.id.tnNumero2);
        radioSuma =(RadioButton)findViewById(R.id.rbSuma);
        radioResta =(RadioButton)findViewById(R.id.rbResta);
        radioDivicion=(RadioButton)findViewById(R.id.rbMulti);
        radioModulo =(RadioButton)findViewById(R.id.rbModulo);
        viewMostral = (TextView)findViewById(R.id.textView);

    }


    public  void operaciones(View view){

   String srtValor1 = etValor1.getText().toString();
   String srtValor2 = etValor2.getText().toString();

   float floNumero1 = Float.parseFloat(srtValor1);
   float floNumero2 = Float.parseFloat(srtValor2);

   if (radioSuma.isChecked() == true){

       float Resultado = floNumero1 + floNumero2;
       String srtResultado = String.valueOf(Resultado);

       viewMostral.setText("El resultado es : " + srtResultado);





   }



    }
}