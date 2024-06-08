package jjafactory.wms.domain.order

import jjafactory.wms.infrastructure.order.OrderRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class OrderReaderImpl(
    private val orderRepository: OrderRepository
) : OrderReader {

    @Transactional(readOnly = true)
    override fun getById(id: Long): Order {
        return orderRepository.findByIdOrNull(id) ?: throw NotFoundException()
    }
}