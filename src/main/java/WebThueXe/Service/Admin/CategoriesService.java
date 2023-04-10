package WebThueXe.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import WebThueXe.Entity.Categories;

@Service
public interface CategoriesService {

		public List<Categories> getlistOfCategories();

		public void addCategories(Categories categories);

		public void updateCategories(Categories categories);

		public void deleteCategories(int id);

		public Categories findCategories(int id);

}
