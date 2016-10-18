package com.synertrade.training.app.common;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by tudorg on 10/18/2016.
 */
public class WebTargetImpl {
    private WebTarget webTarget;

    WebTargetImpl(String uri, Client client) {
        this.webTarget = client.target(uri);
    }

    public WebTargetImpl path(String path) {
        this.webTarget = this.webTarget.path(path);
        return this;
    }

    public WebTargetImpl queryParam(String name, Object... values) {
        this.webTarget = this.webTarget.queryParam(name, values);
        return this;
    }

    public WebTargetImpl encodeQueryParam(String name, Object... values) {
        if(values != null && values.length > 0) {
            Object[] encodedValue = new Object[values.length];

            for(int i = 0; i < values.length; ++i) {
                try {
                    encodedValue[i] = values[i] != null? URLEncoder.encode(values[i].toString(), "UTF-8").replaceAll("\\+", " "):values[i];
                } catch (UnsupportedEncodingException var6) {
                    var6.printStackTrace();
                }
            }

            this.webTarget = this.webTarget.queryParam(name, encodedValue);
        }

        return this;
    }

    public WebTargetImpl queryParamList(String name, Collection<? extends Object> values) {
        Object value;
        if(values != null) {
            for(Iterator var3 = values.iterator(); var3.hasNext(); this.webTarget = this.webTarget.queryParam(name, new Object[]{value})) {
                value = var3.next();
            }
        }

        return this;
    }

    public Invocation.Builder request() {
        Invocation.Builder builder = this.build();
        return builder;
    }

    private Invocation.Builder build() {
        Invocation.Builder builder = this.webTarget.request();
        builder.header("Content-Type", "application/json");
        return builder;
    }}
