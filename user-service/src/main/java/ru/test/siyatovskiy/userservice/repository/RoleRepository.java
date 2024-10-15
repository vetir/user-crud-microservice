package ru.test.siyatovskiy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.siyatovskiy.userservice.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
