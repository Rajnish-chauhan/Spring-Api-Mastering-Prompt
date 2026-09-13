package com.rajnishsystems.in.masterprompttamplate;

import com.rajnishsystems.in.masterprompttamplate.service.ChatService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private ChatService chatService;

    @Test
    void testTamplateRenderer(){
        System.out.println("Tamplate running");
        String output = this.chatService.chatTamplate();
        System.out.println(output);
    }
}
