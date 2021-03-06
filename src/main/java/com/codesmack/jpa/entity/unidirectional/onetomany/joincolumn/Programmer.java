package com.codesmack.jpa.entity.unidirectional.onetomany.joincolumn;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Programmer_UniDir_Join_Column")
public class Programmer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "biography")
    private String bio;
    @Column(name = "date_Of_Birth")
    private String dob;
    private String language;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private Set<Product> products = new HashSet<Product>();

    public Programmer() {}
    public Programmer(final String name, final String bio, final String dob, final String language) {
        this.name = name;
        this.bio = bio;
        this.dob = dob;
        this.language = language;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
