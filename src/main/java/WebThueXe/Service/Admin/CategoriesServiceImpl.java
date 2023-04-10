package WebThueXe.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebThueXe.Dao.CategoriesDaoImpl;
import WebThueXe.Dao.MenusDao;
import WebThueXe.Entity.Categories;

@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	CategoriesDaoImpl categoriesDao = new CategoriesDaoImpl();

	public List<Categories> getlistOfCategories() {
		// TODO Auto-generated method stub
		return categoriesDao.getListCategories();
	}

	public void addCategories(Categories categories) {
		categoriesDao.addCategories(categories);
		
	}

	public void updateCategories(Categories categories) {
		 categoriesDao.updateCategories(categories);
		
	}

	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		
	}

	public Categories findCategories(int id) {
		return categoriesDao.findCategories(id);
	}

}
