<%@ include file="init.jsp" %>

<c:if test="${themeDisplay.signedIn}">
    <portlet:actionURL var="createNotice">
        <portlet:param name="javax.portlet.action" value="addNotice"/>
    </portlet:actionURL>

    <c:forEach items="${userNotice}" var="noticeLine" varStatus="status">
        <p>${noticeLine}</p>
    </c:forEach>

    <aui:form action="${createNotice}" method="post">
        <aui:input type="textarea" maxlength="70" name="text"/>
        <aui:button type="submit" value="Create notice"/>
    </aui:form>
    <c:otherwise>
        <h4>Unknown user</h4>
    </c:otherwise>
</c:if>
