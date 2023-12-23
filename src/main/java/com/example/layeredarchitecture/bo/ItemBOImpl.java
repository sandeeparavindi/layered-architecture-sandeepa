package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.Custom.Impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.Custom.ItemDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO{

    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public void delete(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    @Override
    public String genarateId() throws SQLException, ClassNotFoundException {
        return itemDAO.genarateId();
    }

    @Override
    public ItemDTO find(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.find(code);
    }

}
