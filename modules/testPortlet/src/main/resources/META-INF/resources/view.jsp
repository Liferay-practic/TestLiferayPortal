<%@ include file="init.jsp" %>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script type="text/javascript">
    <%@include file="js/ajax"%>
</script>
<c:if test="${themeDisplay.signedIn}">
    <c:forEach items="${userNotice}" var="notice">
        <tr>
            <td>
                <form>
                    <textarea name="noticeText" ignoreRequestValue="true" id="noticeText" rows="5"
                              cols="33">${notice.noticeText}</textarea>
                    <input name="noticeId" type="hidden" id="noticeId" value="${notice.noticeId}"/>
                    <button class="editNotice">Edit</button>
                    <input type="hidden" name="noticeId" id="noticeDelId" value="${notice.noticeId}"/>
                    <button class="deleteNotice">Delete</button>
                </form>
            </td>
        </tr>
    </c:forEach>
    <ol>
    </ol>
    <button class="appendArea">Append list items</button>
    <c:otherwise>
        <h4>Unknown user</h4>
    </c:otherwise>
</c:if>
