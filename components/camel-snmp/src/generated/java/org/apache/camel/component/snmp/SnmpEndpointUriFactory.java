/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.snmp;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class SnmpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":host:port";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(40);
        set.add("host");
        set.add("port");
        set.add("oids");
        set.add("protocol");
        set.add("retries");
        set.add("snmpCommunity");
        set.add("snmpContextEngineId");
        set.add("snmpContextName");
        set.add("snmpVersion");
        set.add("timeout");
        set.add("type");
        set.add("bridgeErrorHandler");
        set.add("delay");
        set.add("sendEmptyMessageWhenIdle");
        set.add("treeList");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("lazyStartProducer");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
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
        set.add("authenticationPassphrase");
        set.add("authenticationProtocol");
        set.add("privacyPassphrase");
        set.add("privacyProtocol");
        set.add("securityLevel");
        set.add("securityName");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "snmp".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, true, copy);
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

