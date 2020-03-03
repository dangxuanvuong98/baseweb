package com.hust.baseweb.applications.tms.service;

import com.hust.baseweb.applications.tms.entity.DeliveryTrip;
import com.hust.baseweb.applications.tms.model.createdeliverytrip.CreateDeliveryTripInputModel;
import com.hust.baseweb.applications.tms.model.deliverytrip.DeliveryTripInfoModel;
import com.hust.baseweb.applications.tms.model.shipmentitem.ShipmentItemModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface DeliveryTripService {
    public DeliveryTrip save(CreateDeliveryTripInputModel input);

    Page<DeliveryTrip> findAllByDeliveryPlanId(String deliveryPlanId, Pageable pageable);

    DeliveryTrip findById(UUID deliveryTripId);

    DeliveryTripInfoModel getDeliveryTripInfo(String deliveryTripId, List<ShipmentItemModel.TripDetailSelected> shipmentItemModels);
}
