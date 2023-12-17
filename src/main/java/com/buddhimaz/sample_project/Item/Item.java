package com.buddhimaz.sample_project.Item;

public class Item {
    private Long id;
    private String name;
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(Long id, String name, String description) {
        this(name, description);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
