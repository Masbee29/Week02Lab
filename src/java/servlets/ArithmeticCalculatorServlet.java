package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author awarsyle
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String number1 = request.getParameter("first");
        String number2 = request.getParameter("second");
        
        try {
            int newNumber1 = Integer.parseInt(number1);
            int newNumber2 = Integer.parseInt(number2);
            int answer;
            
            if (request.getParameter("add") != null)
                answer = newNumber1 + newNumber2;
          
            else if (request.getParameter("sub") != null)
                answer = newNumber1 - newNumber2;
            
            else if (request.getParameter("mul") != null)
                answer = newNumber1 * newNumber2;
    
            else
                answer = newNumber1 % newNumber2;
            
            request.setAttribute("message", "Answer: " + answer);
            request.setAttribute("firstNum", number1);
            request.setAttribute("secondNum", number2);

                
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            
            
        } catch(NumberFormatException e) {
            request.setAttribute("message", "One or more numbers is invalid!");
            request.setAttribute("firstNum", number1);
            request.setAttribute("secondNum", number2);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }
}
