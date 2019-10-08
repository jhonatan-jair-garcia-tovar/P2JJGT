package com.mx.edu.isc.p2jjgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frm2Activity extends AppCompatActivity implements View.OnClickListener{
Button btn_sig;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        btn_sig= (Button) findViewById(R.id.button2);
        btn_sig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent frm3= new Intent(this, Frm3Activity.class);
        startActivity(frm3);
        finish();
    }
}
