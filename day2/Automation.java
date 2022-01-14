package week3.day2;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		Automation at = new Automation();
		at.java();
		at.selenium();
		at.python();
		at.ruby();

	}

	@Override
	public void ruby() {
		System.out.println("from MultipleLangauge unimplemented - ruby()");
		
	}

	public void selenium() {
		System.out.println("from TestTool - Selenium()");
		
	}

	public void java() {
		System.out.println("from Language - java()");
		
	}

}
