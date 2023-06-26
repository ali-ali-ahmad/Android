package com.example.mvvmbasictut.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmbasictut.data.Quote
import com.example.mvvmbasictut.databinding.ActivityQuotesBinding
import com.example.mvvmbasictut.utilities.InjectorUtils
import java.lang.StringBuilder

class QuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeUi()
    }

    private fun initializeUi(){
        val factory = InjectorUtils.provideQuotesViewModelFactory()
        val viewModel = ViewModelProviders.of(this, factory)
            .get(QuotesViewModel::class.java)

        viewModel.getQuotes().observe(this, Observer { quotes ->
            val stringBuilder = StringBuilder()
            quotes.forEach { quote ->
                stringBuilder.append("$quote\n\n")
            }
            binding.textViewQuotes.text = stringBuilder.toString()
        })

        binding.buttonAddQuote.setOnClickListener {
            val quote = Quote(binding.editTextQuote.text.toString(), binding.editTextAuthor.text.toString())
            viewModel.addQuote((quote))
            binding.editTextQuote.setText("")
            binding.editTextAuthor.setText("")
        }
    }
}