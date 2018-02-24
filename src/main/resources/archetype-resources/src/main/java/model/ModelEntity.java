package ${package}.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "model_entity")
public class ModelEntity {

    @Id
    @Column(name = "model_entity_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "model_entiy_name", unique = true, nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}