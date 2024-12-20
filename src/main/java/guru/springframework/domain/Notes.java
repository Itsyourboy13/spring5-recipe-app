package guru.springframework.domain;

import lombok.Data;

import jakarta.persistence.*;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
