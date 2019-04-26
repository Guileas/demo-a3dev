package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.controllers.utils.UriUtils;
import com.example.demo.entities.Product;
import com.example.demo.entities.User;
import com.example.demo.entities.utils.EntitiesMapping;

@Controller
@RequestMapping(value = {UriUtils.URI_SLASH + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + UriUtils.URI_SLASH + ProductControllerAdmin.PRODUCT_CONTROLLER_ADMIN_NAME})
public class ProductControllerAdmin extends BaseAdminLinkedController<Product> {

	public static final String PRODUCT_CONTROLLER_ADMIN_NAME = "product";

    protected ProductControllerAdmin() {
        super(PRODUCT_CONTROLLER_ADMIN_NAME, Product.class);
    }

	@Override
	public Boolean checkEquality(Product item, Long externalId, String linkedItem) {
		Boolean result = false;

        switch (linkedItem) {
        case EntitiesMapping.PRODUCT_TO_USER:
        	for(User user : item.getUsers())
            if (user.getId().equals(externalId)) {
                result = true;
                break;
            }
            break;
        default:
            break;
        }
        return result;
	}
}
