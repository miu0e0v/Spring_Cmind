package jp.co.sss.sys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.sys.entity.Employee;
import jp.co.sss.sys.form.LoginForm;
import jp.co.sss.sys.repository.EmployeeRepository;

/**
 * コントローラークラス
 * @author Inoue Nami
 *
 */
@Controller
public class IndexController {

	@Autowired
	EmployeeRepository empRepository;
	
	@ModelAttribute
    LoginForm setUpForm() {
        return new LoginForm();
    }

	/**
	 * ログイン画面を表示する
	 * @param loginForm
	 * @return login.html
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(LoginForm loginForm) {
		loginForm.setEmpId("empId");
		loginForm.setPassword("password");
		return "login";
	}

	/**
	 * 入力された値を元にログイン認証し、トップ画面に遷移する
	 * @param loginForn
	 * @param req
	 * @param res
	 * @return top.html
	 */
	@RequestMapping(path = "/top", method = RequestMethod.POST)
	public String login(LoginForm loginForn, HttpServletRequest req, HttpServletResponse res) {
		
		//社員番号
	    String empId = loginForn.getEmpId();
	    //パスワード
	    String password = loginForn.getPassword();

	    
	    //ログインユーザー取得
	    List<Employee> employee = empRepository.findByIdAndPass(empId, password);

	    //ログインチェック
	    if(employee == null) {
	      //存在しない場合
	      return "login";

	    }else {
	      //存在した場合
	      req.setAttribute("loginUser", loginForn);
	      
		  return "top";
	    }
    }
}
