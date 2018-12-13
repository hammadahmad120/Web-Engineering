import java.io;
import javax.servlet.*;
import javax.servlet.http.*;
public class helloWorldServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)  // overriding method of parent class
	{
		throws Exception
		{
			PrintWriter out=response.getWriter();
			out.println("Hello World"); // we can also write html in it, to give out to user.
		}
	}	
}