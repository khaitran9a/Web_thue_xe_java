package WebThueXe.Dao;
import WebThueXe.Entity.MapperCategories;

import java.util.List;

import WebThueXe.Entity.Categories;
public interface CategoriesDao {
	public List<Categories> getListCategories();
	public void addCategories(Categories categories);
	public void updateCategories(Categories categories);
	public void deleteCategories(int id);
	public Categories findCategories(int id);

}
