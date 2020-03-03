package com.shaheen.shaheenunit7flooring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etWidth;
    EditText etLength;
    Button btnResults;
    TextView tvFlooringNeeded;

    public static final String iKeyWidth = "WIDTH_KEY";
    public static final String iKeyLength = "LENGTH_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.etWidth);
        etLength = (EditText) findViewById(R.id.etLength);

        btnResults = (Button) findViewById(R.id.btnResult);

        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("LENGTH: " + etLength.getText());
                Intent resultIntent = new Intent(MainActivity.this, FlooringDetail.class);
                resultIntent.putExtra(iKeyWidth, etWidth.getText() + "");
                resultIntent.putExtra(iKeyLength, etLength.getText() + "");
                startActivity(resultIntent);
            }
        });

    }
}
