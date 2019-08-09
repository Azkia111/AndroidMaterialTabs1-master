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

public class Lingkaran extends AppCompatActivity {
    EditText number1;
    TextView result;
    Button luas;
    Button keliling;
    private Toolbar toolbarlin;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        number1 = findViewById(R.id.txtnumber101);
        result = findViewById(R.id.hasil2);
        luas = findViewById(R.id.luas2);
        keliling = findViewById(R.id.keliling2);
        toolbarlin = (Toolbar) findViewById(R.id.tolbarli);
        setSupportActionBar(toolbarlin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String angka2 = number1.getText().toString();
                if (angka2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Invalid opration", Toast.LENGTH_LONG).show();
                } else {
                    double r = Double.parseDouble(angka2);
                    double tambah = 3.14 * r * r;
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
                    double r = Double.parseDouble(angka2);
                    double tambah = 2 * 3.14 * r;
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
