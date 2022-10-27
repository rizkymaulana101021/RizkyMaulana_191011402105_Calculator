package com.example.rizkymaulana_191011402105_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clear(view: View) {
        val input1 = edt_angka1
        val input2 = edt_angka2
        val hasil = txt_hasil

        input1.text = null
        input2.text = null
        hasil.text = "0"
    }

    fun tambah(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil = txt_hasil

        if (input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama !")
        }else if (input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua !")
        }else {
            var jumlah = input1.toDouble() + input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }
    fun kurang(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil = txt_hasil

        if (input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama !")
        }else if (input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua !")
        }else {
            var jumlah = input1.toDouble() - input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }
    fun kali(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil = txt_hasil

        if (input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama !")
        }else if (input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua !")
        }else {
            var jumlah = input1.toDouble() * input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }
    fun  bagi(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil = txt_hasil

        if (input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama !")
        }else if (input2.isEmpty()) {
            edt_angka2.setError("Masukkan angka kedua !")
        }else {
            var jumlah = input1.toDouble() / input2.toDouble()
            hasil.text = jumlah.toString()
        }
    }
    fun modulus(view: View) {
        val input1 = edt_angka1.text.toString()
        val input2 = edt_angka2.text.toString()
        val hasil = txt_hasil

        if (input1.isEmpty()) {
            edt_angka1.setError("Masukkan angka pertama !")
        }else {
            var jumlah = input1.toDouble() / 100
            hasil.text = jumlah.toString()
        }
    }
}