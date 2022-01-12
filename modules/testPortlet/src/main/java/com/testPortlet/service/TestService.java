package com.testPortlet.service;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.testService.exception.NoSuchTestNoticeException;
import com.testService.model.TestNotice;
import com.testService.service.TestNoticeLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.List;
import java.util.stream.Collectors;

@Component(service = TestService.class)
public class TestService {

    @Reference
    private TestNoticeLocalService _noticeLocalService;

    public void addNotice(String text, long ownerId) {
        TestNotice notice = _noticeLocalService.createTestNotice(CounterLocalServiceUtil.increment());
        notice.setNoticeText(text);
        notice.setOwnerId(ownerId);
        _noticeLocalService.addTestNotice(notice);
    }

    public TestNotice getNotice(long ownerId) throws NoSuchTestNoticeException {
        return _noticeLocalService.findByOwnerId(ownerId);
    }

    public void deleteNoticeById(long noticeId) throws PortalException {
        _noticeLocalService.deleteTestNotice(noticeId);
    }

    public List<TestNotice> getAllByOwnerId(long ownerId) {
        return _noticeLocalService.findAll().stream().filter(n -> n.getOwnerId() == ownerId).collect(Collectors.toList());
    }

    public void editNotice(long noticeId, String text) throws PortalException {
        TestNotice notice = _noticeLocalService.getTestNotice(noticeId);
        notice.setNoticeText(text);
        _noticeLocalService.updateTestNotice(notice);
    }
}
