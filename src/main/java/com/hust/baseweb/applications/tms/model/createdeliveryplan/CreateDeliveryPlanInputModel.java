package com.hust.baseweb.applications.tms.model.createdeliveryplan;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateDeliveryPlanInputModel {
	private String deliveryDate;
	private String createdByUserLoginId;
	private String description;
}
