package com.bus;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class BusServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        List<String[]> buses = BusDAO.getBuses();

        req.setAttribute("busList", buses);

        RequestDispatcher rd = req.getRequestDispatcher("dashboard.jsp");
        rd.forward(req, res);
    }
}