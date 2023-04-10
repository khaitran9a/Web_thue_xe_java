package WebThueXe.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import WebThueXe.Entity.Menus;

@Service
public interface IAdminMenuService {
	public List<Menus> GetAllMenus();
	public int Addmenu(Menus menu);
	public int DeleteMenu(int id);
	
	public Menus GetMenuById(int id);
	public int editMenuById(int id, Menus menu);
	
	
}
