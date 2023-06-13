package com.example.servingwebcontent.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// JpaRepository<EntityClassName, ClassOfId>
// EntityClassName - Place
// ClassOfId -> Integer
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    List<Place> findByCity(String city);

    List<Place> findByCityOrAddress(String city, String address);
}
