package WebThueXe.Service.User;

import org.springframework.stereotype.Service;

import WebThueXe.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	public Users CheckAccount(Users user);
	public boolean CheckUserName(Users user);
	
}
