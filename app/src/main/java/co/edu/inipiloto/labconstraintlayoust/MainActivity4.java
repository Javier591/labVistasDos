package co.edu.inipiloto.labconstraintlayoust;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void btn_Tres(View view) {
        startActivity(new Intent(getApplicationContext(),  MainActivity5.class));
    }
}