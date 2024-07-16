package br.com.dominiobancario.model

import jakarta.persistence.Entity

@Entity(name = "tb_news")
data class News(
    override var icon: String,
    override var description: String
) : BaseItem(0, icon, description)
