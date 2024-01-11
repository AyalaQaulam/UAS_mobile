package com.example.yalaplayverse

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.yalaplayverse.databinding.ActivityDashboardBinding
import com.example.yalaplayverse.ui.PongActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    private var rolldice: CardView? = null
    private var spinbottle: CardView? = null
    private var snake: CardView? = null
    private var tictactoe: CardView? = null
    private var guessnumber: CardView? = null
    private var drumbeat: CardView? = null
    private var pong: CardView? = null
    private var memorycard: CardView? = null
    private var roadtrip: CardView? = null
    private var data: CardView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)
                }
                R.id.profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }
                R.id.settings -> {
                    val intent = Intent(this, LogInActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    // Handle default case
                }
            }
            true
        }

        rolldice = findViewById<CardView>(R.id.cardRollDice)
        spinbottle = findViewById<CardView>(R.id.cardspinBottle)
        snake = findViewById<CardView>(R.id.cardSnake)
        tictactoe = findViewById<CardView>(R.id.cardTictactoe)
        guessnumber = findViewById<CardView>(R.id.cardGuessNumber)
        drumbeat = findViewById<CardView>(R.id.cardDrmBeat)
        pong = findViewById<CardView>(R.id.cardPong)
        memorycard = findViewById<CardView>(R.id.cardMemoryCard)
        roadtrip = findViewById<CardView>(R.id.cardRoadTrip)
        data = findViewById<CardView>(R.id.cardData)


        rolldice?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DiceRollActivity::class.java)
            startActivity(intent)
        })
        spinbottle?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SpinBottleActivity::class.java)
            startActivity(intent)
        })
        snake?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SnakeGameActivity::class.java)
            startActivity(intent)
        })
        tictactoe?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, TicTacToeActivity::class.java)
            startActivity(intent)
        })
        guessnumber?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GuessNumberActivity::class.java)
            startActivity(intent)
        })
        drumbeat?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, DrumBeatActivity::class.java)
            startActivity(intent)
        })
        pong?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PongActivity::class.java)
            startActivity(intent)
        })
        memorycard?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MemoryCardActivity::class.java)
            startActivity(intent)
        })
        roadtrip?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CarRaceActivity::class.java)
            startActivity(intent)
        })
        data?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CarRaceActivity::class.java)
            startActivity(intent)
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

