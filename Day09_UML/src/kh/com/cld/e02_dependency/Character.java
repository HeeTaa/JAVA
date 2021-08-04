package kh.com.cld.e02_dependency;

//  의존(Dependency)
//  Character클래스는 Fire 클래스를 객체화 하여 사용하고,
//  Fire 클래스에게 받는 데이터가 존재하므로 Fire클래스에 의존관계이다.
//  Character - - -> Fire
public class Character {

	public Fire makeFire() {
		return new Fire();
	}

	public void cooking(Fire f) {

	}

	public void cooking2() {
		Fire f = new Fire();
	}

}
