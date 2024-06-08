package jjafactory.wms.domain.order.cancel

interface OrderCancelService {
    fun cancel(orderId: Long): Long
}