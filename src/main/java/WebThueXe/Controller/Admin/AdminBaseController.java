package WebThueXe.Controller.Admin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import WebThueXe.Service.Admin.AdminHomeServiceImpl;

@Controller
public class AdminBaseController {
	@Autowired
	AdminHomeServiceImpl _adminHomeService = new AdminHomeServiceImpl();
	public ModelAndView _mvShare = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		
		return _mvShare;
	}
	
	
	
}
