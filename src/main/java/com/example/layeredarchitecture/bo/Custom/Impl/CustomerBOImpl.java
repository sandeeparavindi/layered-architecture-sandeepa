package com.example.layeredarchitecture.bo.Custom.Impl;

import com.example.layeredarchitecture.bo.Custom.CustomerBO;
import com.example.layeredarchitecture.dao.Custom.CustomerDAO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public  boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.save(dto);
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    @Override
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }

    @Override
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.exist(id);
    }

    @Override
    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
    }

    @Override
    public String genarateCustomerId() throws SQLException, ClassNotFoundException {
        return customerDAO.genarateId();
    }

    @Override
    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException {
        return customerDAO.find(newValue);
    }

}
