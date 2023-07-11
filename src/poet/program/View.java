package poet.program;

import java.util.List;
import java.util.Scanner;

public class View {

	public int poetProgramMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println(" === === === 시인이 되어보자! === === ===");
		System.out.println("");
		System.out.println("");
		System.out.println("1. 시 작성하기");
		System.out.println("2. 작성한 시 목록");
		System.out.println("3. 작성한 시 정보수정");
		System.out.println("4. 시인들의 시 읽어보기");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	public PoetDiary inputPoetInfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("시인 : ");
		String poet = sc.nextLine();
		System.out.print("시 제목 : ");
		String poemTitle = sc.nextLine();
		System.out.print("시 : ");
		String poem = sc.nextLine();
		PoetDiary poetDiary = new PoetDiary(poet, poemTitle, poem);
		return poetDiary;
	}

	public void printMessage(String message) { // 프로그램 종료 메시지
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	public void showAllPoemList(List<PoetDiary> allList) {
		// TODO Auto-generated method stub
		System.out.println(" ====== 작성한 시 목록 출력 ====== ");
		int count = 1;
		for (PoetDiary poetDiary : allList) {
			System.out.printf("%d번째 시\n 시 제목 : %s\n 시인 : %s\n 시 : %s\n", count++, poetDiary.getPoemTitle(),
					poetDiary.getPoet(), poetDiary.getPoem());
		}
	}

	public void displaySuccess(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public void displayError(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public String inputPoemTitle(String category) {
		// void 대신에 선언한 값 왼쪽에 반환형을 입력해주고 return값을 준다.
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 시 제목 입력 : ");
		String poemTitle = sc.nextLine();
		return poemTitle;
	}

	public PoetDiary modifyPoetDiaryInfo() { // 변경할 시
		Scanner sc = new Scanner(System.in);
		System.out.print("시 제목 : ");
		String poemTitle = sc.nextLine();
		System.out.print("시인 : ");
		String poet = sc.nextLine();
		System.out.print("시 : ");
		String poem = sc.nextLine();
		PoetDiary poetDiary = new PoetDiary(poemTitle, poet, poem);
		return poetDiary;
	}

	public int poemToPoetReadMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("=== === 시인들의 시를 읽어보자~ === ===");
		System.out.println("");
		System.out.println("");
		System.out.println("1. 계절에 따른 추천 시");
		System.out.println("2. 날씨에 따른 추천 시");
		System.out.println("3. 감정에 따른 추천 시");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	// 1. 계절에 따른 추천시
	public int seasonMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계절에 따른 추천시를 선택하셨습니다.");
		System.out.println("사계절중 마음에 드는 계절을 골라주세요.");
		System.out.println("1. 봄");
		System.out.println("2. 여름");
		System.out.println("3. 가을");
		System.out.println("4. 겨울");
		System.out.print("메뉴선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	// 1-1. 봄
	public void spring() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 봄 ====== ");
		System.out.println("");
		System.out.println("나무에 새싹이 돋는 것을");
		System.out.println("어떻게 알고");
		System.out.println("새들은 먼 하늘에서 날아올까");
		System.out.println("");
		System.out.println("물에 꽃봉우리 진 것을");
		System.out.println("어떻게 알고");
		System.out.println("나비는 저승에서 펄펄 날아올까");
		System.out.println("");
		System.out.println("아가씨 창인 줄은");
		System.out.println("또 어떻게 알고");
		System.out.println("고양이는 울타리에서 저렇게 올까");
		System.out.println("");
		System.out.println("                            - 김광섭");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 1-2. 여름
	public void summer() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 여름비 ====== ");
		System.out.println("");
		System.out.println("하늘도 지쳤네");
		System.out.println("잔뜩 찌푸린 인상");
		System.out.println("후끈한 입김");
		System.out.println("");
		System.out.println("툭툭 털어내던");
		System.out.println("땀방울을");
		System.out.println("줄줄 흘리고 있네");
		System.out.println("");
		System.out.println("덕분에");
		System.out.println("대지를 식혀");
		System.out.println("체온을 떨어뜨리네");
		System.out.println("");
		System.out.println("                            - 공석진");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 1-3. 가을
	public void fall() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 너의 가을 ====== ");
		System.out.println("");
		System.out.println("단풍잎처럼 곱게 물들었구나");
		System.out.println("연두빛 새잎보다");
		System.out.println("진한 초록잎보다");
		System.out.println("더욱 보기 좋아");
		System.out.println("잠시 찬바람도 곁에 머물게 해주렴");
		System.out.println("");
		System.out.println("                            - 서윤덕");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 1-4. 겨울
	public void winter() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 겨울 사랑 ====== ");
		System.out.println("");
		System.out.println("눈송이처럼 너에게 가고 싶다");
		System.out.println("머뭇거리지 말고");
		System.out.println("서성대지 말고");
		System.out.println("숨기지 말고");
		System.out.println("그냥 네 하얀 생애 속에 뛰어들어");
		System.out.println("따스한 겨울이 되고 싶다");
		System.out.println("천년 백설이 되고 싶다");
		System.out.println("");
		System.out.println("                            - 문정희");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 2. 날씨에 따른 시 추천
	public int weatherMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("날씨에 따른 시 추천을 선택하셨습니다.");
		System.out.println("날씨중 마음에 드는것을 골라주세요.");
		System.out.println("1. 맑음");
		System.out.println("2. 비");
		System.out.println("3. 구름");
		System.out.println("4. 눈");
		System.out.print("메뉴선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

// 	2-1. 맑음
	public void sunny() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 햇살에게 ======");
		System.out.println("");
		System.out.println("이른 아침에");
		System.out.println("먼지를 볼 수 있게 해주셔서 감사합니다");
		System.out.println("이제는 내가");
		System.out.println("먼지에 불과하다는 것을 알게 해주셔서 감사합니다");
		System.out.println("그래도 먼지가 된 나를");
		System.out.println("하루종일");
		System.out.println("찬란하게 비춰주셔서 감사합니다");
		System.out.println("");
		System.out.println("                            - 정호승");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 2-2. 비
	public void rain() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 장마 ======");
		System.out.println("");
		System.out.println("비는 하염없이 마당귀에 서서 머뭇거리고");
		System.out.println("툇마루에 앉아 있으니 습습하다");
		System.out.println("목깃 터는 비둘기 울음 습습하다");
		System.out.println("어둑신한 헛간냄새 습습하다");
		System.out.println("");
		System.out.println("거미란 놈이 자꾸 길게 처져 내렷다");
		System.out.println("제 자리로 또 무겁게 기어 올라간다");
		System.out.println("두꺼비 한마리가 느리게 가로질러 가는...");
		System.out.println("어머니 콩 볶으신다");
		System.out.println("비는 하염없이 마당귀에 서서 머뭇거리고");
		System.out.println("");
		System.out.println("                            - 문인수");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 2-3. 구름
	public void cloud() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 구름 ======");
		System.out.println("");
		System.out.println("하늘에 둥둥 떠 있는 구름은");
		System.out.println("지상을 살피러 온 천사님들의");
		System.out.println("휴식처가 아닐까.");
		System.out.println("");
		System.out.println("하느님을 도우시는 천사님들이여");
		System.out.println("즐겁게 쉬어 가시고");
		System.out.println("잘되어 가더라고 말씀하소서.");
		System.out.println("");
		System.out.println("눈에 안 보이기에");
		System.out.println("우리가 함부로 할지 모르니");
		System.out.println("널리 용서하소서.");
		System.out.println("");
		System.out.println("                            - 천상병");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 2-4. 눈
	public void snow() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 첫눈같이 고운 당신 ======");
		System.out.println("");
		System.out.println("첫눈같이");
		System.out.println("고운 당신이 내립니다");
		System.out.println("당신으로");
		System.out.println("세상은 하얗고 아름답습니다");
		System.out.println("");
		System.out.println("참 고운 당신이");
		System.out.println("하얀 눈이 되어");
		System.out.println("나뭇가지에 내리면");
		System.out.println("나는 한 마리 겨울새가 되어 앉습니다");
		System.out.println("");
		System.out.println("유난히도 맑고 고운");
		System.out.println("당신의 미소와 포근한 손길에");
		System.out.println("");
		System.out.println("떠날 때를 알지 못하는 새는");
		System.out.println("당신 가슴에");
		System.out.println("둥지를 틀고 말았습니다");
		System.out.println("");
		System.out.println("당신 품에 잠들어");
		System.out.println("영원히 깨고 싶지 않은");
		System.out.println("하얀 겨울 여행을 떠나고 싶습니다");
		System.out.println("");
		System.out.println("                            - 이채");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 3. 감정에 따른 시 추천
	public int emotionMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("감정에 따른 시 추천을 선택하셨습니다.");
		System.out.println("자신의 현재 감정과 유사한것을 골라주세요.");
		System.out.println("1. 행복");
		System.out.println("2. 슬픔");
		System.out.println("3. 설렘");
		System.out.println("4. 화남");
		System.out.print("메뉴선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	// 3-1. 행복
	public void happiness() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 행복 ======");
		System.out.println("");
		System.out.println("저녁 때");
		System.out.println("돌아갈 집이 있다는 것");
		System.out.println("");
		System.out.println("힘들 때");
		System.out.println("마음속으로 생각할 사람 있다는 것");
		System.out.println("");
		System.out.println("외로울 때");
		System.out.println("혼자서 부를 노래가 있다는 것");
		System.out.println("");
		System.out.println("                            - 나태주");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 3-2. 슬픔
	public void sad() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 봄날은 간다 ======");
		System.out.println("");
		System.out.println("이렇듯 흐린 날에 누가");
		System.out.println("문 앞에 와서");
		System.out.println("내 이름 불러주면 좋겠다");
		System.out.println("");
		System.out.println("보고 싶다고 꽃나무 아래라고");
		System.out.println("술마시다가");
		System.out.println("목소리 보내오면 좋겠다");
		System.out.println("");
		System.out.println("난리난 듯 온 천지가 꽃이라도");
		System.out.println("아직은 네가 더 이쁘다고");
		System.out.println("거짓말도 해주면 좋겠다");
		System.out.println("");
		System.out.println("                            - 구양숙");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 3-3. 설렘
	public void flutter() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 봄이 왔나 봄 ======");
		System.out.println("");
		System.out.println("꽃이 가슴에 날아들어");
		System.out.println("뿌리를 내리고 망울을 터트렸다");
		System.out.println("");
		System.out.println("일초의 망설임 없이");
		System.out.println("꽃밭을 미루도록 가슴, 내주었더니");
		System.out.println("그대는 외로움에 비워졌던");
		System.out.println("나의 봄을 채워주었다");
		System.out.println("");
		System.out.println("                            - 류채상");
		System.out.println("");
		System.out.println("=========================================================");
	}

	// 3-4. 화남
	public void angry() {
		System.out.println("=========================================================");
		System.out.println("");
		System.out.println(" ====== 가슴에 지퍼를 달고 싶다 ====== ");
		System.out.println("");
		System.out.println("지금은");
		System.out.println("말하고 싶지 않다");
		System.out.println("감정은 시도 때도 없이");
		System.out.println("치밀어 오르지만");
		System.out.println("");
		System.out.println("네가");
		System.out.println("알아듣지 못한다면");
		System.out.println("무슨 소용 있으랴");
		System.out.println("");
		System.out.println("차라리");
		System.out.println("가슴에 지퍼를 달고 싶다");
		System.out.println("진실을 보여주기 위해");
		System.out.println("가끔씩 열어 보이고 싶다");
		System.out.println("");
		System.out.println("                            - 신혜림");
		System.out.println("");
		System.out.println("=========================================================");
	}
}
