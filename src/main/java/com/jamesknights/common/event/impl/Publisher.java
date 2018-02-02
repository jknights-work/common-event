/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.event.impl;

import com.jamesknights.common.util.JSONTool;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
public class Publisher {
    
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;
    private final JSONTool jsonTool = new JSONTool();
    private static final Logger LOG = Logger.getLogger(Publisher.class);
 
    public void publishEvent(Object source, final String message) {
        LOG.debug("event publishing" + jsonTool.parseString(message));
        Event event = new Event(source, message);
        applicationEventPublisher.publishEvent(event);
    }
    
    public void publishEvent(Object source, final Object data) {
        LOG.debug("event publishing" + jsonTool.parseString(data));
        Event event = new Event(source, data);
        applicationEventPublisher.publishEvent(event);
    }
}
