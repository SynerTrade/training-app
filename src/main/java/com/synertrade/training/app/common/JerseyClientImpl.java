package com.synertrade.training.app.common;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by tudorg on 10/18/2016.
 */
public class JerseyClientImpl {

    private Client client = ClientBuilder.newClient((new ClientConfig()).register(JacksonJsonProvider.class));

    public JerseyClientImpl() {
    }

    public WebTargetImpl target(String uri) {
        return new WebTargetImpl(uri, this.client);
    }

}
