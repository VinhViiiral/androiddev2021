package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("Start","onStart: ");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.i("Resume","onResume: ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Pause","onPause: ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Stop","onStop: ");
    }

}