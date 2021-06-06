package Services

import Comment

class CommentServices : CrudService<Comment> {
    private val userNotes = mutableMapOf<String, MutableList<Comment>>()


    override fun add(userId: String, newItem: Comment) {

        userNotes[userId]?.let {
            it.add(newItem)
        } ?: kotlin.run {
            val newNotesList = mutableListOf<Comment>()
            newNotesList.add(newItem)
            userNotes[userId] = newNotesList
        }
    }


    override fun delete(userId: String, itemId: String) {
        userNotes[userId]?.removeIf {
            it.noteId == itemId
        }

    }

    override fun get(userId: String, vararg ids: String): List<Comment> {
        return userNotes[userId]?.filter {
            ids.contains(it.noteId)

        }?: emptyList()
    }
}
