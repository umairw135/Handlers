package com.example.assign2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Handler myhandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartHandler(View view) {
    myToast.run();

    }

    public void StopHandler(View view) {
        myhandler.removeCallbacks(myToast);
    }
    private Runnable myToast = new Runnable() {
        @Override
        public void run() {
            Toast.makeText(MainActivity.this,"this is delayed toast",Toast.LENGTH_SHORT).show();
           myhandler.postDelayed(this,5000);
        }
    };
}
