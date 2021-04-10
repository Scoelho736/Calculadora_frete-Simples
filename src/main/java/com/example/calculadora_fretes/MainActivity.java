package com.example.calculadora_fretes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  btnCalcularOnclick(View v ){

        EditText tPeso = (EditText) findViewById(R.id.txtPeso);
        EditText tValor = (EditText) findViewById(R.id.txtFrete);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        float peso = Float.parseFloat(tPeso.getText().toString());
        float valor = Float.parseFloat(tValor.getText().toString());


        float tResultado = peso * valor;




                if(tResultado > 0){
                    txtResultado.setText((String.valueOf(tResultado)));
                }else {
                    txtResultado.setText("Preencha todos os campos para calcular");
                }
    }
    public  void btnLimparOnclick(View v){
        EditText tPeso = (EditText) findViewById(R.id.txtPeso);
        EditText tValor = (EditText) findViewById(R.id.txtFrete);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        tPeso.setText("");
        tValor.setText("");
        txtResultado.setText("");

    }
}