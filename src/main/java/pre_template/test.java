package pre_template;

public class test {

	public static void main(String[] args) {
		String cifFieldA;
		// TODO Auto-generated method stub
		LogicId1 logic = new LogicId1();
		logic.setAm00Field1("automate!");
		logic.setAm00Field2("do stuff!");
		logic.doLogic();
		cifFieldA = logic.getCifFieldA();
		System.out.println("output" + cifFieldA);
	}

}
