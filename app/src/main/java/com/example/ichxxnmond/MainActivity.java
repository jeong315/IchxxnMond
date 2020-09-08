package com.example.ichxxnmond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//사용자가 앱을 클릭했을 때 실행되는 액티비티 클래스 >> 화면 구성을 주목적으로 하는 클래스
//액티비티 클래스들은 Activity를 상속받아 작성 >> AppCompatActivity를 상속받아 작성
    //>>>>>>AppCom[atActivity가 Activity의 서브 클래스

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //자동으로 onCreate() 함수가 호출

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //이 함수의 setContentView()함수가 화면 출력 함수
        //R.layout.activity_main을 매개변수로 지정하였으므로 res/layout/activity_main.xml의 구성대로 액티비티 화면 출력
    }
}
