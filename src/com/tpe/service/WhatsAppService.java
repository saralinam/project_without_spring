package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService implements MessageService{
    public void sentMessage(Message message){
        System.out.println("I am WhatsApp Service to sent this message in: " + message.getMessage());
    }



}
