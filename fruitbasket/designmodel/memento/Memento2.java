package fruitbasket.designmodel.memento;

import java.util.HashMap;

public class Memento2 {

	private HashMap<String,Object> stateMap;
	
	public Memento2(HashMap<String,Object> map){
		stateMap=map;
	}

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
}
