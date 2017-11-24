package com.example.abhi.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView level0 =(TextView)findViewById(R.id.new_button);

        level0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent level0Intent = new Intent(MainActivity.this , OnClickingNew.class);
                startActivity(level0Intent);
            }
        });

        TextView How_to_Play = (TextView)findViewById(R.id.How_to_Play);
        How_to_Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level0Intent = new Intent(MainActivity.this , How_to_Play.class);
                startActivity(level0Intent);
            }
        });


    }
}
