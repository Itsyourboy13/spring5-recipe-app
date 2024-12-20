package guru.springframework.domain;

import lombok.Data;
import jakarta.persistence.*;

/**
 * Created on 12/20/2024
 * By AnDrew Card
 */
@Data
@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
