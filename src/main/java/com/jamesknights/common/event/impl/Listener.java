/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.event.impl;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
@Component
public class Listener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
        System.out.println("Received Event - " + event.getMessage());
    }
}
