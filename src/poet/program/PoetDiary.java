package poet.program;

public class PoetDiary {
	// 필드
	// 캡슐화의 원칙을 적용
	private String poet; // 시인
	private String poemTitle; // 시제목
	private String poem; // 시
	
	// 생성자, getter/setter, toString(), ... 자동완성 기능
	public PoetDiary() {
		super();
	}
	
	public PoetDiary(String poet, String poemTitle, String poem) {
		super();
		this.poet = poet;
		this.poemTitle = poemTitle;
		this.poem = poem;
	}

	public String getPoet() {
		return poet;
	}

	public void setPoet(String poet) {
		this.poet = poet;
	}
	
	public String getPoemTitle() {
		return poemTitle;
	}
	
	public void setPoemTitle(String poemTitle) {
		this.poemTitle = poemTitle;
	}

	public String getPoem() {
		return poem;
	}

	public void setPoem(String poem) {
		this.poem = poem;
	}

	@Override
	public String toString() {
		return "PoetDiary [poet=" + poet + ", poemTitle=" + poemTitle + ", poem=" + poem + "]";
	}
	
}
