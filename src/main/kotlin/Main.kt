import Services.NoteAndCommentManager

fun main() {
    val user1 = "user1"
    val user2 = "user2"
    val user1NoteId = NoteAndCommentManager.addNote(user1, "note title1", "text 1")
    NoteAndCommentManager.addComment(user1, user1NoteId, "message2")
NoteAndCommentManager.addComment(user1,user1NoteId,"message2")
    val user2NoteId = NoteAndCommentManager.addNote(user2,"user2 tilte", "user2 text")
println("notes and comments user1")
    println(NoteAndCommentManager.getNote(user1,user1NoteId))
    println(NoteAndCommentManager.getComments(user1,user1NoteId))

    println("\n\nnotes and comments user2")
    println(NoteAndCommentManager.getNote(user2,user2NoteId))
    println(NoteAndCommentManager.getComments(user2,user2NoteId))

}
