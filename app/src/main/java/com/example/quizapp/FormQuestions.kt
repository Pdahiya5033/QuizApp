package com.example.quizapp

class FormQuestions {
    fun generateQuestionsClass(): ArrayList<QuestionsClass> {
        val questionsArr=ArrayList<QuestionsClass>()
        val quest1=QuestionsClass()
        quest1.questionText="What is capital of India ? "
        quest1.ans.add("Kolkata")
        quest1.ans.add("Delhi")
        quest1.ans.add("Hyderabad")
        quest1.ans.add("Mumbai")
        quest1.correctAns=1
        val quest2=QuestionsClass()
        quest2.questionText="Who is Prime Minister of India ?"
        quest2.ans.add("Dr. Manmohan Singh")
        quest2.ans.add("Smt. Draupadi Murmu")
        quest2.ans.add("Sh. Narendra Modi")
        quest2.ans.add("Sh. Arun Jaitley")
        quest2.correctAns=2
        val quest3=QuestionsClass()
        quest3.questionText="Who is Prime Minister of India ?"
        quest3.ans.add("Dr. Manmohan Singh")
        quest3.ans.add("Smt. Draupadi Murmu")
        quest3.ans.add("Sh. Narendra Modi")
        quest3.ans.add("Sh. Arun Jaitley")
        quest3.correctAns=2
        questionsArr.add(quest1)
        questionsArr.add(quest2)
        questionsArr.add(quest3)
        return questionsArr
    }
}