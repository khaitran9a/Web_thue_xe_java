package WebThueXe.Controller.Admin;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import WebThueXe.Entity.Categories;
import WebThueXe.Service.Admin.CategoriesServiceImpl;

@Controller
public class CategoriesController extends AdminBaseController{
	
	@Autowired
	CategoriesServiceImpl categoriesService = new CategoriesServiceImpl();

	@RequestMapping(value = "/quan-tri/list-categories", method = RequestMethod.GET)
	public ModelAndView listCategories() {
		_mvShare.setViewName("admin/categories/list");
		List<Categories> list = categoriesService.getlistOfCategories();
		_mvShare.addObject("listCategories", list);
		return _mvShare;
	}

	@RequestMapping(value = "/quan-tri/add-categories", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("admin/categories/categories_form");
		Categories cate = new Categories();
		model.addObject("categoriesForm", cate);
		return model;
	}

	@RequestMapping(value = "/quan-tri/update-categories/{id}", method = RequestMethod.GET)
//	public ModelAndView update(@PathVariable("id") int id) {
	 public ModelAndView update(@PathVariable("id") int id){
		  ModelAndView model = new ModelAndView("admin/categories/categories_form");
		  Categories cate = categoriesService.findCategories(id);
		  model.addObject("categoriesForm", cate);		  
		  return model;
		 }

	@RequestMapping(value = "/quan-tri/save-categories", method = RequestMethod.POST)
	public String save(@ModelAttribute("categoriesForm") Categories categories) {
		if (categories != null && categories.getId() == 0) {
			categoriesService.addCategories(categories);
		} else {
			categoriesService.updateCategories(categories);
		}
		return "redirect:/quan-tri/list-categories"; 
	}
//
//	@RequestMapping(value = "/delete/{username}", method = RequestMethod.GET)
//	public ModelAndView delete(@PathVariable("username") String username) {
//		empService.deletecategories(username);
//		return new ModelAndView("redirect:/categoriess/list");
//	}	

}
