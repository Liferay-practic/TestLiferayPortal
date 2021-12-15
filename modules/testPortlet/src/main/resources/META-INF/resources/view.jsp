<%@ include file="/init.jsp" %>

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

<h4>Download file link</h4>
<a href="<portlet:resourceURL id="/download" />">Download</a>