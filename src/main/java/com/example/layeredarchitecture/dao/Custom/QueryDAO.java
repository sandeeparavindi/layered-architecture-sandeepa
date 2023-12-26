package com.example.layeredarchitecture.dao.Custom;

import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.dto.CustomerDTO;

public interface QueryDAO extends SuperDAO {

    void CustomerOrderDetail(CustomerDTO customerDTO);
}
