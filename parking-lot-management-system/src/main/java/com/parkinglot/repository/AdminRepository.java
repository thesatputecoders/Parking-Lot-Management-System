package com.parkinglot.repository;

import com.parkinglot.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Additional query methods can be defined here if needed
}