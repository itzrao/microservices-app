package com.itzrao.auth_service.repository;

import java.util.Optional;

import com.itzrao.auth_service.model.Role;
import com.itzrao.auth_service.model.RoleName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleName roleName);
}
