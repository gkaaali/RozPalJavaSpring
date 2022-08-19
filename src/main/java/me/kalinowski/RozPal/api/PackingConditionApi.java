package me.kalinowski.RozPal.api;

import me.kalinowski.RozPal.PackingCondition;
import me.kalinowski.RozPal.Packings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/condition")
public class PackingConditionApi {

    private List<PackingCondition> condition;


    public PackingConditionApi(){
        condition = new ArrayList<>();
        condition.add(new PackingCondition(1, "good"));
        condition.add(new PackingCondition(1, "repair"));
        condition.add(new PackingCondition(1, "broken"));
    }

    @GetMapping("/all")
    public List<PackingCondition> getAll(){
        return condition;
    }

}

