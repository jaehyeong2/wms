package jjafactory.wms.domain.user

import jakarta.persistence.*


@Entity
@Table(
    name = "users"
)
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null,

    val lastName: String,
    val firstName: String,
    val phone: String
) {
}