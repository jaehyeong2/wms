package jjafactory.wms.domain.order.cancel

import jjafactory.wms.application.OrderCancelFacade
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/orders/cancel")
@RestController
class OrderCancelApi(
    private val orderCancelFacade: OrderCancelFacade
) {
}