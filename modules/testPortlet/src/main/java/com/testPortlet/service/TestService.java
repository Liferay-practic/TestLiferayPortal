package com.testPortlet.service;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import com.testService.exception.NoSuchTestNoticeException;
import com.testService.model.TestNotice;
import com.testService.model.TestUser;
import com.testService.service.TestNoticeLocalService;
import com.testService.service.TestUserLocalService;
import com.testService.service.persistence.TestNoticePersistence;
import com.testService.service.persistence.TestNoticeUtil;
import com.testService.service.persistence.impl.TestNoticePersistenceImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;

@Component(service = TestService.class)
public class TestService {

    @Reference
    private TestUserLocalService _customUserLocalService;

    @Reference
    private TestNoticeLocalService _noticeLocalService;

    @Reference
    private CustomUtil _customUtil;


    public List<TestUser> getAllUser(){
        return _customUserLocalService.getTestUsers(-1, -1);
    }

    public void addNewUser(String name, String mail, String message){
        TestUser customUser = _customUserLocalService.createTestUser(CounterLocalServiceUtil.increment());

        customUser.setName(name);
        customUser.setMail(mail);
        customUser.setMessage(message);

        _customUserLocalService.addTestUser(customUser);

    }

    public void addNotice(String text, long ownerId){
        TestNotice notice = _noticeLocalService.createTestNotice(CounterLocalServiceUtil.increment());

        notice.setNoticeText(text);
        notice.setOwnerId(ownerId);

        _noticeLocalService.addTestNotice(notice);
    }

    public String[] getNotice(long ownerId) throws NoSuchTestNoticeException {
        return _customUtil.StringIntoStringArray(_noticeLocalService.findByOwnerId(ownerId).getNoticeText());
    }
}
