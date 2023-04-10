package WebThueXe.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	
	@RequestMapping(value = {"/", "/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
//		mv.setViewName("user/index");
		
		mv.addObject("menu", _homeService.GetDataMenus());
		return mv;
	}
}
