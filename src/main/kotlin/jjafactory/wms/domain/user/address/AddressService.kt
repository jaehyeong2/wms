package jjafactory.wms.domain.user.address

interface AddressService {
    fun addAddressToUser(command: AddressCommand.Create): Long
    fun updateDefaultAddress(): Long
}