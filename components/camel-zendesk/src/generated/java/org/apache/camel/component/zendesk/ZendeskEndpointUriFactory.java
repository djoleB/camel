/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.zendesk;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ZendeskEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":methodName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(144);
        set.add("methodName");
        set.add("inBody");
        set.add("serverUrl");
        set.add("bridgeErrorHandler");
        set.add("sendEmptyMessageWhenIdle");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        set.add("oauthToken");
        set.add("password");
        set.add("token");
        set.add("username");
        set.add("article");
        set.add("articleAttachments");
        set.add("articleId");
        set.add("articleId0");
        set.add("attachment");
        set.add("attachments");
        set.add("audit");
        set.add("auditId");
        set.add("automation");
        set.add("automationId");
        set.add("automationId0");
        set.add("category");
        set.add("categoryId");
        set.add("category_id");
        set.add("comment");
        set.add("commentId");
        set.add("content");
        set.add("contentType");
        set.add("email");
        set.add("endTime");
        set.add("externalId");
        set.add("field");
        set.add("file");
        set.add("fileName");
        set.add("forum");
        set.add("forum_id");
        set.add("group");
        set.add("groupMembership");
        set.add("group_id");
        set.add("group_membership_id");
        set.add("id");
        set.add("idArticle");
        set.add("identity");
        set.add("identityId");
        set.add("ids");
        set.add("includeArchived");
        set.add("inline");
        set.add("installationId");
        set.add("item");
        set.add("itemId");
        set.add("json");
        set.add("labels");
        set.add("locale");
        set.add("macro");
        set.add("macroId");
        set.add("macroId0");
        set.add("monitorId");
        set.add("name");
        set.add("newPassword");
        set.add("notifySubscribers");
        set.add("oldPassword");
        set.add("order");
        set.add("organization");
        set.add("organizationId");
        set.add("organizationList");
        set.add("organizationMembership");
        set.add("organizationMembershipList");
        set.add("organizationMemberships");
        set.add("organization_id");
        set.add("organization_membership_id");
        set.add("organizations");
        set.add("page");
        set.add("parameters");
        set.add("params");
        set.add("password");
        set.add("permissionGroup");
        set.add("query");
        set.add("request");
        set.add("requestId");
        set.add("role");
        set.add("roles");
        set.add("satisfactionRating");
        set.add("schedule");
        set.add("scheduleId");
        set.add("searchTerm");
        set.add("section");
        set.add("sectionId");
        set.add("sortBy");
        set.add("sortOrder");
        set.add("startTime");
        set.add("status");
        set.add("statuses");
        set.add("suspendedTicket");
        set.add("tags");
        set.add("target");
        set.add("targetId");
        set.add("ticket");
        set.add("ticketForm");
        set.add("ticketId");
        set.add("ticketId0");
        set.add("ticketImport");
        set.add("ticketList");
        set.add("tickets");
        set.add("token");
        set.add("topic");
        set.add("translation");
        set.add("translationId");
        set.add("trigger");
        set.add("triggerId");
        set.add("triggerId0");
        set.add("tweetId");
        set.add("type");
        set.add("unixEpochTime");
        set.add("upload");
        set.add("user");
        set.add("userId");
        set.add("userId0");
        set.add("userIdThatWillBeMerged");
        set.add("userIdThatWillRemain");
        set.add("userList");
        set.add("userSegment");
        set.add("user_id");
        set.add("users");
        set.add("usersList");
        set.add("variant");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "zendesk".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

