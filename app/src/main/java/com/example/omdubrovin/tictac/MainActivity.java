package com.example.omdubrovin.tictac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView cell11;
    ImageView cell12;
    ImageView cell13;

    ImageView cell21;
    ImageView cell22;
    ImageView cell23;

    ImageView cell31;
    ImageView cell32;
    ImageView cell33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cell11 = (ImageView) findViewById(R.id.cell11);
        cell11.setClickable(true);
        cell11.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Integer current_tag = (Integer) cell11.getTag();

        if(current_tag==null){setX(); return;}

        switch (current_tag) {
            case R.drawable.x:
                setO();
                break;
            case R.drawable.o:
                setX();
                break;
        }


    }

    private void setX(){
        cell11.setImageResource(R.drawable.x);
        cell11.setTag(R.drawable.x);

    }
    private void setO(){
        cell11.setImageResource(R.drawable.o);
        cell11.setTag(R.drawable.o);
    }

    private void setValue(int value){
        cell11.setImageDrawable(getDrawable(value));
        cell11.setTag(value);
    }


}
