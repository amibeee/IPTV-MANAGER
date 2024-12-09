package com.example.miniprojet.repository;
import com.example.miniprojet.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {
    List<Channel> findByCategory_Id(Long categoryId);
    List<Channel> findByNameContainingIgnoreCase(String name);
    List<Channel> findByActive(boolean active);
}