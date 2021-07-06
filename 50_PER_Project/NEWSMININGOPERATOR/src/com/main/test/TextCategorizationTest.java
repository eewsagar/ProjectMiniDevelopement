/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main.test;

import org.apache.commons.codec.binary.Base64;

public class TextCategorizationTest {

    public static void main(String[] args) throws Exception {
        byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));

        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        System.out.println("decodedBytes " + new String(Base64.decodeBase64(encodedBytes)));
    }
}
