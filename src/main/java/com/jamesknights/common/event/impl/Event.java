/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamesknights.common.event.impl;

import com.jamesknights.common.util.JSONTool;
import java.util.HashMap;
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author James Knights <james@i-studio.co.uk>
 */
public class Event extends ApplicationEvent {
    private final String message;
    private final JSONTool jsonTool = new JSONTool();
 
    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }
    
    public Event(Object source, Object data) {
        super(source);
        this.message = jsonTool.parseString((HashMap<String, Object>) data);
    }
    
    public String getMessage() {
        return message;
    }
}
