package br.com.gatto.chapter1;

public class CaseOfThePrivateInterface {
	private interface Secret {
		public void shh();
	}
	
	class DontTell implements Secret {

		public void shh() {
			
		}
		
	}
}
