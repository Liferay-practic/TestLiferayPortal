<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@
        taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@
        taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@
        taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:actionURL var="createNotice">
    <portlet:param name="javax.portlet.action" value="addNotice"/>
</portlet:actionURL>

<portlet:actionURL var="deleteNotice">
    <portlet:param name="javax.portlet.action" value="deleteNoticeById"/>
</portlet:actionURL>

<portlet:actionURL var="updateNotice">
    <portlet:param name="javax.portlet.action" value="updateNoticeById"/>
</portlet:actionURL>

<liferay-theme:defineObjects/>

<portlet:defineObjects/>
