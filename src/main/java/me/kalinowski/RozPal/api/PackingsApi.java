package me.kalinowski.RozPal.api;

import me.kalinowski.RozPal.Packings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/packings")
public class PackingsApi {

    private List<Packings> packings;


    public PackingsApi(){
        packings = new ArrayList<>();
        packings.add(new Packings(1,"paletaEUR/EPAL", 120, 80, 15, 10));
        packings.add(new Packings(2,"kosz paczkowy", 120, 80, 200, 50));
    }

    @GetMapping("/all")
    public List<Packings> getAll(){
        return packings;
    }

    @GetMapping
    public Packings getById(@RequestParam int id){
        Optional<Packings> first = packings.stream().filter(element -> element.getId() == id).findFirst();
        return first.get();
    }
}
