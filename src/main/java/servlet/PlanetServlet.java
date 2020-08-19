/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.common.base.CharMatcher;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multiset;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.InputFile;
import model.Planet;

/**
 *
 * @author Codersbay
 */
@WebServlet(name = "PlanetServlet", urlPatterns = {"/PlanetServlet"})
public class PlanetServlet extends HttpServlet {
    
    private final String FILE = "/files/Version2.csv";
    private final List<Planet> planets;
    
    public PlanetServlet() {
        
        InputFile input = new InputFile(FILE);
        planets = input.read();
        
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, Object obj)
	    throws ServletException, IOException {
	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	try ( PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */
	    out.print(new Gson().toJson(obj));
	    out.flush();
	}
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getServletPath().matches("/filter")){
            List<Planet> filteredPlanets=getFilteredPlanets(request.getParameter("property"), request.getParameter("criteria").toLowerCase());
            processRequest(request, response, filteredPlanets);
        } else if(request.getServletPath().equals("/all")){
            processRequest(request, response, planets);
            System.out.println("Test");
        } else {
            try {
                processRequest(request, response, "not found " + request.getServletPath());
            } catch (ServletException | IOException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            }
	}
        
    }
    
    private List<Planet> getFilteredPlanets(String property, String criteria) {

        List<Planet> result = new ArrayList<>();
        
        switch(property){
            case "loc_rowid":
                for (Planet planet : planets) {
                    if (planet.getLoc_rowid() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_hostname":
                for (Planet planet : planets) {
                    if (planet.getPl_hostname().toLowerCase().contains(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_letter":
                for (Planet planet : planets) {
                    if (planet.getPl_letter().toLowerCase().contains(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_name":
                for (Planet planet : planets) {
                    if (planet.getPl_name().toLowerCase().contains(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "gaia_dist":
                for (Planet planet : planets) {
                    if (planet.getGaia_dist() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "st_teff":
                for (Planet planet : planets) {
                    if (planet.getSt_teff() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "st_mass":
                for (Planet planet : planets) {
                    if (planet.getSt_mass() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "st_rad":
                for (Planet planet : planets) {
                    if (planet.getSt_rad() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "rowupdate":
                for (Planet planet : planets) {
                    if (planet.getRowupdate().toLowerCase().contains(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_disc":
                for (Planet planet : planets) {
                    if (planet.getPl_disc().getValue() == (Integer.getInteger(criteria))) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_facility":
                for (Planet planet : planets) {
                    if (planet.getPl_facility().toLowerCase().contains(criteria)) {
                        result.add(planet);
                    }
                }
                break;
            case "pl_status":
                for (Planet planet : planets) {
                    if (planet.getPl_status() == Integer.getInteger(criteria)) {
                        result.add(planet);
                    }
                }
                break;
        }        
        
        return result;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
