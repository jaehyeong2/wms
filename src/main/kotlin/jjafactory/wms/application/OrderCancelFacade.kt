package jjafactory.wms.application

import jjafactory.wms.domain.order.cancel.OrderCancelService

class OrderCancelFacade(
    private val orderCancelService: OrderCancelService
) {

    fun cancelOrder(orderId: Long): Long {
        return orderCancelService.cancel(orderId)
    }

}
