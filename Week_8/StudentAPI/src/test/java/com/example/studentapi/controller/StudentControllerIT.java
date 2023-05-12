package com.example.studentapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerIT {
    @Autowired
    private MockMvc mockMvc;

    // Wire mock alapú tesztelés = Egy adott porton fut valami és annak tudunk üzenetet küldeni. Az a port viselkedik úgy, mint az alkalmazás. Valódi http kérések jelennek meg.
    // - -   Wire mock tipikusan = Áthív az A Service egy B Service-be. Adott porton, adott kérésre mi legyen a válasz, ezt lehet megadni ebben az esetben.
    // MockMvc alapú tesztelés = Nincs port, nincs valódi http traffic, maga a test setup úgy kezeli a controller elemeit mint normál metódusokat.
    // - - Teljesen jó a saját endpointjaink tesztelésére.

    // TODO HF: Service összes metódusára Unit Test + IT
    //Összes controlleres metódusra legyen mockmvc teszt
    

    @Test
    public void testStudentCreation() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                        .post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "student": {
                                      "name": "Blabname",
                                      "email": "free@",
                                      "locker": 23  
                                    }
                                }   
                            """)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.student.id").value(1));
    }
}
