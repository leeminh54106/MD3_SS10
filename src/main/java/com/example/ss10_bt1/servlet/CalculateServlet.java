package com.example.ss10_bt1.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculateServlet", value = "/calculate-servlet")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calculate/calculate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double firstNumber = Double.parseDouble(req.getParameter("firstNumber"));
        Double secondNumber = Double.parseDouble(req.getParameter("secondNumber"));
        String operator = req.getParameter("operator");
        Double result = 0.0;
        switch (operator) {
            case "plus":
                result = secondNumber + firstNumber;
                req.setAttribute("operator", "+");
                break;
            case "minus":
                result = firstNumber - secondNumber;
                req.setAttribute("operator", "-");
                break;
            case "multi":
                result = firstNumber * secondNumber;
                req.setAttribute("operator", "*");
                break;
            case "divide":
                result = firstNumber / secondNumber;
                req.setAttribute("operator", "/");
                break;
        }
        req.setAttribute("firstNumber", firstNumber);
        req.setAttribute("secondNumber", secondNumber);
        req.setAttribute("result", result);
        req.getRequestDispatcher("/calculate/calculateResult.jsp").forward(req, resp);
    }
}
