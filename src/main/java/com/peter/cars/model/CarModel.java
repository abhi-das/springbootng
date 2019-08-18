package com.peter.cars.model;

public class CarModel {
	private String carId;
	private String carName;
	private Number carPrice;
	private Number carSeats;

	/**
	 * @return the carId
	 */
	public String getCarId() {
		return carId;
	}

	/**
	 * @param carId
	 *            the carId to set
	 */
	public void setCarId(String carId) {
		this.carId = carId;
	}

	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * @param carName
	 *            the carName to set
	 */
	public void setCarName(String carName) {
		this.carName = carName;
	}

	/**
	 * @return the carPrice
	 */
	public Number getCarPrice() {
		return carPrice;
	}

	/**
	 * @param carPrice
	 *            the carPrice to set
	 */
	public void setCarPrice(Number carPrice) {
		this.carPrice = carPrice;
	}

	/**
	 * @return the carSeats
	 */
	public Number getCarSeats() {
		return carSeats;
	}

	/**
	 * @param carSeats
	 *            the carSeats to set
	 */
	public void setCarSeats(Number carSeats) {
		this.carSeats = carSeats;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carId == null) ? 0 : carId.hashCode());
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((carPrice == null) ? 0 : carPrice.hashCode());
		result = prime * result + ((carSeats == null) ? 0 : carSeats.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarModel other = (CarModel) obj;
		if (carId == null) {
			if (other.carId != null)
				return false;
		} else if (!carId.equals(other.carId))
			return false;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carPrice == null) {
			if (other.carPrice != null)
				return false;
		} else if (!carPrice.equals(other.carPrice))
			return false;
		if (carSeats == null) {
			if (other.carSeats != null)
				return false;
		} else if (!carSeats.equals(other.carSeats))
			return false;
		return true;
	}
}
