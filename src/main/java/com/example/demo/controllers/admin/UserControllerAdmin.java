package com.example.demo.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.controllers.admin.base.BaseAdminController;
import com.example.demo.controllers.admin.base.BaseAdminLinkedController;
import com.example.demo.entities.Product;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;
import com.example.demo.entities.utils.EntitiesMapping;

@Controller
@RequestMapping(value = {"/" + BaseAdminController.BASE_ADMIN_CONTROLLER_NAME + "/" + UserControllerAdmin.USER_CONTROLLER_ADMIN_NAME})
public class UserControllerAdmin extends BaseAdminLinkedController<User> {

    public static final String USER_CONTROLLER_ADMIN_NAME = "user";

    protected UserControllerAdmin() {
        super(USER_CONTROLLER_ADMIN_NAME, User.class);
    }

    @Override
    public Boolean checkEquality(User item, Long externalId, String linkedItem) {
        Boolean result = null;

        switch (linkedItem) {
        case EntitiesMapping.ADDRESS_TO_USER:
            if (item.getAddress().getId().equals(externalId)) {
                result = true;
                break;
            }
            break;

        /*case EntitiesMapping.ROLE_TO_USER:
            for (Role role : item.getRoles()) {
                if (role.getId().equals(externalId)) {
                    result = true;
                    break;
                }
            }
            break;

        case EntitiesMapping.PRODUCT_TO_USER:
            for (Product p : item.getProducts()) {
                if (p.getId().equals(externalId)) {
                    result = true;
                    break;
                }
            }
            break;*/

        default:
            break;
        }

        return result;
    }

}
