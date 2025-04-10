// Carlos Gonzalez - Contacts Address Book
// 04/07/2025
//Controls for home screen
package com.example.gonzalezcarloscontactsaddressbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContact1 = findViewById(R.id.btnContact1);
        Button btnContact2 = findViewById(R.id.btnContact2);
//connect the Java buttons to the ones you created in activity_main.xml
        btnContact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Contact1Activity.class);
                startActivity(intent);
            }
        });
// listens for a button click and switches to Contact1Activity.
        btnContact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,  Contact2Activity.class);
                startActivity(intent);
                //Same thing but for the second contact screen
            }
        });
    }
}
