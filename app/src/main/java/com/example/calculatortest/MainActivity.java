package com.example.calculatortest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6,
            bt7, bt8, bt9, btCong, btTru, btNhan,
            btChia, btDot, btC, btBang;
    TextView txtScreen;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        btDot = (Button) findViewById(R.id.btDot);
        btCong = (Button) findViewById(R.id.btCong);
        btTru = (Button) findViewById(R.id.btTru);
        btNhan = (Button) findViewById(R.id.btNhan);
        btChia = (Button) findViewById(R.id.btChia);
        btC = (Button) findViewById(R.id.btC);
        btBang = (Button) findViewById(R.id.btBang);
        txtScreen = (TextView) findViewById(R.id.txtScreen);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + "0");
            }
        });

        btCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtScreen == null) {
                    txtScreen.setText(txtScreen.getText() + "");
                } else {
                    mValueOne = Float.parseFloat(txtScreen.getText() + " ");
                    crunchifyAddition = true;
                    txtScreen.setText(null);
                }
            }
        });

        btTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(txtScreen.getText() + "");
                mSubtract = true;
                txtScreen.setText(null);
            }
        });

        btNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(txtScreen.getText() + "");
                crunchifyMultiplication = true;
                txtScreen.setText(null);
            }
        });

        btChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(txtScreen.getText() + "");
                crunchifyDivision = true;
                txtScreen.setText(null);
            }
        });

        btBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(txtScreen.getText() + "");

                if (crunchifyAddition == true) {
                    txtScreen.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    txtScreen.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    txtScreen.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    txtScreen.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText("");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtScreen.setText(txtScreen.getText() + ".");
            }
        });
    }
}

//adhfbehbferft

//fu5t53utje8rgjewi

//qwertyjlgrigjjgirhjguehhfntj

//dvgruuyti6iywey452uhfwjasifeuty

//1
//2
//3
//4
