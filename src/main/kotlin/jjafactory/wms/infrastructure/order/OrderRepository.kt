package jjafactory.wms.infrastructure.order

import jjafactory.wms.domain.order.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
}