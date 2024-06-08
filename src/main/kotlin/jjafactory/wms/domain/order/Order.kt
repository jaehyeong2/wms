package jjafactory.wms.domain.order

import jakarta.persistence.*
import java.time.LocalDateTime

@Table(
    name = "orders"
)
@Entity
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?= null,
    
    var status: String? = "TEMP",

    var canceledAt: LocalDateTime
) {

    fun updateToReady(){
        status = "READY"
    }

    fun cancel(){
        status = "CANCEL"
        canceledAt = LocalDateTime.now()
    }
}