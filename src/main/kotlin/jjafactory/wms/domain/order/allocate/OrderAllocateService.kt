package jjafactory.wms.domain.order.allocate

interface OrderAllocateService {
    fun updateStatus(orderId: Long): Long
}