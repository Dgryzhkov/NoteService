package Services

//попытаться сделать абстрактным классом
interface CrudService <T>{


    fun add (userId:String, newItem: T)
    fun delete(userId: String, itemId: String)

    fun get(userId: String, vararg ids: String): List<T>
}