package com.ciaf.springrolejwt.service.impl;

import com.ciaf.springrolejwt.dao.RoleDao;
import com.ciaf.springrolejwt.model.Role;
import com.ciaf.springrolejwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findByName(String name) {
        Role role = roleDao.findRoleByName(name);
        return role;
    }
}
