package jjafactory.wms.domain.order

import jakarta.persistence.*

@Table(
    name = "orders"
)
@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null
) {
}