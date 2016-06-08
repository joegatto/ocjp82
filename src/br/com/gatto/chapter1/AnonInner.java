package br.com.gatto.chapter1;

public class AnonInner {
	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int pay() {
		return admission(5, new SaleTodayOnly() {
			public int dollarsOff() {
				return 3;
			}
		});
	}

	public int admission(int basedPrice, SaleTodayOnly sale) {
		return basedPrice - sale.dollarsOff();
	}
}
