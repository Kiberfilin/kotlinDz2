package ru.netology.hierarchy.view

class ViewGroup(var view: View) : View() {
    fun addView(view: View) {
        this.view = view
    }
}