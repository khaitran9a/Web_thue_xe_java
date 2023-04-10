package WebThueXe.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WebThueXe.Dao.MenusDao;
import WebThueXe.Entity.Menus;

@Service
public class HomeServiceImpl implements IHomeService{
	
	@Autowired
	private MenusDao menusDao;
	
	public List<Menus> GetDataMenus() {
		
		return menusDao.GetDataMenus();
	}

}
