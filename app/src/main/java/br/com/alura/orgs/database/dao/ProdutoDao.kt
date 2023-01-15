package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {

    @Query("SELECT * FROM PRODUTO")
    fun buscarTodos(): List<Produto>

    @Insert
    fun salvarProduto(vararg produto: Produto)
}