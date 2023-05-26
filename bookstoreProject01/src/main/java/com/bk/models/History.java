package com.bk.models;

public class History {
	int historyId;
	Orders orders;

	public History(int historyId, Orders orders) {
		super();
		this.historyId = historyId;
		this.orders = orders;
	}

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	

}
