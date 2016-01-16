package isen.uBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import isen.uBook.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Integer> {
}