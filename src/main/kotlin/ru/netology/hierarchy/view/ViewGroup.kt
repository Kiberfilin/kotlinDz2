package ru.netology.hierarchy.view

class ViewGroup() : View() {
    lateinit var view: View
    fun addView(view: View) {
        this.view = view
    }
}