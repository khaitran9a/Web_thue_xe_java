package WebThueXe.Entity;

public class Menus {
	private int MenuId; 
	private String Title; 
	private String Alias; 
	private boolean isActive; 
	private int Position;
	
	public Menus() {
		super();
	}
	
	public int getMenuId() {
		return MenuId;
	}
	public void setMenuId(int menuId) {
		MenuId = menuId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getPosition() {
		return Position;
	}
	public void setPosition(int Position) {
		Position = Position;
	} 
	
	
	
}
