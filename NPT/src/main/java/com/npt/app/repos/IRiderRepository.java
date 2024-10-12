package com.npt.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npt.app.model.Rider;

@Repository
public interface IRiderRepository extends JpaRepository<Rider, Long>{

}
