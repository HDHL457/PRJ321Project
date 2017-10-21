/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author KingDra - Hai Long
 */
public class Bean {
    
    //contain operations on Products table such as: select/ insert/ delete...
    public List<Customer> getClassies() throws Exception {
        List<Customer> r = new ArrayList<>();
        String query = "select top "+num+" * from Class ";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("Name");
            Date startedDate = rs.getDate("StartedDate");
            boolean activated = rs.getInt("Activated") != 0;
            r.add(new Classies(id, name, startedDate, activated));
        }
        rs.close();
        conn.close();
        return r;
    }
}
