package br.com.dominiobancario.model

import jakarta.persistence.*

@Entity(name = "tb_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,

    @OneToOne(cascade = [CascadeType.ALL])
    val account: Account,

    @OneToOne(cascade = [CascadeType.ALL])
    val card: Card,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    val feature: List<Feature>,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    val news: List<News>,

)
