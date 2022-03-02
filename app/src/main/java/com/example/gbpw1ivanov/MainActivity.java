package com.example.gbpw1ivanov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    protected Button button_click, button_clack, button_boom;
    protected SwitchCompat switchCompat;
    protected TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.lucky_switch);
        button_click = findViewById(R.id.button_click);
        button_clack = findViewById(R.id.button_clack);
        button_boom = findViewById(R.id.button_boom);
        textView = findViewById(R.id.lucky_monitor);

        switchCompat.setOnCheckedChangeListener(this);

        button_click.setOnClickListener(view -> {
            Toast.makeText(this, "CLICK!", Toast.LENGTH_SHORT).show();
        });

        button_clack.setOnClickListener(view -> {
            Toast.makeText(this, "CLACK!", Toast.LENGTH_SHORT).show();
        });

        button_boom.setOnClickListener(view -> {
            Toast.makeText(this, "BOOOOOOM!", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            textView.setText("Успех включен!");
            textView.setTextSize(15);
            textView.setTextColor(getResources().getColor(R.color.medium_violet_red));
        } else {
            textView.setText("Успех отключен!");
            textView.setTextSize(10);
            textView.setTextColor(getResources().getColor(R.color.black));
        }
    }
}