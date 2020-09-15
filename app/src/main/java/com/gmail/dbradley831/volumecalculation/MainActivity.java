package com.gmail.dbradley831.volumecalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private SphereVolume sphereDar;
    public NumberFormat demcial = NumberFormat.getIntegerInstance();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sphereDar = new SphereVolume(1.0f);
        setContentView(R.layout.activity_main);
    }

    public void calcuate(View v) {
        Log.w("MainActivity", "v = " + v );
        EditText radiusEditText =
                ( EditText ) findViewById(R.id.numbered_radius);
        String radiusString = radiusEditText.getText().toString();

        TextView radiusTextView =
                ( TextView ) findViewById(R.id.TrueResult);
        try {
                double userNum = Double.parseDouble(radiusString);
                sphereDar.getRadius();
                sphereDar.setRadius( userNum );
                double total = sphereDar.sphereRadius();

                radiusTextView.setText(demcial.format(total));
            } catch (NumberFormatException nfe) {

        }


    }
}