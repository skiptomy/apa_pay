package com.example.skiptomy55.platezhi;

import android.support.v7.app.AppCompatActivity;
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

    public void onCalculate (View view) {

        double energyPrice;

        EditText g1View = findViewById(R.id.g1);
        EditText g2View = findViewById(R.id.g2);
        EditText w1View = findViewById(R.id.w1);
        EditText w2View = findViewById(R.id.w2);
        EditText en1View = findViewById(R.id.en1);
        EditText en2View = findViewById(R.id.en2);
        EditText warmView = findViewById(R.id.warm);
        EditText flatView = findViewById(R.id.flat);

        TextView result = findViewById(R.id.result);


        double g1 = Double.parseDouble(g1View.getText().toString());
        double g2 = Double.parseDouble(g2View.getText().toString());
        double w1 = Double.parseDouble(w1View.getText().toString());
        double w2 = Double.parseDouble(w2View.getText().toString());
        double en1 = Double.parseDouble(en1View.getText().toString());
        double en2 = Double.parseDouble(en2View.getText().toString());
        double warm = Double.parseDouble(warmView.getText().toString());
        double flat = Double.parseDouble(flatView.getText().toString());

        double gaz = (g2 - g1) * 8.5489;
        double water = (w2 - w1) * 30.47;
        double energyPokaz = en2 - en1;

        if (energyPokaz <= 100) {
            energyPrice = energyPokaz*0.9;
        }else{
            energyPrice = (energyPokaz - 100) * 1.68 + 90;
        }

        double res = gaz + water + energyPrice + warm + flat + 70;

        int res1 = (int) res;

        result.setText(""+res1 + " грн");
    }
}
