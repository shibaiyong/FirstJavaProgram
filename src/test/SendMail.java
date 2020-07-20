package test;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class SendMail {

    private String to = "13716430630@163.com";
    private String from = "web@gmail.com";
    private String host = "localhost";

    public void send(){
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        Session session = Session.getDefaultInstance(properties);
    }

}
