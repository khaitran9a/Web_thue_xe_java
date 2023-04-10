package WebThueXe.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebThueXe.Dao.MenusDao;
import WebThueXe.Entity.Menus;

@Service
public class AdminMenuServiceImpl implements IAdminMenuService{

	@Autowired
	MenusDao menusDao = new MenusDao();

	public List<Menus> GetAllMenus() {
		return menusDao.GetDataMenus();
	}



	public int Addmenu(Menus menu) {
		return menusDao.AddMenu(menu);	
	}



	public int DeleteMenu(int id) {
		
		return menusDao.DeleteMenu(id);
	}



	public Menus GetMenuById(int id) {
		return menusDao.GetMenuById(id);
	}



	public int editMenuById(int id, Menus menu) {
		return menusDao.editMenu(id, menu);
	}

}
