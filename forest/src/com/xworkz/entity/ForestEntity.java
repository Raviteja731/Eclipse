package com.xworkz.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	import lombok.ToString;

	@Entity
	@Table(name = "forest")
	@ToString
	@NoArgsConstructor
	@Getter
	@Setter
	@NamedQuery(name = "findByName", query = "select Entity from ForestEntity for where for.name='Moka'")
	@NamedQuery(name = "FindByState", query = ("select Entity from ForestEntity for where  for.state='Karnataka' "))
	@NamedQuery(name = "FindByNameAndState", query = ("select Entity.area,Entity.state from ForestEntity Entity where name='Banglore'"))
	@NamedQuery(name = "FindAreabyname", query = ("select  Entity.area from ForestEntity Entity where Entity.name='Animals'"))
	@NamedQuery(name = "findidAndname", query = ("select Entity.id from ForestEntity Entity where Entity.name='Sundarbans' and for.state='Karnataka'"))
	@NamedQuery(name = "findNameByID", query = ("select Entity.name from ForestEntity Entity where id=1"))
	@NamedQuery(name = "findCount", query = ("select count(Entity.id) from ForestEntity Entity "))
	@NamedQuery(name = "maxArea", query = ("select Max(Entity.id) from ForestEntity Entity where area='AndraPradesh'"))
	
	public class ForestEntity {
		
		
		public ForestEntity() {
			System.out.println("created ForestEntity..."+getClass().getSimpleName());
		}
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "name")
		private String name;
		@Column(name = "state")
		private String state;
		@Column(name = "area")
		private String area;
		@Column(name = "type")
		private String type;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}

	}
	
