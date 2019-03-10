package com.vitaliykoval.colordescriptor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerColors;
    TextView textViewDescriptionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerColors = findViewById(R.id.spinnerColors);
        textViewDescriptionTemp = findViewById(R.id.textViewDescriptionTemp);
    }

    public void findDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        textViewDescriptionTemp.setText(getDescription(position));
    }

    public String getDescription(int position) {
        String arrayColors[] = getResources().getStringArray(R.array.description_of_temp);
        return arrayColors[position];
    }
}
