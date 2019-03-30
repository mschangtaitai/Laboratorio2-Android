package com.example.laboratory2

class HistoryList(override val lapHistory: ArrayList<Int>) : LapHistory {

    override fun clear(){
        this.lapHistory.clear()
    }

    override fun add(element: Int){
        this.lapHistory.add(element)
    }

    override fun del(elementIndex: Int){
        this.lapHistory.removeAt(elementIndex)
    }

}