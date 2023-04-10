package WebThueXe.Controller.Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebThueXe.Entity.Menus;
import WebThueXe.Service.Admin.AdminMenuServiceImpl;

@Controller
public class AdminMenuController extends AdminBaseController {

	@Autowired
	private AdminMenuServiceImpl adminMenuService = new AdminMenuServiceImpl();

	@RequestMapping(value = { "/quan-tri/danh-sach-menu" })
	public ModelAndView Index() {

		_mvShare.setViewName("admin/menus/list");
		_mvShare.addObject("menus", adminMenuService.GetAllMenus());
		return _mvShare;
	}
	

	@RequestMapping(value = { "/quan-tri/add-menu" }, method = RequestMethod.GET)
	public ModelAndView AddMenu() {
		_mvShare.addObject("menu", new Menus());
		_mvShare.setViewName("admin/menus/add");
		_mvShare.addObject("menus", adminMenuService.GetAllMenus());
		return _mvShare;
	}
	
	
//	@RequestMapping(value = { "edit-menu/{id}" }, method = RequestMethod.GET)
//	public ModelAndView editMenu(@PathVariable int id) {
//		_mvShare.addObject("menu", new Menus());
//		_mvShare.setViewName("admin/menus/edit");
//		_mvShare.addObject("menus", adminMenuService.GetMenuById(id));
//		return _mvShare;
//	}
	

	@RequestMapping(value = "/update/{username}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		ModelAndView model = new ModelAndView("pages/menus/edit");
		Menus menu = adminMenuService.GetMenuById(id);
		model.addObject("editMneu", menu);
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMenu(@ModelAttribute("menu") Menus menu) {	
			
//			adminMenuService.Addmenu(menu);
//			_mvShare.setViewName("admin/menus/list");
		if (menu != null && menu.getMenuId() == 0) {
			adminMenuService.Addmenu(menu);
		} else {
			adminMenuService.editMenuById(0, menu);
		}
		return "redirect: /WebThueXe/quan-tri/danh-sach-menu"; 
	}
	
	@RequestMapping(value = "DeleteMenu/{id}")
	public String DeleteMenu(HttpServletRequest request , @PathVariable int id) {
		
	 adminMenuService.DeleteMenu(id);

		return "redirect:"+request.getHeader("Referer");
	}
	
}
