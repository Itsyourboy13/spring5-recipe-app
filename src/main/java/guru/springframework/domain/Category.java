package guru.springframework.domain;


import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}