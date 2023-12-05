package in.visiontech.kitsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.HttpCookie;

public class About extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btn1=findViewById(R.id.call_btn);
        btn2=findViewById(R.id.dial_btn);
        btn3=findViewById(R.id.browse_btn);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent in;
        switch (view.getId()){
            case R.id.call_btn:
                in=new Intent();
                in.setAction(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:9177670003"));
                startActivity(in);
                break;
            case R.id.dial_btn:
                in=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9177670003"));
                startActivity(in);
                break;
            case  R.id.browse_btn:
                in=new Intent(Intent.ACTION_VIEW,Uri.parse("https://kitssingapuram.com"));
                startActivity(in);
                break;
        }
    }
}