package poet.program;

import java.util.List;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		View view = new View();
		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int index = 0;
		PoetDiary poetDiary = null;
		String poemTitle = "";
		end :
		do {
			choice = view.poetProgramMenu();
			switch(choice) {
			case 1 : // 시 작성하기
				poetDiary = view.inputPoetInfo();
				controller.addAtFirst(poetDiary);
				view.displaySuccess("시 작성하기 성공!");
				break;
			case 2 : // 작성한 시 목록 
				List<PoetDiary> allList = controller.printPoemList();
				view.showAllPoemList(allList);
				view.displaySuccess("작성한 시 목록 조회 성공");
				break;
			case 3 : // 작성한 시 정보수정
				// 수정할 시 제목 입력 받기 
				poemTitle = view.inputPoemTitle("수정");
				// 수정할 제목의 시가 존재하는지 확인
				index = controller.searchByPoemTitle(poemTitle);
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				// 이후에 수정하기
				// 수정할 정보 입력 받기
				poetDiary = view.modifyPoetDiaryInfo();
				// 수정하기
				controller.updatePoetDiary(index, poetDiary);
				break;
			case 4 : // 시인들의 시 읽어보기 
				switch(view.poemToPoetReadMenu()) {
				case 1 : 
					switch(view.seasonMenu()) {
					case 1 : view.spring(); break;
					case 2 : view.summer(); break;
					case 3 : view.fall(); break;
					case 4 : view.winter(); break;
					}break;
				case 2 : 
					switch(view.weatherMenu()) {
					case 1 : view.sunny(); break;
					case 2 : view.rain(); break;
					case 3 : view.cloud(); break;
					case 4 : view.snow(); break;
					}break;
				case 3 : 
					switch(view.emotionMenu()) {
					case 1 : view.happiness(); break;
					case 2 : view.sad(); break;
					case 3 : view.flutter(); break;
					case 4 : view.angry(); break;
					}break;
				case 4 : view.printMessage("프로그램을 종료합니다."); break end; 
				}
				break;
			case 5 : 
				view.printMessage("프로그램을 종료합니다.");
				break end;
			default :
				view.printMessage("잘못 입력하셨습니다.");
				break;
			}
		}while(choice != 0);
	}
}
