package com.kishore.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar mRatingBar;
    SeekBar mSeekBar;
    TextView rr, sr;
    ImageView myImage;
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRatingBar = findViewById(R.id.rb);
        mSeekBar = findViewById(R.id.sb);
        rr = findViewById(R.id.rb_result);
        sr = findViewById(R.id.sb_result);
        myImage = findViewById(R.id.iv);
        myImageButton = findViewById(R.id.ib);
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromuser) {
                rr.setText("Rating Result is :" + String.valueOf(rating));
            }
        });
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromuser) {
                sr.setText("Progress Result is:" + String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImage.setImageResource(R.drawable.imageresource);
            }
        });
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageButton.setImageResource(R.drawable.imageresource);
            }
        });
    }
}




