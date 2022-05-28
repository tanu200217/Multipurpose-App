package com.example.mynetcamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bluetooth extends AppCompatActivity {
    Button b1,b2,b3;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        b1=(Button)findViewById(R.id.button36);
        b2=(Button)findViewById(R.id.button37);
        b3=(Button)findViewById(R.id.button38);
        bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetoothAdapter.enable();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluetoothAdapter.disable();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Bluetooth.this,Sixth.class);
                startActivity(q);
                finish();
            }
        });

    }
}
