package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {

    int sum = 0;
    EditText num1,num2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editText);
        num2 = findViewById(R.id.editText2);

        TextView plus = findViewById(R.id.textView);
        TextView minus = findViewById(R.id.textView4);
        TextView div = findViewById(R.id.div);
        TextView mul = findViewById(R.id.textView5);


        TextView res = findViewById(R.id.textView3);
        final TextView result = findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                result.setText(sum+"");
                showMessage("plus");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sum = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                result.setText(sum+"");
                showMessage("mul");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                sum = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                result.setText(sum+"");
                showMessage("minus");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("div");

                sum = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                result.setText(sum+"");
            }
        });




    }

    public void showMessage(String s){

        Toast.makeText(this, s ,Toast.LENGTH_SHORT).show();
    }
}
