package com.ciaf.springrolejwt.service;

import com.ciaf.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
