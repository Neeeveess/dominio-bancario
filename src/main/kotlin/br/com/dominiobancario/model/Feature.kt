package br.com.dominiobancario.model

import jakarta.persistence.Entity

@Entity(name = "tb_feature")
data class Feature(
    override var icon: String,
    override var description: String
) : BaseItem(0, icon, description)
