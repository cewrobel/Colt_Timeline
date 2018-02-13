package com.ancientarchive.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mTimelineButton;
    private Button mSettingsButton;
    private Button mToolsButton;
    private Button mEventPreviewButton;

    private HorizontalScrollView mTimelineView;

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
        mEventPreviewButton = (Button) findViewById(R.id.eventPreviewButton);
        mEventPreviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test toast for Timeline Button", Toast.LENGTH_SHORT).show();
                mEventPreviewButton.setText("Ideally, clicking an Event in the main view will place its name here.");
            }
        });

        mTimelineView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
        mTimelineView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test toast for Timeline View Box. No content to scroll yet!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
