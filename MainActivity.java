/*********************************************************************************

 *프로그램명 : MainActivity.java
 *작성자 : 2016039076 김종우
 *작성일 : 2020.04.11
 *프로그램 설명 : 홈페이지를 Toast 메시지로 출력, URL 열기, 이미지 교체 프로그램 구현

 **********************************************************************************/
package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button display;
    Button open;
    RadioGroup Rad;
    ImageView Img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display= (Button) findViewById(R.id.display);
        open=(Button) findViewById(R.id.open);
        Rad=(RadioGroup) findViewById(R.id.Rad);
        Img=(ImageView) findViewById(R.id.Img);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"https://www.google.com",Toast.LENGTH_SHORT).show();
            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });
        Rad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton1){
                    Img.setImageResource(R.drawable.pie);
                }
                else if(checkedId == R.id.radioButton2){
                    Img.setImageResource(R.drawable.ore);
                }
            }
        });
    }
}
