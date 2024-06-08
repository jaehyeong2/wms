package jjafactory.wms.domain.order.allocate

import jjafactory.wms.domain.order.OrderReader
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Transactional
@Service
class OrderAllocateServiceImpl(
    private val orderReader: OrderReader
) : OrderAllocateService {
    override fun updateStatus(orderId: Long): Long {
        val order = orderReader.getById(orderId)
        order.updateToReady()

        return orderId
    }
}