<%--

    Copyright (C) 2014 Thiago Moreira (tmoreira2020@gmail.com)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
<%@ include file="/init.jsp" %>

<c:if test="${not layout.typeControlPanel}">
	<div class="share-buttons-bar hidden-phone">

		<%
			String currentUrl = HttpUtil.encodeURL(PortalUtil.getCurrentCompleteURL(request));
		%>
		<a href="https://www.facebook.com/sharer/sharer.php?u=<%= currentUrl %>" target="_blank" title="Share on Facebook"> 
			<i class="icon-facebook"> </i>
		</a>
		<a href="https://twitter.com/share?url=<%= currentUrl %>" target="_blank" title="Share on Twitter">
			<i class="icon-twitter"> </i>
		</a>
		<a href="https://plus.google.com/share?url=<%= currentUrl %>" target="_blank" title="Share on Google Plus">
			<i class="icon-google-plus"> </i>
		</a>
	</div>
</c:if>
