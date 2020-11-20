package co.edu.inipiloto.labconstraintlayoust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void btn_Dos(View view) {
        startActivity(new Intent(getApplicationContext(),  MainActivity4.class));

    }
}