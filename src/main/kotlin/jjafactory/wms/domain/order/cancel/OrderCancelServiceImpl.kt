package jjafactory.wms.domain.order.cancel

import jjafactory.wms.domain.order.OrderReader
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class OrderCancelServiceImpl(
    private val orderReader: OrderReader
) : OrderCancelService {
    override fun cancel(orderId: Long): Long {
        val order = orderReader.getById(orderId)

        order.cancel()
        return orderId
    }
}