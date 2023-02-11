package com.example.messager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViedReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViedReceivedMsg = findViewById(R.id.textViewReceivedMesage);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViedReceivedMsg.setText(msg);
    }
}