package WebThueXe.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import WebThueXe.Entity.MapperMenus;
import WebThueXe.Entity.Menus;

@Repository
public class MenusDao extends BaseDao {
	public List<Menus> GetDataMenus() {
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM tblMenu ORDER BY Position asc";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
	
	public int AddMenu(Menus menu ) {
		
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO tblMenu ");
		sql.append("( ");
		sql.append("    title, ");
		sql.append("    alias, ");
		sql.append("    isActive, ");
		sql.append("    Position ");
		
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+menu.getTitle()+"', ");
		sql.append("    '"+menu.getAlias()+"', ");
		sql.append("    "+menu.getIsActive()+", ");
		sql.append("    "+menu.getPosition()+" ");
		
		sql.append(")");
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int DeleteMenu(int id) {
		
		StringBuffer  sql = new StringBuffer();
		sql.append("EDIT ");
		sql.append("tblMenu ");
		sql.append("`SET` ");
		sql.append("WHERE ");
		sql.append("MenuId = " + id);
		
		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int editMenu(int id, Menus menu) {
		
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE ");
		sql.append("tblmenu ");
		sql.append("SET ");
		sql.append("Title = value-2 , ");
		sql.append("Alias = value-3 , ");
		sql.append("isActive = value-4 , ");
		sql.append("Position = value-5 ");
		sql.append("WHERE ");
		sql.append("MeNuId = " + id);
		
		
		int edit = _jdbcTemplate.update(sql.toString());
		return edit;
	}
	
	public Menus GetMenuById(int id) {
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM tblMenu Where MenuId = " + id;
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list.get(0);
	}
}
