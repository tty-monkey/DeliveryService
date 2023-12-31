package com.ttymonkey.deliverysimulation.adapters.delivery

import com.ttymonkey.deliverysimulation.models.domain.Order
import com.ttymonkey.deliverysimulation.ports.delivery.DeliveryInputPort
import com.ttymonkey.deliverysimulation.services.delivery.DeliveryService

class DeliveryServiceInputAdapter(private val deliveryService: DeliveryService) : DeliveryInputPort {
    override suspend fun handleNewOrder(order: Order) {
        deliveryService.handleNewOrder(order)
    }
}
