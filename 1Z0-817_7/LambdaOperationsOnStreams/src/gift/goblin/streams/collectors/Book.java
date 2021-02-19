/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.time.LocalDate;

/**
 *
 * @author andre
 */
public class Book {
    
    private double price;
    private String name;
    private LocalDate publishedAt;

    public Book(String name, LocalDate publishedAt) {
        this.name = name;
        this.publishedAt = publishedAt;
    }

    public Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setReleaseDate(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", publishedAt=" + publishedAt + '}';
    }

}
