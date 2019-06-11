package pre_template;

public class LogicId1 {

		public LogicId1() {
			
		}
		//String mapping = "MOVE AM00-FIELD-1 TO cifFieldA";
		
		String am00Field1;    //template for all elements in spec json, $type$, $name$
		String am00Field2;		// can i pass in array of similar subtemplates?
		String cifFieldA;
		
		
		public void setAm00Field1(String a) {
			am00Field1 = a;						//template for set for all SourceElement array entries
		}
		public void setAm00Field2(String a) {
			am00Field2 = a;
		}
		
		public void doLogic() {					//template every class gets doLogic method
			if (am00Field1 == am00Field2) {     // template for enterIfStatement
				cifFieldA = am00Field1;			// template for enterMoveStatement
			}									// template for exitIFStatement
			else {								// template for enterElseIf
				cifFieldA = am00Field2;			//  template for enterMoveStatement
			}									// template for exitElseIf
		}										// template endDoLogic for every class
		
		public String getCifFieldA() {			// template for get each TargetElement array entries
			return cifFieldA;
		}
		
		
}

