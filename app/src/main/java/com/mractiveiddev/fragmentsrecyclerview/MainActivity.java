package com.mractiveiddev.fragmentsrecyclerview;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked{

    TextView tvName, tvTel;
    EditText etName, etTel;
    Button btnAdd;
    listFrag listFrag;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvTel = findViewById(R.id.tvTel);
        etName = findViewById(R.id.etName);
        etTel = findViewById(R.id.etTel);
        btnAdd = findViewById(R.id.btnAdd);

        fragmentManager = this.getSupportFragmentManager();
        listFrag = (listFrag) fragmentManager.findFragmentById(R.id.listFrag);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //jika salah satu dari keduanya kosong, berarti pengguna tidak dapat mengetik apapun
                //Toast tampilkan peringatan
                if (etName.getText().toString().isEmpty() || etTel.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,
                            "Please enter all field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    AplicationClass.people.add(new Person(etName.getText().toString().trim(), etTel.getText().toString().trim()));
                    Toast.makeText(MainActivity.this,"Person successsfully add", Toast.LENGTH_SHORT).show();
                    etName.setText(null);
                    etTel.setText(null);
                    listFrag.notifyDataChage();
                }

            }
        });

        onItemCliked(0);
    }

    @Override
    public void onItemCliked(int indext) {

        tvName.setText(AplicationClass.people.get(indext).getName());
        tvTel.setText(AplicationClass.people.get(indext).getTelpNr());
    }
}
