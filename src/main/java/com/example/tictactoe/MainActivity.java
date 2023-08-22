package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
String btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);

    }
    public void Check(View v){
        Button btnCurrent=(Button) v;
        if(btnCurrent.getText().toString().equals("")){

        count++;
if (flag==0){
    btnCurrent.setText("X");
    flag=1;

}else {
    btnCurrent.setText("O");
    flag=0;
}
if (count>4) {
    btn1 = b1.getText().toString();
    btn2 = b2.getText().toString();
    btn3 = b3.getText().toString();
    btn4 = b4.getText().toString();
    btn5 = b5.getText().toString();
    btn6 = b6.getText().toString();
    btn7 = b7.getText().toString();
    btn8 = b8.getText().toString();
    btn9 = b9.getText().toString();

    //conditions
    if (btn1.equals(btn2) && btn2.equals(btn3) && !btn1.equals("")) {
        Toast.makeText(this, "Winner:" + btn1, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn4.equals(btn5) && btn5.equals(btn6) && !btn4.equals("")) {
        Toast.makeText(this, "Winner:" + btn4, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn7.equals(btn8) && btn8.equals(btn9) && !btn7.equals("")) {
        Toast.makeText(this, "Winner:" + btn7, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn1.equals(btn4) && btn4.equals(btn7) && !btn1.equals("")) {
        Toast.makeText(this, "Winner:" + btn1, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn2.equals(btn5) && btn5.equals(btn8) && !btn2.equals("")) {
        Toast.makeText(this, "Winner:" + btn2, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn3.equals(btn6) && btn6.equals(btn9) && !btn3.equals("")) {
        Toast.makeText(this, "Winner:" + btn3, Toast.LENGTH_LONG).show();
        newGame();
    } else if (btn1.equals(btn5) && btn5.equals(btn9) && !btn1.equals("")) {
        newGame();
    } else if (btn3.equals(btn5) && btn5.equals(btn7) && !btn3.equals("")) {
        Toast.makeText(this, "Winner:" + btn3, Toast.LENGTH_LONG).show();
        newGame();
    }else if(count==9){
        Toast.makeText(this, "MATCH DRAW", Toast.LENGTH_LONG).show();
        newGame();
    }
}
}
    }
    public void newGame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count=0;
        flag=0;
    }
}