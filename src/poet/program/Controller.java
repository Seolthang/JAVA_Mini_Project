package poet.program;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	List<PoetDiary> pList;
	
	public Controller() {
		pList = new ArrayList<PoetDiary>();
	}

	public void addAtFirst(PoetDiary poetDiary) {
		// TODO Auto-generated method stub
		pList.add(poetDiary);
	}

	public List<PoetDiary> printPoemList() {
		// TODO Auto-generated method stub
		return pList;
	}

	public int searchByPoemTitle(String poemTitle) {
		for(int i = 0; i < pList.size(); i++) {
			PoetDiary poetDiary = pList.get(i);
			if(poetDiary.getPoemTitle().equals(poemTitle)) {
				return i;
			}
		}
		return -1;
	}

	public void updatePoetDiary(int index, PoetDiary poetDiary) {
		pList.set(index, poetDiary);
	}
}
