package ru.test.siyatovskiy.securityservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.test.siyatovskiy.securityservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
