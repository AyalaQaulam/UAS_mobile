package com.example.yalaplayverse;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class DiceRollActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.one);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.two);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.three);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.four);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.five);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.six);
                break;
        }
    }
}
