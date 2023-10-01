package org.launchcode.codingEvents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
//RequestMapping creates "prefix". Any GetMapping afterwards will be /prefix/getMapping
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();


    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("LaunchCode Meetup", "Join your fellow classmates for a wonderful evening.");
        events.put("Code and Coffee", "Love Caffeine? This is the event for you.");
        events.put("Code till Dawn", "For Night Owls only.");
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    @PostMapping
    public String createEvent(@RequestParam String eventName, String eventDescription) {
        events.put(eventName, eventDescription);
        return "redirect:/events";
    }

}
