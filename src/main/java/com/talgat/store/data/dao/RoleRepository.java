package com.talgat.store.data.dao;

import com.talgat.store.data.model.Role;
import com.talgat.store.data.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
