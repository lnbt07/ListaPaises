package com.example.listapaises

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.listapaises.adapter.ItemAdapter
import com.example.listapaises.data.Datasource
import com.example.listapaises.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btCadastrar.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        val dataset = Datasource().carregarPaises()
       binding.rvPaises.adapter = ItemAdapter(this, dataset)
    }
}