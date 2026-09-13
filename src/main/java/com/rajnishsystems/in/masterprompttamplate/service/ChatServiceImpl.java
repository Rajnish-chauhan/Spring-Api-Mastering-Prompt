package com.rajnishsystems.in.masterprompttamplate.service;
//import com.rajnishsystems.in.springaipromptingresponse.entity.Tut;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.google.genai.GoogleGenAiChatOptions;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import javax.xml.transform.Templates;
import java.util.Map;

//import java.lang.reflect.Type;
//import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{

    private ChatClient chatClient;
    public ChatServiceImpl(ChatClient chatClient){
        this.chatClient=chatClient;
    }


    @Override
    public String chat(String query) {
        return query;
    }

    public String chatTamplate(){
        PromptTemplate template=PromptTemplate.builder().template("What is {techName} tell me example of {techExample}?").build();
        String rendered = template.render(Map.of(
                "techName", "Spring",
                "techExample", "spring exception"
        ));
        Prompt prompt=new Prompt(rendered);
        String content=this.chatClient.prompt(prompt).call().content();
        return content;
    }
}
