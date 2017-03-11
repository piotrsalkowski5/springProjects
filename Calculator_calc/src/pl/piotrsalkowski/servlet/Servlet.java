package pl.piotrsalkowski.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pl.piotrsalkowski.Operations;

/**
 * Servlet implementation class ButtonListenerServlet
 */
@WebServlet("/Kalkulator")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Operations operations = (Operations)request.getSession().getAttribute("operations");
		
		for(int i=0; i<=9; i++) {
			if(request.getParameter("button"+i) != null) {
				if(operations.getDisplay().equals("0")) {
					operations.setDisplayContent(Integer.toString(i));
				}else {
					operations.appendDisplayContent(Integer.toString(i));
				}
			}
		}
		
		if(request.getParameter("buttonAddition") != null) {
			if(operations.getDisplay().contains("+") || operations.getDisplay().contains("-") || operations.getDisplay().contains("*") || operations.getDisplay().contains("/")) {
			}else {
				
				
				if(operations.getDisplay().equals("0")) {
					operations.setDisplayContent("+");
				}else {
					operations.appendDisplayContent("+");
				}
			}
		}
		if(request.getParameter("buttonSubstraction") != null) {
			if(operations.getDisplay().contains("+") || operations.getDisplay().contains("-") || operations.getDisplay().contains("*") || operations.getDisplay().contains("/")) {
				
			}else {
				if(operations.getDisplay().equals("0")) {
					operations.setDisplayContent("-");
				}else {
					operations.appendDisplayContent("-");
				}
			}
			
		}
		if(request.getParameter("buttonMultiplication") != null) {
			if(operations.getDisplay().contains("+") || operations.getDisplay().contains("-") || operations.getDisplay().contains("*") || operations.getDisplay().contains("/")) {
			
			}else {
				if(operations.getDisplay().equals("0")) {
					operations.setDisplayContent("*");
				}else {
					operations.appendDisplayContent("*");
				}
			}
		}
		if(request.getParameter("buttonDivision") != null) {
			if(operations.getDisplay().contains("+") || operations.getDisplay().contains("-") || operations.getDisplay().contains("*") || operations.getDisplay().contains("/")) {
			}else {
				if(operations.getDisplay().equals("0")) {
					operations.setDisplayContent("/");
				}else {
					operations.appendDisplayContent("/");
				}
			}
		}
		
		
		
		if(request.getParameter("buttonCE") != null) {
			operations.setDisplayContent("0");	
		}
		
		if(request.getParameter("buttonEqual") != null) {
			if(operations.getDisplay().contains("+")) {
				String[] stringValues = splitString(operations.getDisplay(), "\\+");
				if(stringValues != null) operations.doAddition(Double.parseDouble(stringValues[0]), Double.parseDouble(stringValues[1]));
			}else if(operations.getDisplay().contains("-")) {
				String[] stringValues = splitString(operations.getDisplay(), "-");
				if(stringValues != null) operations.doSubstraction(Double.parseDouble(stringValues[0]), Double.parseDouble(stringValues[1]));
			}else if(operations.getDisplay().contains("*")) {
				String[] stringValues = splitString(operations.getDisplay(), "\\*");
				if(stringValues != null) operations.doMultiplication(Double.parseDouble(stringValues[0]), Double.parseDouble(stringValues[1]));
			}else if(operations.getDisplay().contains("/")) {
				String[] stringValues = splitString(operations.getDisplay(), "/");
				if(stringValues != null) operations.doDivision(Double.parseDouble(stringValues[0]), Double.parseDouble(stringValues[1]));
			}
			
		}
		
		request.getRequestDispatcher("View.jsp").forward(request, response);
		
	}
	
	
	private String[] splitString(String display, String delimiter) {	
			return display.split(delimiter);
	
		
	}
	
	
	
	
}
