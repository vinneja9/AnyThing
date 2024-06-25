package School.ch2024FirstOTT;

class Animal {
	Cat i;

	void toC(Cat i) {
		this.i = i;
	}

	Cat toC1(Cat i) {
		this.i = i;
		return i;
	}

	void hangul() {
		i.CatName();
		System.out.println("벼닛ㄱ");
	}

	interface Cat {
		void CatName();
	}
}

class Run1 implements Animal.Cat {
	@Override
	public void CatName() {
		System.out.println("qd");
		System.out.println("Cat: 야옹이");
	}
}

class Run2 implements Animal.Cat {
	@Override
	public void CatName() {
		System.out.println("Cat: 냐옹이");
	}
}

class Run3 implements Animal.Cat {
	@Override
	public void CatName() {
		System.out.println("Cat: 옹이");
	}
}

public class InterfaceEx2 {
	public static void main(String[] args) {

		Animal ani = new Animal();
		ani.toC(new Run1());
		ani.hangul();
		ani.toC(new Run2());
		ani.hangul();
		ani.toC(new Run3());
		ani.hangul();

	}
}
