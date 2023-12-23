package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.Custom.CustomerDAO;
import com.example.layeredarchitecture.dao.Custom.Impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO{

    CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public  boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.save(dto);
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }

    @Override
    public String genarateId() throws SQLException, ClassNotFoundException {
        return customerDAO.genarateId();
    }

    @Override
    public CustomerDTO find(String newValue) throws SQLException, ClassNotFoundException {
        return customerDAO.find(newValue);
    }

}
