package com.example.actorg

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object NoteScreen : Screen("note_screen")

//    fun withArgs(vararg args: String): String{
//        return buildString {
//            append(route)
//            args.forEach { arg ->
//                append("/$arg")
//            }
//        }
//    }
}