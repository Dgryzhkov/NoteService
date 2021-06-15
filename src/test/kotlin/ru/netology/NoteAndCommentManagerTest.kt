package ru.netology

import Services.NoteAndCommentManager
import org.junit.Test

import org.junit.Assert.*

class NoteAndCommentManagerTest {

    @Test
    fun addNote() {
        val user1 = "user1"
        val user1NoteId = NoteAndCommentManager.addNote(user1, "note title1", "text 1")

    }
/*
    @Test
    fun addComment() {
    }

    @Test
    fun getNote() {
    }

    @Test
    fun getComments() {
    }*/
}