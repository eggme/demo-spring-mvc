package me.whiteship.demospringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {

    @Autowired
    EventService eventService;

    //@RequestMapping(value="/events", method = RequestMethod.GET) // 옛날버전..
    @GetMapping("/events") // 요즘은 이렇게 쓴답니다. Spring 4.3부터 지원
    public String events(Model model){
        //model.addAttribute("eventList", );
        model.addAttribute("events", eventService.getEvents());
        System.out.println(eventService.getEvents().size());
        return "events";
    }

}
