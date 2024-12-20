package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
@Data
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    //todo add
    //private UnitOfMeasure unit;
    @ManyToOne
    private Recipe recipe;
}
