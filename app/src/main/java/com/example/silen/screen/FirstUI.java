package com.example.silen.screen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.silen.R;

public class FirstUI extends Activity {
    Button btnStart ;
    Context context;

    @Override
    public void onCreate(Bundle saveStateInstance){
        super.onCreate(saveStateInstance);
        context = this;
        setContentView(R.layout.first_ui);
        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstUI.this, mainUI.class);
                startActivity(intent);


            }
        });
    }
}
