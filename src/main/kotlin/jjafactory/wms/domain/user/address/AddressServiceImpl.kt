package jjafactory.wms.domain.user.address

import jjafactory.wms.infrastructure.address.AddressRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class AddressServiceImpl(
    private val addressRepository: AddressRepository
) : AddressService {
    override fun addAddressToUser(command: AddressCommand.Create): Long {
        val initAddress = command.toEntity()
        //todo default 관련 처리

        return addressRepository.save(initAddress).id!!
    }

    override fun updateDefaultAddress(): Long {
        TODO("Not yet implemented")
    }
}