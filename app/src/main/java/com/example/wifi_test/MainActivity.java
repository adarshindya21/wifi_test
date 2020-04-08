package com.example.wifi_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText roomET , nameET ;
    Button generate ;
    TextView psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roomET = findViewById(R.id.roomet);
        nameET = findViewById(R.id.nameet);
        psw = findViewById(R.id.pswtv);
        generate = findViewById(R.id.Genbtn);

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getpsw();

            }

            private void getpsw() {

                String name = nameET.getText().toString();
                int room = Integer.parseInt(roomET.getText().toString());
                int ncount = name.length();

                int  sum = 0,first;
                while (room > 0) {
                    sum = sum + room % 10;
                    room = room/10;
                }

                if(sum%2==0)
                {
                    first = sum+1;
                }
                else
                {
                    first = sum;
                }

                char third = (char)(96+ncount);

                psw.setText("Your wifi Password is : "+first+""+sum+""+""+third);
            }
        });

    }
}
