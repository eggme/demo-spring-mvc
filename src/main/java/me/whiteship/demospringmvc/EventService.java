package me.whiteship.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents(){
        Event event = Event.builder()
                .name("테스트용")
                .limitOfEnrollment(10)
                .startDateTime(LocalDateTime.of(2020,9,15,16,30))
                .endDateTime(LocalDateTime.of(2020,9,15,16,50))
                .build();

        Event event1 = Event.builder()
                        .name("스프링 웹 MVC 스터디")
                        .limitOfEnrollment(5)
                        .startDateTime(LocalDateTime.of(2019,1,10,10,0))
                        .endDateTime(LocalDateTime.of(2019,1,10,12,0))
                        .build();
        System.out.println(event1.toString());
        Event event2 = Event.builder()
                .name("스프링 웹 MVC 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019,1,10,10,0))
                .endDateTime(LocalDateTime.of(2019,1,10,12,0))
                .build();
        List<Event> list = new ArrayList<>();
        list.add(event);
        list.add(event1);
        list.add(event2);
        return list;
    }
}


