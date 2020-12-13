package com.example.feelthecup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class QReader extends AppCompatActivity {

    private TextView qTextView1;
    private ImageView qImageView1;
    private Button qButton1;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_reader);

        qTextView1 = findViewById(R.id.textView14);
        qImageView1 = findViewById(R.id.imageView5);
        qButton1 = findViewById(R.id.button3);
    }
}