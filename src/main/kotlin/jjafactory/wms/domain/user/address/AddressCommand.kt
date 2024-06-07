package jjafactory.wms.domain.user.address

class AddressCommand {
    data class Create(
        val userId: Long,
        val alias: String,
        val isDefault: Boolean,
        val postCode: String,
        val city: String
    ){
        fun toEntity(): Address {
            return Address(
                userId = userId,
                alias = alias,
                isDefault = isDefault,
                postCode = postCode,
                city = city
            )
        }
    }
}