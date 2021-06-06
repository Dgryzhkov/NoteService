package Services

import Comment
import NotesService
import getUniwueId
import model.Note

object NoteAndCommentManager {
    private val commentServices = CommentServices()
    private val noteServices = NotesService()

    fun addNote(userId:String, title:String, text:String):String{
        val uniqueId = getUniwueId().toString()
        val newNote = Note(uniqueId, title, text)
        noteServices.add(userId, newNote)
        return uniqueId
    }

    fun addComment(userId: String, noteId: String, message: String) {
        val newComment = Comment(noteId, message)
        commentServices.add(userId, newComment)
    }

    fun getNote(userId: String, vararg noteIds: String) =
        noteServices.get(userId, *noteIds)

    fun getComments(userId: String, vararg noteIds: String) =
        commentServices.get(userId,*noteIds)
}