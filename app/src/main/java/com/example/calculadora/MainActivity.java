package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String txt = "";
    private String txto = "";
    private String txto2 = "";
    private int eqls ;
    private int scnd ;
    private String vrfctr;
    private boolean rst ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtOperation = findViewById(R.id.txt_view);
        //numbers
        Button button = findViewById(R.id.buton);
        Button button1 =findViewById(R.id.buton1);
        Button button2 =findViewById(R.id.buton2);
        Button button4 =findViewById(R.id.buton4);
        Button button5 =findViewById(R.id.buton5);
        Button button6 =findViewById(R.id.buton6);
        Button button8 =findViewById(R.id.buton8);
        Button button9 =findViewById(R.id.buton9);
        Button button10 =findViewById(R.id.buton10);
        Button button12 =findViewById(R.id.buton12);
        //operations
        Button button3 =findViewById(R.id.buton3);
        Button button7 =findViewById(R.id.buton7);
        Button button11 =findViewById(R.id.buton11);
        Button button13 =findViewById(R.id.buton13);
        Button dl_btn =findViewById(R.id.dl_btn);
        Button eql_btn =findViewById(R.id.eql_btn);

        //Minus
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txto.length()==0){
                    eqls = Integer.parseInt(txt);
                    txto = txt+"-";
                    vrfctr = "m";
                    txtOperation.setText(txto+"");
                }else {
                    vrfctr = "m";
                    eqls = Integer.parseInt(txt) - Integer.parseInt(txto2);
                    txto = eqls+"-";
                    txtOperation.setText(txto);
                    txt = Integer.toString(eqls);
                    txto2 = "";
                }
            }
        });
        //plus
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txto.length()==0){
                    eqls = Integer.parseInt(txt);
                    txto = txt+"+";
                    vrfctr = "p";
                    txtOperation.setText(txto+"");
                }else {
                    vrfctr = "p";
                    eqls = Integer.parseInt(txt) + Integer.parseInt(txto2);
                    txto = eqls+"+";
                    txtOperation.setText(txto);
                    txt = Integer.toString(eqls);
                    txto2 = "";
                }
                }
        });
        //Multiplication
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txto.length()==0){
                    eqls = Integer.parseInt(txt);
                    txto = txt+"*";
                    vrfctr = "ml";
                    txtOperation.setText(txto+"");
                }else {
                    vrfctr = "ml";
                    eqls = Integer.parseInt(txt) * Integer.parseInt(txto2);
                    txto = eqls+"*";
                    txtOperation.setText(txto);
                    txt = Integer.toString(eqls);
                    txto2 = "";
                }
            }
        });
        //Division
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txto.length()==0){
                    eqls = Integer.parseInt(txt);
                    txto = txt+"/";
                    vrfctr = "d";
                    txtOperation.setText(txto+"");
                }else {
                    vrfctr = "d";
                    eqls = Integer.parseInt(txt) / Integer.parseInt(txto2);
                    txto = eqls+"/";
                    txtOperation.setText(txto);
                    txt = Integer.toString(eqls);
                    txto2 = "";
                }
            }
        });
        //equals
        eql_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vrfctr == "m"){
                    eqls = Integer.parseInt(txt) - Integer.parseInt(txto2);
                    txt = Integer.toString(eqls);
                    txtOperation.setText(txt+"");
                    txto2 = "";
                    txto = "";
                }
                if (vrfctr == "p"){
                    eqls = Integer.parseInt(txt) + Integer.parseInt(txto2);
                    txt = Integer.toString(eqls);
                    txtOperation.setText(txt+"");
                    txto2 = "";
                    txto = "";
                }
                if (vrfctr == "ml"){
                    eqls = Integer.parseInt(txt) * Integer.parseInt(txto2);
                    txt = Integer.toString(eqls);
                    txtOperation.setText(txt+"");
                    txto2 = "";
                    txto = "";
                }
                if (vrfctr == "d"){
                    eqls = Integer.parseInt(txt) / Integer.parseInt(txto2);
                    txt = Integer.toString(eqls);
                    txtOperation.setText(txt+"");
                    txto2 = "";
                    txto = "";
                }else{
                    txtOperation.setText(txt+"");
                }

            }
        });
        //Delete
        dl_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txto==""){
                    txt= txt.substring(0, txt.length() - 1);
                    txtOperation.setText(txt);
                }if (txto!=""){
                    txto= txto.substring(0, txto.length() - 1);
                    txtOperation.setText(txto);
                }
            }
        });
        //Numbers
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"7";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "7";
                    txto = txto+"7";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"8";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "8";
                    txto = txto+"8";
                    txtOperation.setText(txto);
                }
                ;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"9";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "9";
                    txto = txto+"9";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"4";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "4";
                    txto = txto+"4";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"5";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "5";
                    txto = txto+"5";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"6";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "6";
                    txto = txto+"6";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"1";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "1";
                    txto = txto+"1";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"2";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "2";
                    txto = txto+"2";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"3";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "3";
                    txto = txto+"3";
                    txtOperation.setText(txto);
                }
                ;}
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (txto.length()==0){
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txt = txt+"0";
                    txtOperation.setText(txt);
                }else {
                    if (rst){
                        txt="";
                        txto="";
                        txto2="";
                        eqls=0;
                        txtOperation.setText(txt);
                        rst=false;
                    }
                    txto2 = txto2 + "0";
                    txto = txto+"0";
                    txtOperation.setText(txto);
                }
                ;}
        });
    }
}