package com.example.services

import androidx.appcompat.app.AppCompatActivity
import android.media.MediaPlayer
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook jika di kklik menampilkan halaman facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/ Lilik Nur Hidayat"))
            startActivity(i)
        })

        //button Instagram jika di kklik menampilkan halaman instagram.com

        btn_intagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/ langitinsprirasi.co.id"))
            startActivity(i)
        })
var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.everlong)
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
