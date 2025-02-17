package com.research.assistant;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/research")
@CrossOrigin("*")
@AllArgsConstructor
public class ResearchController {
    private final ResearchService researchService;

    public ResponseEntity<String> processContent(){
        return " ";
    }
}
