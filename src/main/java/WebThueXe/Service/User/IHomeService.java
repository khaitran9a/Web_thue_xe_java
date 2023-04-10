package WebThueXe.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import WebThueXe.Entity.Menus;

@Service
public interface IHomeService {
	public List<Menus> GetDataMenus();

}
