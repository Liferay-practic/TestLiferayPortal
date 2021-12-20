package com.test.userPortlet.portlet;

import com.liferay.portal.kernel.util.ParamUtil;
import com.test.userPortlet.constants.UserPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.test.userPortlet.service.UserPortletService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=User",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + UserPortletKeys.USER,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)

public class UserPortlet extends MVCPortlet {

    @Reference
    UserPortletService userPortletService;

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        renderRequest.setAttribute("userList", userPortletService.getAllUser());
        super.render(renderRequest, renderResponse);
    }

    @ProcessAction(name = "actionAdd")
    public void actionAdd(ActionRequest actionRequest, ActionResponse actionResponse) {
        userPortletService.addNewUser(
                ParamUtil.getString(actionRequest, "name"),
                ParamUtil.getString(actionRequest, "mail"),
                ParamUtil.getString(actionRequest, "message")
        );
    }

}