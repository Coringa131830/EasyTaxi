package com.example.custostaxista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button botaoEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoEntrar = findViewById(R.id.botaoEntrar);
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);

            }
        });


    }
}
