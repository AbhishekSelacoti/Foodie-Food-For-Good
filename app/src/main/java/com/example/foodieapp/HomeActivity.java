package com.example.foodieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    // TODO: Change name
//    com.google.android.material.card.MaterialCardView card1, card2, card3;
//    com.google.android.material.button.MaterialButton bYes, bNo, lYes, lNo, dYes, dNo;

    com.google.android.material.button.MaterialButton dYes, dNo;
    LinearLayout dOptionText, dOptionButtons, dOptionTextNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dYes = findViewById(R.id.dYes);
        dNo = findViewById(R.id.dNo);
        dOptionButtons = findViewById(R.id.dOptionButtons);
        dOptionText = findViewById(R.id.dOptionText);
        dOptionTextNo = findViewById(R.id.dOptionTextNo);

        dOptionText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dOptionButtons.setVisibility(View.VISIBLE);
                dOptionText.setVisibility(View.GONE);
                dOptionTextNo.setVisibility(View.GONE);
            }
        });
        dOptionTextNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dOptionButtons.setVisibility(View.VISIBLE);
                dOptionTextNo.setVisibility(View.GONE);
                dOptionText.setVisibility(View.GONE);
            }
        });

        dYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dOptionButtons.setVisibility(View.GONE);
                dOptionText.setVisibility(View.VISIBLE);
                dOptionTextNo.setVisibility(View.GONE);
            }
        });

        dNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dOptionButtons.setVisibility(View.GONE);
                dOptionTextNo.setVisibility(View.VISIBLE);
                dOptionText.setVisibility(View.GONE);
            }
        });
    }
}