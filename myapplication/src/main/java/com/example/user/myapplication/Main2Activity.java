package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setFinishOnTouchOutside(false);// pour que la 2eme activité ne se ferme pas juste en touchant sur l'activité prnicpale
    }
    public void fermer(View v){

        finish();
    }
}
