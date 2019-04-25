package com.example.demo.controllers.admin;

import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.entities.Address;

public class AddressControllerAdmin extends BaseAdminLinkedController<Address> {

	public static final String ADDRESS_CONTROLLER_ADMIN_NAME = "address";

	protected AddressControllerAdmin() {
		super(ADDRESS_CONTROLLER_ADMIN_NAME, Address.class);
	}

	@Override
	public Boolean checkEquality(Address item, Long externalId, String linkedItem) {
		return null;
	}

}
