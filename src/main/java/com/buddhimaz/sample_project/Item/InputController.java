package com.buddhimaz.sample_project.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InputController {

    @GetMapping("/item")
    public List<Item> get() {
        return List.of(
                new Item(0L, "Item 01", "Desc 01"),
                new Item(1L, "Item 02", "Desc 02")
        );
    }
}
