package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {

    ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;

    boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException;

    void delete(String code) throws SQLException, ClassNotFoundException;

    boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;

    boolean exist (String code) throws SQLException, ClassNotFoundException;

    String genarateId() throws SQLException, ClassNotFoundException;

    ItemDTO find(String code) throws SQLException, ClassNotFoundException;
}
