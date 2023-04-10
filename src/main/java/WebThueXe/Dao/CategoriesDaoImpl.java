package WebThueXe.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebThueXe.Entity.Categories;
import WebThueXe.Entity.MapperCategories;

@Repository
public class CategoriesDaoImpl extends BaseDao{
	
	public List<Categories> getListCategories() {
//		System.out.println("Get Employee List Called");
		List<Categories> list = new ArrayList<Categories>();
		String sql = "SELECT * FROM tblcarcategories";
		list = _jdbcTemplate.query(sql, new MapperCategories());
		return list;
	}

	public void addCategories(Categories categories) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO ");
		sql.append(" tblcarcategories ");
		sql.append("( ");
		sql.append("     name , ");
		sql.append("     description , ");
		sql.append("     isActive ) ");
		sql.append("    VALUES ");
		sql.append("    ( '"+categories.getName()+"' ");
		sql.append("      ,'"+categories.getDescription()+"' ");
		sql.append("     , "+categories.getIsActive()+" ");
		sql.append(" ");
		sql.append("    )");
		 _jdbcTemplate.update(sql.toString());
	}

	public void updateCategories(Categories categories) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append(" tblcarcategories ");
		sql.append("SET ");
		sql.append(" name = '"+categories.getName()+"' , ");
		sql.append(" description = '"+categories.getDescription()+"', ");
		sql.append(" isActive = "+categories.getIsActive()+" ");
		sql.append(" WHERE id = " + categories.getId());
		 _jdbcTemplate.update(sql.toString());
		
	}

	public void deleteCategories(int id) {
		// TODO Auto-generated method stub
		
	}

	public Categories findCategories(int id) {
		String query = "SELECT * FROM tblcarcategories WHERE id = " + id;
		return (Categories)_jdbcTemplate.queryForObject(query, new MapperCategories());
	}

}
