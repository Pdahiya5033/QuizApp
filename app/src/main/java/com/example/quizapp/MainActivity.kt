package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.Normalizer.Form

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar=findViewById<ProgressBar>(R.id.progressBar_homeSrc)
        val recyclerView=findViewById<RecyclerView>(R.id.questions_recView)
        val nextBtn:CardView=findViewById(R.id.next_btn)
        val previousBtn:CardView=findViewById(R.id.previous_btn)
        val radio1=findViewById<RadioButton>(R.id.radio1)
        val radio2=findViewById<RadioButton>(R.id.radio2)
        val radio3=findViewById<RadioButton>(R.id.radio3)
        val radio4=findViewById<RadioButton>(R.id.radio4)
        val questions=getQuestions()
        var currentPos=0
        progressBar.progress=(100/questions.size)
        val questionsAdapter=QuestionsAdapter(questions)
        recyclerView.adapter=questionsAdapter
        recyclerView.layoutManager=LinearLayoutManager(applicationContext,LinearLayoutManager.HORIZONTAL,false)
        nextBtn.setOnClickListener {
            if(++currentPos<questions.size){
                recyclerView.smoothScrollToPosition(currentPos)
                progressBar.progress=(100/questions.size)*(currentPos+1)

            }
            else{
                currentPos=questions.size-1
                Toast.makeText(applicationContext,"You are already at end of quiz",Toast.LENGTH_SHORT).show()
            }

        }
        previousBtn.setOnClickListener {
                if(currentPos>0){
                    currentPos--
                    recyclerView.smoothScrollToPosition(currentPos)
                    progressBar.progress=(100/questions.size)*(currentPos+1)
                }
                else{
                    currentPos=0
                    Toast.makeText(applicationContext,"You are at beginning of quiz",Toast.LENGTH_SHORT).show()
                }
        }
//        radio1.setOnCheckedChangeListener { buttonView, isChecked ->
//            if(isChecked)
//                uncheckAll(radio2,radio3,radio4)
//        }
    }
    fun getQuestions(): ArrayList<QuestionsClass> {
        val formQuestions=FormQuestions()
        val questions=formQuestions.generateQuestionsClass()
        return questions
    }
    fun uncheckAll(rad1:RadioButton,rad2:RadioButton,rad3:RadioButton){
        rad1.isChecked=false
        rad2.isChecked=false
        rad3.isChecked=false
    }
}