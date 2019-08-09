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

public class PersegiPanjang extends AppCompatActivity {
    EditText number1, number2;
    TextView result;
    Button luas;
    Button keliling;
    private Toolbar toolbarpp;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        number1 = findViewById(R.id.txtnumber10);
        number2 = findViewById(R.id.txtnumber20);
        result = findViewById(R.id.hasile);
        luas = findViewById(R.id.luase);
        keliling = findViewById(R.id.kelilinge);
        toolbarpp = (Toolbar) findViewById(R.id.tolbare);
        setSupportActionBar(toolbarpp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if (angka2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid opration", Toast.LENGTH_LONG).show();
                } else {
                    double panjang = Double.parseDouble(angka2);
                    double lebar = Double.parseDouble(angka2);
                    double tambah = panjang * lebar;
                    result.setText(String.valueOf(tambah));
                }
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if (angka2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid opration", Toast.LENGTH_LONG).show();
                } else {
                    double panjang = Double.parseDouble(angka2);
                    double lebar = Double.parseDouble(angka2);
                    double tambah = 2 * (panjang + lebar);
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


