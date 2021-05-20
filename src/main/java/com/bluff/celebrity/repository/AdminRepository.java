package com.bluff.celebrity.repository;

import com.bluff.celebrity.domain.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
