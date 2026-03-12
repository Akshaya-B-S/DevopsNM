package com.medai;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/predict")
public class PredictorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        double glucose = Double.parseDouble(request.getParameter("glucose"));
        int age = Integer.parseInt(request.getParameter("age"));

        Predictor predictor = new Predictor();
        String result = predictor.predictDiabetes(glucose, age);

        request.setAttribute("predictionResult", "Risk Level: " + result);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}