package WebThueXe.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperMenus implements RowMapper<Menus>{

	public Menus mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Menus menus = new Menus();
		menus.setMenuId(rs.getInt("MenuId"));
		menus.setTitle(rs.getString("Title"));
		menus.setAlias(rs.getNString("Alias"));
		menus.setIsActive(rs.getBoolean("isActive"));
		menus.setPosition(rs.getInt("Position"));
		return menus;
	}
	
}
