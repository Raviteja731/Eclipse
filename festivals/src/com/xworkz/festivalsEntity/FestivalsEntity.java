package com.xworkz.festivalsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "festivals")
@NoArgsConstructor
@NamedQuery(name = "findByIdAndName" , query = "select entity.id from FestivalsEntity entity where entity.name=:by")
@NamedQuery(name = "FindByNameAndRegionAndMainGod", query = "select entity.name from FestivalsEntity entity where  entity.region=:rby  and entity.mainGod=:byy ")
@NamedQuery(name = "FindByMainGod", query = "select entity from FestivalsEntity entity where mainGod=:boy")
@NamedQuery(name = "FindTotalDaysByName", query = "select entity.totalDays from FestivalsEntity entity where entity.name=:by")
@NamedQuery(name = "FindRegionAndMainGodByName", query = "select entity.region,entity.mainGod from FestivalsEntity entity where entity.name=:by")
@NamedQuery(name = "FindRegionAndMainGoldById", query = "select entity.mainGod,entity.totalDays from FestivalsEntity entity where entity.id=:by")
@NamedQuery(name = "FindMainGodAndTotaldaysAndByName", query = "select entity.mainGod,entity.totalDays from FestivalsEntity entity where entity.name=:by ")
@NamedQuery(name = "FindTotaldays", query = "select sum(totalDays)from FestivalsEntity entity  ")
@NamedQuery(name = "FindMaxTotaldays", query = "select max(entity.totalDays) from FestivalsEntity entity   ")

public class FestivalsEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "region")
	private String region;
	@Column(name = "totalDays")
	private int totalDays;
	@Column(name = "sweet")
	private String sweet;
	@Column(name = "mainGod")
	private String mainGod;
	
	public FestivalsEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

	@Override
	public String toString() {
		return "FestivalsEntity [id=" + id + ", name=" + name + ", region=" + region + ", totalDays=" + totalDays
				+ ", sweet=" + sweet + ", mainGod=" + mainGod + "]";
	}

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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}
	
	
}
