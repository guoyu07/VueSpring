/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xprotocol.web.exceptions;

/**
 *
 * @author zhao0677
 */
public class UserAlreadyExistsException extends Exception {

    /**
     *
     * @param message
     */
    public UserAlreadyExistsException(String message){
        super(message);
    }
}