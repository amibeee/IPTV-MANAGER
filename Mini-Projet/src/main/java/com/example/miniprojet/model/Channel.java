package com.example.miniprojet.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "channels")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Channel name is required")
    private String name;

    private String streamUrl;
    private String logo;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}