package com.conbakery.bakery.repository;

import com.conbakery.bakery.model.Pastel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastelRepository extends JpaRepository<Pastel,Integer> {


}
