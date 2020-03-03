package com.shaheen.shaheenunit7flooring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FlooringDetail extends AppCompatActivity {

    Calculation calc = new Calculation();
    TextView tvResultDet;

    public static final String iKeyWidth = "WIDTH_KEY";
    public static final String iKeyLength = "LENGTH_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flooring_detail);

        tvResultDet = (TextView) findViewById(R.id.tvResultDet);

        String iWidth = getIntent().getExtras().getString(iKeyWidth);
        String iLength = getIntent().getExtras().getString(iKeyLength);

        if(!iWidth.isEmpty()) {
            calc.setWidth(Double.parseDouble(iWidth));
        }

        if(!iLength.isEmpty()){
            calc.setLength(Double.parseDouble(iLength));
        }


        tvResultDet.setText("Width is: " + calc.getWidth() + " and length is " + calc.getLength() +
                                " and needed flooring is: " + calc.getResult() + ".");
    }
}
