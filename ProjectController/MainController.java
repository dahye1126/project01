package ProjectController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.do")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

/*git init
git add -A
git config --global user.email "가입된 이메일"
git config --global user.name "가입된 이메일의 아이디 부분만"
git commit -m "first commit"
git remote add origin [ .. HTTPS 에서 카피한 부분  ]
git push -u origin master
 * 
 * 
 * 
 * git add -A
git commit -m "커밋하는 날짜와 시간"
git push -u origin master
 */
