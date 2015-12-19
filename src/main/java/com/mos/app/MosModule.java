package com.mos.app;

import com.google.inject.AbstractModule;
import com.mos.messaging.IBrokerServer;
import com.mos.messaging.IBrokerService;
import com.mos.messaging.impl.ActiveMqBrokerServerImpl;
import com.mos.messaging.impl.ActivemqBrokerService;

/**
 * Created by peter on 12/17/2015.
 */
public class MosModule extends AbstractModule {

    @Override
    protected void configure() {
        //TODO, tell the injector hows the dependence for MOS
        bind(IBrokerServer.class).to(ActiveMqBrokerServerImpl.class);
        bind(IBrokerService.class).to(ActivemqBrokerService.class);



    }
}
