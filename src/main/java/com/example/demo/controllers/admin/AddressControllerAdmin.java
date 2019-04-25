package com.example.demo.controllers.admin;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.entities.Address;
import com.example.demo.entities.Product;

@Controller
@RequestMapping(value = {UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + UriUtils.URI_SLASH + AddressControllerAdmin.PRODUCT_CONTROLLER_ADMIN_NAME})
public class AddressControllerAdmin extends BaseAdminLinkedController<Address> {

	public static final String PRODUCT_CONTROLLER_ADMIN_NAME = "address";

    protected AddressControllerAdmin() {
        super(PRODUCT_CONTROLLER_ADMIN_NAME, Address.class);
    }

	@Override
	public String details(Model model, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkEquality(Address item, Long externalId, String linkedItem) {
		// TODO Auto-generated method stub
		return null;
	}
}
