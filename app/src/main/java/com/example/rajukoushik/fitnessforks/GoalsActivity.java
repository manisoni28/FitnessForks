package com.example.rajukoushik.fitnessforks;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class GoalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);


        final ImageView image = (ImageView) findViewById(R.id.muscle);
        image.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    image.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    image.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        image.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                Intent intent = new Intent(GoalsActivity.this, HomeActivity.class);
                startActivity(intent);

                return false;
            }
        });

        final ImageView image1 = (ImageView) findViewById(R.id.loseweigt);
        image1.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    image1.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    image1.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        image1.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                Intent intent = new Intent(GoalsActivity.this, HomeActivity.class);
                startActivity(intent);
                return false;
            }
        });

        final ImageView image2 = (ImageView) findViewById(R.id.maintain);
        image2.setOnTouchListener(new View.OnTouchListener() {
            private Rect rect;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    image2.setColorFilter(Color.argb(50, 0, 0, 0));
                    rect = new Rect(v.getLeft(), v.getTop(), v.getRight(), v.getBottom());
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    image2.setColorFilter(Color.argb(0, 0, 0, 0));
                }
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    if(!rect.contains(v.getLeft() + (int) event.getX(), v.getTop() + (int) event.getY())){
                        image2.setColorFilter(Color.argb(0, 0, 0, 0));
                    }
                }
                Intent intent = new Intent(GoalsActivity.this, HomeActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }

    public void btnNextGoals(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
