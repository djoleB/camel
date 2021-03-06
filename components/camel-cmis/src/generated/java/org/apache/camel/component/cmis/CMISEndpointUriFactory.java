/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cmis;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class CMISEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":cmsUrl";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(16);
        set.add("cmsUrl");
        set.add("pageSize");
        set.add("readContent");
        set.add("readCount");
        set.add("repositoryId");
        set.add("bridgeErrorHandler");
        set.add("query");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("lazyStartProducer");
        set.add("queryMode");
        set.add("basicPropertyBinding");
        set.add("sessionFacadeFactory");
        set.add("synchronous");
        set.add("password");
        set.add("username");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "cmis".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "cmsUrl", null, true, copy);
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

