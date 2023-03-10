package hcmute.edu.vn.lab3_week5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view){
        Intent intent = new Intent(this,MyIntentService.class);
        startService(intent);
    }
    public void stopService(View view){
        Intent intent = new Intent(this,MyIntentService.class);
        stopService(intent);
    }
}