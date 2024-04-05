/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_12;
import java.io.Serializable;

/**
 *
 * @author Erm
 */
public class Message implements Serializable{
     
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;
    
    private static final long serialVersionUID = 3380157693869190848L;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", type='" + type + '\'' +
                ", hasAttachments=" + hasAttachments +
                ", timestamp=" + timestamp +
                '}';
        }    
}
