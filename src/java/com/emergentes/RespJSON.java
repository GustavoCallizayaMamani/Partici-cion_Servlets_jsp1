/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GUSTAVO CALLIZAYA
 */
@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.json");
        PrintWriter out = response.getWriter();
        try{
            out.println("{'empleado':[");
            out.println("{'nombre':'Bruno','apellidos':'Diaz'},");
            out.println("{'nombre':'Juan Jose','apellidos':'Paredez'},");            
            out.println("{'nombre':'Dolores','apellidos':'Fuentes'},");
        }finally{
            out.close();
        }
    }
}
