package kh.com.cld.e02_dependency;

//  ����(Dependency)
//  CharacterŬ������ Fire Ŭ������ ��üȭ �Ͽ� ����ϰ�,
//  Fire Ŭ�������� �޴� �����Ͱ� �����ϹǷ� FireŬ������ ���������̴�.
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
