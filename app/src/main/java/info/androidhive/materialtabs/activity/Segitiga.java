package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class Segitiga extends AppCompatActivity {
    EditText number1, number2;
    TextView result;
    Button luas;
    private Toolbar toolbar10;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        number1 = findViewById(R.id.txtnumber100);
        number2 = findViewById(R.id.txtnumber200);
        result = findViewById(R.id.hasil1);
        luas = findViewById(R.id.luas1);
        toolbar10 = (Toolbar) findViewById(R.id.tolbarse);
        setSupportActionBar(toolbar10);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if (angka2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid opration", Toast.LENGTH_LONG).show();
                } else {
                    double alas = Double.parseDouble(angka2);
                    double tinggi = Double.parseDouble(angka2);
                    double tambah = 2 / alas * tinggi;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
