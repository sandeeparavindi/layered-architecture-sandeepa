package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    boolean saveAllCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    void updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException;

    boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    void deleteCustomer(String id)throws SQLException, ClassNotFoundException;

    String genarateId() throws SQLException, ClassNotFoundException ;

    CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException;


}