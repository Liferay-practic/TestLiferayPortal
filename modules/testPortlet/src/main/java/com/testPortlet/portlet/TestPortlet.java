package com.testPortlet.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.testPortlet.constants.TestPortletKeys;
import com.testPortlet.service.TestService;
import com.testService.exception.NoSuchTestNoticeException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;

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

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

        if (themeDisplay.isSignedIn()) {
            renderRequest.setAttribute("userNotice", _customService.getAllByOwnerId(themeDisplay.getUserId()));
        }

        super.render(renderRequest, renderResponse);
    }

    @ProcessAction(name = "addNotice")
    public void actionNotice(ActionRequest request, ActionResponse response) {
        User user = (User) request.getAttribute(WebKeys.USER);
        _customService.addNotice(ParamUtil.getString(request, "text"), user.getUserId());
    }

    @ProcessAction(name = "deleteNoticeById")
    public void deleteNoticeById(ActionRequest request, ActionResponse response) throws PortalException {
        _customService.deleteNoticeById(ParamUtil.getLong(request, "noticeId"));
    }

}
