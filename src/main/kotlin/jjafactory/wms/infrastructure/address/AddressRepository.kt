package jjafactory.wms.infrastructure.address

import jjafactory.wms.domain.user.address.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository: JpaRepository<Address, Long> {
}