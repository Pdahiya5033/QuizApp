package com.example.quizapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class QuestionsAdapter(questions:ArrayList<QuestionsClass>): RecyclerView.Adapter<QuestionsAdapter.QuestionsViewHolder>() {
    private val gotQues=questions
    private var holderPosition=0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.questions_recview_content,
            parent, false)
        return QuestionsViewHolder(view)
    }
    override fun onBindViewHolder(holder: QuestionsViewHolder, position: Int) {
        holder.questionText.text=gotQues[position].questionText
        holder.ans1.text=gotQues[position].ans[0]
        holder.ans2.text=gotQues[position].ans[1]
        holder.ans3.text=gotQues[position].ans[2]
        holder.ans4.text=gotQues[position].ans[3]
        holderPosition=holder.adapterPosition
    }
    override fun getItemCount(): Int {
        return gotQues.size
    }
        inner class QuestionsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val questionText=itemView.findViewById<TextView>(R.id.questionTV)
        val ans1=itemView.findViewById<TextView>(R.id.ansr1)
        val ans2=itemView.findViewById<TextView>(R.id.ansr2)
        val ans3=itemView.findViewById<TextView>(R.id.ansr3)
        val ans4=itemView.findViewById<TextView>(R.id.ansr4)
        val radio1=itemView.findViewById<RadioButton>(R.id.radio1)
        val radio2=itemView.findViewById<RadioButton>(R.id.radio2)
        val radio3=itemView.findViewById<RadioButton>(R.id.radio3)
        val radio4=itemView.findViewById<RadioButton>(R.id.radio4)

    }

}