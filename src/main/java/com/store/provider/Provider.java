package com.store.provider;

import com.store.product.Product;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Provider() {
    }

    public Provider(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'';
    }
}
