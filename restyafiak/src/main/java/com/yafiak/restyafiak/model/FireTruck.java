package com.yafiak.restyafiak.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "T_FIRETRUCK_FTR")
public class FireTruck implements Serializable {

	/**
	 * Class FireTruck : represents a fire truck in the database
	 */
	private static final long serialVersionUID = -356829351657437356L;
	
	@Id
	@Column(name="FTR_ID", unique=true, nullable=false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="FTR_NAME", columnDefinition="VARCHAR(30)", nullable=false)
	private String name;
	
	@Column(name="FTR_LAT", columnDefinition="REAL", nullable=false)
	private double latitude;
	
	@Column(name="FTR_LONG", columnDefinition="REAL", nullable=false)
	private double longitude;
	
	@Column(name="FTR_CAPACITY", columnDefinition="REAL", nullable=false)
	private double capacity;
	
	@Column(name="FTR_RATE", columnDefinition="REAL", nullable=false)
	private double waterRate;

	@ManyToOne
    @JoinColumn(name="FTR_FIRESTATION_ID")
    private FireStation fireStation;
	
	@ManyToOne
	@JoinColumn(name="FTR_SENSOR_ID")
	private Sensor sensor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getWaterRate() {
		return waterRate;
	}

	public void setWaterRate(double waterRate) {
		this.waterRate = waterRate;
	}

	public FireStation getFireStation() {
		return fireStation;
	}

	public void setFireStation(FireStation fireStation) {
		this.fireStation = fireStation;
	}

	public Long getId() {
		return id;
	}
	
}
