
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
static final long serialVersionUID = 3302099280405236531L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int m11 = Integer.parseInt(req.getParameter("m11"));
	int m12 = Integer.parseInt(req.getParameter("m12"));
	int m13 = Integer.parseInt(req.getParameter("m13"));
	int m14 = Integer.parseInt(req.getParameter("m14"));
	
	int m21 = Integer.parseInt(req.getParameter("m21"));
	int m22 = Integer.parseInt(req.getParameter("m22"));
	int m23 = Integer.parseInt(req.getParameter("m23"));
	int m24 = Integer.parseInt(req.getParameter("m24"));
	
	
	PrintWriter out = res.getWriter();
 
    int row=2, col=2, sum = 0, i, j, k;
  
    int mat1[][] = new int[][]{{m11,m12},{m13,m14}};
	int mat2[][] = new int[][]{{m21,m22},{m23,m24}};
	int result[][] = new int[row][col];
    
 
    for ( i = 0 ; i < row ; i++ ){
        for (  j= 0 ; j < col; j++ ){   
            for ( k = 0 ; k < row ; k++ ){
                sum = sum + mat1[i][k]*mat2[k][j];
            }
			result[i][j] = sum;
            sum = 0;
        }
    }
	
			out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Matrix</title>");            
            out.println("</head>");
            out.println("<body>");
			out.println("<h1>Matrix1</h1><br>");
			
			out.println("<pre>");
			for ( i = 0 ; i < row ; i++ ){
				for ( j = 0 ; j < col ; j++ )
					out.print(mat1[i][j]+"    ");
				out.print("<br>");
			}
			out.println("</pre>");
			out.print("<br>");
			out.print("<br>");
			
			out.println("<h1>Matrix2</h1><br>");
			
			out.println("<pre>");
			for ( i = 0 ; i < row ; i++ ){
				for ( j = 0 ; j < col ; j++ )
					out.print(mat2[i][j]+"    ");
				out.print("<br>");
			}
			out.println("</pre>");
			
			out.print("<br>");
			out.print("<br>");
			
			out.println("<h1>Result</h1><br>");
			
			out.println("<pre>");
			for ( i = 0 ; i < row ; i++ ){
				for ( j = 0 ; j < col ; j++ )
					out.print(result[i][j]+"    ");
				out.print("<br>");
			}
			out.println("</pre>");
            out.println("</body>");
            out.println("</html>");

	out.close();
	}

}
