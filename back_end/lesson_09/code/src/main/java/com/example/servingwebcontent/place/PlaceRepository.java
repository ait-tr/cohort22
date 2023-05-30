package com.example.servingwebcontent.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<EntityClassName, ClassOfId>
// EntityClassName - Place
// ClassOfId -> Integer
public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
