<%@ page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ include file="init.jsp" %>

<c:if test="${themeDisplay.signedIn}">
	<table>
		<tr>
			<th>User</th>
			<th>Mail</th>
			<th>Message</th>
		</tr>
		<c:forEach items="${userList}" var="user" varStatus="status">
			<tr>
				<td>${user.name}</td>
				<td>${user.mail}</td>
				<td>${user.message}</td>
			</tr>
		</c:forEach>
	</table>

	<portlet:actionURL var="addAction">
		<portlet:param name="javax.portlet.action" value="actionAdd"/>
	</portlet:actionURL>

	<aui:form action="${addAction}" method="post">
		<aui:input type="text" label="Name:" name="name" value="user name" />
		<aui:input type="text" label="Mail:" name="mail" value="user mail" />
		<aui:input type="text" label="Message:" name="message" value="message" />
		<aui:button type="submit" value="Submit" />
	</aui:form>

	<c:forEach items="${userNotice}" var="noticeLine" varStatus="status">
		<p>${noticeLine}</p>
	</c:forEach>

	<portlet:actionURL var="createNotice">
		<portlet:param name="javax.portlet.action" value="addNotice"/>
	</portlet:actionURL>

	<aui:form action="${createNotice}" method="post">
		<aui:input type="textarea" maxlength="70" name="text" />
		<aui:button type="submit" value="Create notice"/>
	</aui:form>

	<h4>Download file link</h4>
	<a href="<portlet:resourceURL id="/download" />">Download</a>
<c:otherwise>
	<h4>Unknown user</h4>
</c:otherwise>
</c:if>
