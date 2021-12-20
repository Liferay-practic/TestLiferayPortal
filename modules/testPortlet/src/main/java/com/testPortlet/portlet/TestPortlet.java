package com.testPortlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.testPortlet.constants.TestPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.testPortlet.service.CustomUtil;
import com.testPortlet.service.TestService;
import com.testService.exception.NoSuchTestNoticeException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author ruslan
 */
@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.sample",
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true",
                "javax.portlet.display-name=Test",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + TestPortletKeys.TEST,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=power-user,user"
        },
        service = Portlet.class
)
public class TestPortlet extends MVCPortlet {

    @Reference
    private TestService _customService;

    @Reference
    private CustomUtil _customUtil;

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        renderRequest.setAttribute("userList", _customService.getAllUser());

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
        long id = themeDisplay.getUserId();
        if(!themeDisplay.isSignedIn()){
            id = 0;
        }

        try {
            renderRequest.setAttribute("userNotice", _customService.getNotice(id));
        } catch (NoSuchTestNoticeException e) {
            e.printStackTrace();
        }

        super.render(renderRequest, renderResponse);
    }

    @ProcessAction(name = "addNotice")
    public void actionNotice(ActionRequest request, ActionResponse response) {
        User user = (User) request.getAttribute(WebKeys.USER);
        long id = user.getUserId();
        String noticeText = ParamUtil.getString(request,"text");
        _customService.addNotice(noticeText,id);
    }

    @ProcessAction(name = "actionAdd")
    public void actionAdd(ActionRequest actionRequest, ActionResponse actionResponse) {

        _customService.addNewUser(
                ParamUtil.getString(actionRequest, "name"),
                ParamUtil.getString(actionRequest, "mail"),
                ParamUtil.getString(actionRequest, "message")
        );

    }

    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
        try {
            PortletResponseUtil.sendFile(
                    resourceRequest, resourceResponse, "someFile.txt",
                    "Hellop".getBytes(), "text");

        } catch (IOException ioException) {
            ioException.printStackTrace();

        }
    }


    @Activate
    public void activate() {
        System.out.println("Custom portlet activated>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><");
    }
}