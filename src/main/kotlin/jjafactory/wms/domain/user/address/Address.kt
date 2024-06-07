package jjafactory.wms.domain.user.address

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Address(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val userId: Long,
    val alias: String,
    var isDefault: Boolean,

    var postCode: String,
    var city: String
) {
}