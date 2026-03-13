package com.bus;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LocationServlet extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

String lat = req.getParameter("lat");
String lon = req.getParameter("lon");

try{

Connection con = DBConnection.getConnection();

PreparedStatement ps = con.prepareStatement(
"update bus set latitude=?, longitude=? where id=1");

ps.setString(1, lat);
ps.setString(2, lon);

ps.executeUpdate();

}catch(Exception e){
e.printStackTrace();
}

}
}