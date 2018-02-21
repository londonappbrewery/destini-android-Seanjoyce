package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private TextView mButtonBottom;
    private int[] storyArray = { R.string.T1_Story, R.string.T2_Story, R.string.T3_Story};
    private int[] awns1Array = { R.string.T1_Ans1, R.string.T2_Ans1, R.string.T3_Ans1};
    private int[] awns2Array = { R.string.T1_Ans2, R.string.T2_Ans2, R.string.T3_Ans2};
    private int[] endingArray = { R.string.T4_End, R.string.T5_End, R.string.T6_End};
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    updateDisplay(2);
                    mStoryIndex = 3;
                }else if (mStoryIndex == 2){
                    updateDisplay(2);
                    mStoryIndex = 3;
                }else if(mStoryIndex == 3){
                    displayEnding(2);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1){
                    updateDisplay(1);
                    mStoryIndex = 2;
                }else if (mStoryIndex == 2){
                    displayEnding(0);
                }else if(mStoryIndex == 3){
                    displayEnding(1);
                }
            }
        });
    }
    private void updateDisplay(int step){
        mStoryTextView.setText(storyArray[step]);
        mButtonTop.setText(awns1Array[step]);
        mButtonBottom.setText(awns2Array[step]);
    }

    public void displayEnding(int ending){
        mStoryTextView.setText(endingArray[ending]);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);

    }
}
