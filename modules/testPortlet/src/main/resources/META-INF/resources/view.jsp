<%@ include file="init.jsp" %>

<c:if test="${themeDisplay.signedIn}">
    <portlet:actionURL var="createNotice">
        <portlet:param name="javax.portlet.action" value="addNotice"/>
    </portlet:actionURL>

    <portlet:actionURL var ="deleteNotice">
        <portlet:param name="javax.portlet.action" value="deleteNoticeById"/>
    </portlet:actionURL>

    <c:forEach items="${userNotice}" var="notice" >
        <tr>
            <td><p>Notice-------------------------------------------------------------</p></td>
            <td><pre>${notice.noticeText}</pre></td>
            <aui:form action="${deleteNotice}" method="post">
                <aui:input type="hidden" name="noticeId" value="${notice.noticeId}"/>
                <aui:button type="submit" value="x"/>
            </aui:form>
            <td><p>x------------------------------------------------------------------x</p></td>
        </tr>
    </c:forEach>


    <aui:form action="${createNotice}" method="post">
        <aui:input type="textarea" maxlength="70" name="text"/>
        <aui:button type="submit" value="Create notice"/>
    </aui:form>
    <c:otherwise>
        <h4>Unknown user</h4>
    </c:otherwise>
</c:if>
