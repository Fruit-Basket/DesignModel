package fruitbasket.designmodel.proxy;

public class GamePlayer implements IGamePlayer {

	private String name="";

	public GamePlayer(String name){
		this.name=name;
	}
	
	@Override
	public void login(String user, String password) {
		System.out.println("login()");
	}

	@Override
	public void killBoss() {
		System.out.println("killBoss()");
	}

	@Override
	public void upgrade() {
		System.out.println("upgrade()");
	}

}
