package com.example.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btn);
        editText=findViewById(R.id.et);
        textView=findViewById(R.id.tv);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (editText.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int fact=1;
                    Integer n = Integer.parseInt(editText.getText().toString());
                    for (int i = 1; i <= n; i++)
                    {
                        fact = fact * i;
                        textView.setText("factorial=" + fact);
                    }

                }

            }




        });
    }
}