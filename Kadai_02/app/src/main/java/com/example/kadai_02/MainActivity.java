package com.example.kadai_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double su1 = 0, su2 = 0;
    TextView tv;
    Enzan enzan;

    class Enzan {

        double keisan(double su1, double su2) {
            return 0;
        }
    }
    class Add extends Enzan {

        double keisan(double su1, double su2) {

            return su1 + su2;
        }
    }
    class Sub extends Enzan {

        double keisan(double su1, double su2) {

            return su1 - su2;
        }
    }
    class Div extends Enzan {

        double keisan(double su1, double su2) {

            return su1 / su2;
        }
    }
    class Mul extends Enzan {

        double keisan(double su1, double su2) {

            return su1 * su2;
        }
    }

    class Sqrt extends Enzan {

        double keisan(double su1, double su2) {

            return su1 * Math.sqrt(su2);
        }
    }
    class Pow extends Enzan {

        double keisan(double su1, double su2) {

            return     Math.pow(su1, su2);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.editText);
    }

    public void onClick_suji(View view) {

        String su = ((TextView) view).getText().toString();
        tv.setText(tv.getText().toString() + su);
    }

    public void onClick_Add(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Add();

    }

    public void onClick_Sub(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Sub();

    }

    public void onClick_Div(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Div();

    }

    public void onClick_Mul(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Mul();

    }

    public void onClick_Equ(View view) {
        su2 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        double total = enzan.keisan(su1, su2);
        tv.setText(String.valueOf(total));
    }

    public void onClick_Sqrt(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Sqrt();

    }

    public void onClick_Pow(View view) {
        su1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");

        enzan = new Pow();

    }

    public void onClick_Clr(View view) {
        tv.setText("");
    }
}