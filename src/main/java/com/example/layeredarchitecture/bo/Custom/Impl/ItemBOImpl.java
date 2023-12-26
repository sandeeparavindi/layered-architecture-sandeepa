package com.example.layeredarchitecture.bo.Custom.Impl;

import com.example.layeredarchitecture.bo.Custom.ItemBO;
import com.example.layeredarchitecture.dao.Custom.ItemDAO;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dto.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO= (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public void deleteItem(String code) throws SQLException, ClassNotFoundException {
        itemDAO.delete(code);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.exist(code);
    }

    @Override
    public String genarateItemId() throws SQLException, ClassNotFoundException {
        return itemDAO.genarateId();
    }

    @Override
    public ItemDTO findItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.find(code);
    }

}
