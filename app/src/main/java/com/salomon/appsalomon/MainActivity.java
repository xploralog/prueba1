package com.salomon.appsalomon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText numero1,numero2;
     Button btnsumar,btnmultiplicar,btnrestar,btndividir;
     TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     numero1 =(EditText) findViewById(R.id.editText);
     numero2 =(EditText) findViewById(R.id.editText2);
     btnsumar =(Button) findViewById(R.id.button);
        btnrestar =(Button) findViewById(R.id.button2);
        btnmultiplicar =(Button) findViewById(R.id.button3);
        btndividir =(Button) findViewById(R.id.button4);
        resultado =(TextView) findViewById(R.id.textView);

      btnsumar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //obtener los numeros

              int n1 = Integer.valueOf(numero1.getText().toString());
              int n2 =  Integer.valueOf(numero2.getText().toString());

              int resultadosuma = n1 + n2 ;
              resultado.setText(String.valueOf(resultadosuma));




          }
      });

              btnrestar.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      int n1 = Integer.valueOf(numero1.getText().toString());
                      int n2 =  Integer.valueOf(numero2.getText().toString());

                      int resultadoresta = n1 - n2 ;
                      resultado.setText(String.valueOf(resultadoresta));


                  }
              });

                      btnmultiplicar.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {

                              int n1 = Integer.valueOf(numero1.getText().toString());
                              int n2 =  Integer.valueOf(numero2.getText().toString());

                              int resultadomultiplicar = n1 * n2 ;
                              resultado.setText(String.valueOf(resultadomultiplicar));
                          }
                      });

                      btndividir.setOnClickListener(new View.OnClickListener() {
                          @Override
                          public void onClick(View view) {


                              int n1 = Integer.valueOf(numero1.getText().toString());
                              int n2 =  Integer.valueOf(numero2.getText().toString());

                              double resultadividir = n1 / n2 ;
                              resultado.setText(String.valueOf(resultadividir));

                          }
                      });



    }
}
