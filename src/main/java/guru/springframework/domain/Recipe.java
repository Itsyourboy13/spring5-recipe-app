package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * Created on 12/20/2024
 */
@Data
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //todo add
    //private Difficulty difficulty
    @Lob
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;


}
