package com.example.yalaplayverse;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import java.util.Random;

public class SpinBottleActivity extends AppCompatActivity {
    private ImageView bottle;
    private ImageView youreItImage; // Tambahkan ImageView baru
    private Random random = new Random();
    private int lastDir;
    private boolean spinning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_bottle);

        bottle = findViewById(R.id.bottle);
        youreItImage = findViewById(R.id.youreItImage); // Inisialisasi ImageView baru
    }

    public void spinBottle(View v) {
        if (!spinning) {
            int newDir = random.nextInt(1800);
            float pivotX = bottle.getWidth() / 2;
            float pivotY = bottle.getHeight() / 2;

            Animation rotate = new RotateAnimation(lastDir, newDir, pivotX, pivotY);
            rotate.setDuration(2500);
            rotate.setFillAfter(true);
            rotate.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    spinning = true;
                    youreItImage.setVisibility(View.INVISIBLE); // Sembunyikan gambar saat botol berputar
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    spinning = false;
                    youreItImage.setVisibility(View.VISIBLE); // Tampilkan gambar saat botol berhenti
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });

            lastDir = newDir;
            bottle.startAnimation(rotate);
        }
    }
}
