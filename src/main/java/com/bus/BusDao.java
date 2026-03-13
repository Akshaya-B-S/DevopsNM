package com.bus;

import java.sql.*;
import java.util.*;

public class BusDAO {

    public static List<String[]> getBuses() {

        List<String[]> list = new ArrayList<>();

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from bus");

            while (rs.next()) {

                String[] bus = new String[4];

                bus[0] = rs.getString("bus_number");
                bus[1] = rs.getString("route");
                bus[2] = rs.getString("passengers");
                bus[3] = rs.getString("capacity");

                list.add(bus);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}