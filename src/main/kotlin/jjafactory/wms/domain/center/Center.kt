package jjafactory.wms.domain.center

import jakarta.persistence.*


@Entity
@Table(
    name = "centers"
)
class Center(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null,

    val name: String,
    val phone: String
) {
}