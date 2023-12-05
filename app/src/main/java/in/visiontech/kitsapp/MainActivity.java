package in.visiontech.kitsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn,btn1;
ImageView view_img;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn_1);
        btn1=findViewById(R.id.btn_2);
        view_img=findViewById(R.id.viewimg);
        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        textView=findViewById(R.id.txt);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_1:
                view_img.setImageResource(R.drawable.mainblock);
                break;
            case R.id.btn_2:
                Intent in=new Intent(getApplicationContext(),About.class);
                startActivity(in);
                break;
        }
    }
}