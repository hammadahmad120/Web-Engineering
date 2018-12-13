
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchSubmit extends HttpServlet {
static final long serialVersionUID = 3302099280405236531L;

public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	PrintWriter out = res.getWriter();
	String fname = req.getParameter("fname");
	FileReader fr=new FileReader("C:\\Users\\M. Hammad Shahid\\Desktop\\info.txt");
	BufferedReader br=new BufferedReader(fr);
	String s;
	while((s=br.readLine())!=null){
		String token[]=null;
		token=s.split(":");
		if(token[1].equals(fname);
		{
			String pr=s;
			out.println(pr);
			pr=br.readLine();
			out.println(pr);
			pr=br.readLine();
			out.println(pr);
			pr=br.readLine();
			out.println(pr);
			pr=br.readLine();
			out.println(pr);
			break;
			
		}
		
	}
	

	br.close();
	fr.close();
	out.close();
	
	
 
    
	
			
			
			

}
}