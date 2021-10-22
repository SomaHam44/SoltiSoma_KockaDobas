package com.example.kockadobas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnKocka1, btnKocka2, btnDobas, btnReset;
    private ImageView kockaKep1, kockaKep2;
    private TextView txtEredmeny;
    private Random random;
    private int egyikkockaErtek, masikKockaErtek;
    private Toast toast;
    private AlertDialog.Builder alertB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnKocka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kockaKep2.setVisibility(View.GONE);




            }
        });

        btnKocka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kockaKep2.setVisibility(View.VISIBLE);
            }
        });

        btnDobas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                egyikkockaErtek = random.nextInt(6) + 1;
                masikKockaErtek = random.nextInt(6) + 1;
                if (egyikkockaErtek == 1) {
                    kockaKep1.setImageResource(R.drawable.kocka1);
                    txtEredmeny.setText(egyikkockaErtek + +masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                             " (" + egyikkockaErtek + "+" + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (egyikkockaErtek == 2) {
                    kockaKep1.setImageResource(R.drawable.kocka2);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + "\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek+ "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (egyikkockaErtek == 3) {
                    kockaKep1.setImageResource(R.drawable.kocka3);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (egyikkockaErtek == 4) {
                    kockaKep1.setImageResource(R.drawable.kocka4);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (egyikkockaErtek == 5) {
                    kockaKep1.setImageResource(R.drawable.kocka5);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (egyikkockaErtek == 6) {
                    kockaKep1.setImageResource(R.drawable.kocka6);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                }


                if (masikKockaErtek == 1) {
                    kockaKep2.setImageResource(R.drawable.kocka1);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (masikKockaErtek == 2) {
                    kockaKep2.setImageResource(R.drawable.kocka2);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (masikKockaErtek == 3) {
                    kockaKep2.setImageResource(R.drawable.kocka3);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (masikKockaErtek == 4) {
                    kockaKep2.setImageResource(R.drawable.kocka4);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (masikKockaErtek == 5) {
                    kockaKep2.setImageResource(R.drawable.kocka5);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                } else if (masikKockaErtek == 6) {
                    kockaKep2.setImageResource(R.drawable.kocka6);
                    txtEredmeny.setText(egyikkockaErtek + masikKockaErtek +
                            " (" + egyikkockaErtek + "+" + masikKockaErtek + ")\n");
                    Toast.makeText(getApplicationContext(), egyikkockaErtek +masikKockaErtek  +
                            " (" + egyikkockaErtek + "+"  + masikKockaErtek + ")",Toast.LENGTH_SHORT).show();
                }

            }









        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertB.setTitle("Reset").create().show();
            }
        });
    }

    private void init() {
        btnKocka1 = findViewById(R.id.btn_kocka1);
        btnKocka2 = findViewById(R.id.btn_kocka2);
        btnDobas = findViewById(R.id.btn_dobas);
        btnReset = findViewById(R.id.btn_reset);
        kockaKep1 = findViewById(R.id.egyikdobokocka);
        kockaKep2 = findViewById(R.id.masikdobokocka);
        txtEredmeny = findViewById(R.id.txt_eredmeny);
        random = new Random();
        egyikkockaErtek = 0;
        masikKockaErtek = 0;
        toast = new Toast(getApplicationContext());
        alertB = new AlertDialog.Builder(this);
        alertDialogElkeszit();
    }

    private void alertDialogElkeszit() {
        alertB.setMessage("Biztos, hogy törölni szeretné az eddigi dobásokat");
        alertB.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                closeContextMenu();

            }
        });
        alertB.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                txtEredmeny.setText("");
                closeContextMenu();
            }
        });
    }


}