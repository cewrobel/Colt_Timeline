package com.ancientarchive.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTimelineButton;
    private Button mSettingsButton;
    private Button mToolsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimelineButton = (Button) findViewById(R.id.timelineButton);
        mTimelineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test toast for Timeline Button", Toast.LENGTH_SHORT).show();
            }
        });
        mSettingsButton = (Button) findViewById(R.id.settingsButton);
        mSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test toast for Settings Button", Toast.LENGTH_SHORT).show();
            }
        });
        mToolsButton = (Button) findViewById(R.id.toolsButton);
        mToolsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test toast for Tools Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
