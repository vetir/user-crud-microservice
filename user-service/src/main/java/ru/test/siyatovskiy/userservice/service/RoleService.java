package ru.test.siyatovskiy.userservice.service;

import ru.test.siyatovskiy.userservice.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getById(long id);
}
