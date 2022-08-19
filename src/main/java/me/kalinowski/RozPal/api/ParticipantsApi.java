package me.kalinowski.RozPal.api;

import me.kalinowski.RozPal.Participants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/participants")

public class ParticipantsApi {

    private List<Participants> participants;

    public ParticipantsApi(){
        participants = new ArrayList<>();
        participants.add(new Participants( 1, 1001, "PHU Kal-Trans", 101, true, "7122950551", "20-418", "Nowy Świat", "Lublin", true));
        participants.add(new Participants( 2, 1002, "PHU Jerzy Kalinowski", 102, true, "9992950551", "20-554", "Ułanów", "Lublin", false));
    }

    @GetMapping("/all")
    public List<Participants> getAll(){
        return participants;
    }

    @GetMapping
    public Participants getById(@RequestParam int clientId){
        Optional<Participants> first = participants.stream().filter(element -> element.getClientId() == clientId).findFirst();
        return first.get();
    }
}
