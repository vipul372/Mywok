package com.example.vipul.Miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.vipul.Miwok.R.layout.activity_main);

        TextView numbers = findViewById(com.example.vipul.Miwok.R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
            }
        });
        TextView family = findViewById(com.example.vipul.Miwok.R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
                Toast.makeText(view.getContext(), "Open the list of family", Toast.LENGTH_SHORT).show();
            }
        });
        TextView colors = findViewById(com.example.vipul.Miwok.R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
                Toast.makeText(view.getContext(), "Open the list of colors", Toast.LENGTH_SHORT).show();
            }
        });
        TextView phrases = findViewById(com.example.vipul.Miwok.R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
                Toast.makeText(view.getContext(), "Open the list of phrases", Toast.LENGTH_SHORT).show();
            }
        });
    }
}