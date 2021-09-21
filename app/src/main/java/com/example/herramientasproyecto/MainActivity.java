package com.example.herramientasproyecto;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;
import java.text.DecimalFormat;
import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    TextView tx1;
    Button def, tip, imp, test;
    ImageView img1, img2, img3, img4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx1 = findViewById(R.id.tx1);
        def =findViewById(R.id.def);
        tip = findViewById(R.id.tip);
        imp = findViewById(R.id.imp);
        test = findViewById(R.id.test);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
    }


}