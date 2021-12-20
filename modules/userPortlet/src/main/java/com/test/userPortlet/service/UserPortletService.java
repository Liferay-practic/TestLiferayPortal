package com.test.userPortlet.service;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.testService.model.TestUser;
import com.testService.service.TestUserLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = UserPortletService.class)
public class UserPortletService {

    @Reference
    private TestUserLocalService _customUserLocalService;

    public List<TestUser> getAllUser() {
        return _customUserLocalService.getTestUsers(-1, -1);
    }

    public void addNewUser(String name, String mail, String message) {
        TestUser customUser = _customUserLocalService.createTestUser(CounterLocalServiceUtil.increment());

        customUser.setName(name);
        customUser.setMail(mail);
        customUser.setMessage(message);

        _customUserLocalService.addTestUser(customUser);
    }
}
