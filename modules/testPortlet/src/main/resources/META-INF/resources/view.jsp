<%@ include file="init.jsp" %>

<c:if test="${themeDisplay.signedIn}">
    <portlet:actionURL var="createNotice">
        <portlet:param name="javax.portlet.action" value="addNotice"/>
    </portlet:actionURL>

    <portlet:actionURL var="deleteNotice">
        <portlet:param name="javax.portlet.action" value="deleteNoticeById"/>
    </portlet:actionURL>

    <portlet:actionURL var="updateNotice">
        <portlet:param name="javax.portlet.action" value="updateNoticeById"/>
    </portlet:actionURL>

    <c:forEach items="${userNotice}" var="notice">
        <tr>
            <td>
                <div>
                <aui:form action="${updateNotice}" method="post">
                    <aui:input type="textarea" name="text" ignoreRequestValue="true" value="${notice.noticeText}"/>
                    <aui:input name="id" type="hidden" value="${notice.noticeId}"/>
                    <aui:button type="submit" value="Edit"/>
                </aui:form>
                </div>
            </td>
            <td>
                <aui:form action="${deleteNotice}" method="post">
                    <aui:input type="hidden" name="noticeId" value="${notice.noticeId}"/>
                    <aui:button type="submit" value="x"/>
                </aui:form>
            </td>
        </tr>
    </c:forEach>
    <aui:form action="${createNotice}" method="post">
        <aui:input type="hidden" name="text" value="new message"/>
        <aui:button type="submit" value="Create notice"/>
    </aui:form>
    <c:otherwise>
        <h4>Unknown user</h4>
    </c:otherwise>
</c:if>
