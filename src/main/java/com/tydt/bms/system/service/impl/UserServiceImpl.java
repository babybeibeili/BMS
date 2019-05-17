package com.tydt.bms.system.service.impl;

import com.tydt.bms.common.service.impl.BaseService;
import com.tydt.bms.system.model.User;
import com.tydt.bms.system.service.UserService;
import org.springframework.stereotype.Repository;

@Repository("userService")
public class UserServiceImpl extends BaseService<User> implements UserService {

}