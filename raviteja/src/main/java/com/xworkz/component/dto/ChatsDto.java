package com.xworkz.component.dto;

import java.time.LocalDateTime;

public class ChatsDto {

		private String shopName;
		private int since;
		private String ownerName;
		private String ownerWifeName;
		private String location;
		private double incomePerDay;
		private LocalDateTime time;
		private String famous;
		private int peice;
		private String costlychat;
		private String lowCostChat;
		
		public ChatsDto(String shopName, int since, String ownerName, String ownerWifeName, String location,
				double incomePerDay, LocalDateTime time, String famous, int peice, String costlychat,
				String lowCostChat) {
			super();
			System.out.println("created ChatsDto.."+getClass().getSimpleName());
			this.shopName = shopName;
			this.since = since;
			this.ownerName = ownerName;
			this.ownerWifeName = ownerWifeName;
			this.location = location;
			this.incomePerDay = incomePerDay;
			this.time = time;
			this.famous = famous;
			this.peice = peice;
			this.costlychat = costlychat;
			this.lowCostChat = lowCostChat;
		}

		@Override
		public String toString() {
			return "ChatsDto [shopName=" + shopName + ", since=" + since + ", ownerName=" + ownerName
					+ ", ownerWifeName=" + ownerWifeName + ", location=" + location + ", incomePerDay=" + incomePerDay
					+ ", time=" + time + ", famous=" + famous + ", peice=" + peice + ", costlychat=" + costlychat
					+ ", lowCostChat=" + lowCostChat + "]";
		}

		public String getShopName() {
			return shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public int getSince() {
			return since;
		}

		public void setSince(int since) {
			this.since = since;
		}

		public String getOwnerName() {
			return ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getOwnerWifeName() {
			return ownerWifeName;
		}

		public void setOwnerWifeName(String ownerWifeName) {
			this.ownerWifeName = ownerWifeName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public double getIncomePerDay() {
			return incomePerDay;
		}

		public void setIncomePerDay(double incomePerDay) {
			this.incomePerDay = incomePerDay;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}

		public String getFamous() {
			return famous;
		}

		public void setFamous(String famous) {
			this.famous = famous;
		}

		public int getPeice() {
			return peice;
		}

		public void setPeice(int peice) {
			this.peice = peice;
		}

		public String getCostlychat() {
			return costlychat;
		}

		public void setCostlychat(String costlychat) {
			this.costlychat = costlychat;
		}

		public String getLowCostChat() {
			return lowCostChat;
		}

		public void setLowCostChat(String lowCostChat) {
			this.lowCostChat = lowCostChat;
		}
		
		
		
		
}
