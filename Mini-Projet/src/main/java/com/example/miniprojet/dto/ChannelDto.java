package com.example.miniprojet.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
@Data
public class ChannelDto {
    private Long id;

    @NotBlank(message = "Channel name is required")
    private String name;

    private String streamUrl;
    private String logo;
    private boolean active;
    private Long categoryId;
}
