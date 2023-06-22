package com.inhatc.inflearn_kindjetpack.liveData.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inhatc.inflearn_kindjetpack.R
import com.inhatc.inflearn_kindjetpack.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFragmentBinding
    val manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        * replace -> 현재 스택에서 특정 Fragment를 pop 하고
        * 해당 Fragment를 추가 하는 메소드로 기존 Fragment가 아니라
        * 새로운 Fragment가 생성된다
        *
        * */

        binding.button.setOnClickListener {
            val transaction1 = manager.beginTransaction()
            transaction1.replace(R.id.frameArea, BlankFragment())
            transaction1.addToBackStack(null)
            transaction1.commit()
        }

        binding.button2.setOnClickListener {
            val transaction2 = manager.beginTransaction()
            transaction2.replace(R.id.frameArea, BlankFragment2())
            transaction2.addToBackStack(null)
            transaction2.commit()
        }



    }
}