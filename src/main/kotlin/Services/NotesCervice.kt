import Services.CrudService
import model.Note

class NotesService : CrudService<Note> {
    private val userNotes = mutableMapOf<String, MutableList<Note>>()

    override fun add(userId: String, newItem: Note) {
        val uniqueId=getUniwueId()
        userNotes[userId]?.let {
            it.add(newItem)
        } ?: kotlin.run {
            val newNotesList = mutableListOf<Note>()
            newNotesList.add(newItem)
            userNotes[userId] = newNotesList
        }
    }

    override fun delete(userId: String, itemId: String) {
userNotes[userId]?.removeIf{
    it.noteId == itemId
}

    }

    override fun get(userId: String, vararg ids: String): List<Note> {
       return userNotes[userId]?.filter {
           ids.contains(it.noteId)
       }?: emptyList()
    }


}


