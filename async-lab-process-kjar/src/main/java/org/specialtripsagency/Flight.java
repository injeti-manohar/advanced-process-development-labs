package org.specialtripsagency;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Flight implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Carrier")
	private java.lang.String carrier;
	@org.kie.api.definition.type.Label(value = "Flight Number")
	private java.lang.String flightNr;
	@org.kie.api.definition.type.Label(value = "Price Discount")
	private java.lang.Integer priceDiscount;
	@org.kie.api.definition.type.Label(value = "Rate Per Person")
	private java.lang.Integer ratePerPerson;
	@org.kie.api.definition.type.Label(value = "Return Date")
	private java.lang.String returnDate;
	@org.kie.api.definition.type.Label(value = "Start City")
	private java.lang.String startCity;
	@org.kie.api.definition.type.Label(value = "Target City")
	private java.lang.String targetCity;
	@org.kie.api.definition.type.Label(value = "Travel Date")
	private java.lang.String travelDate;
	@org.kie.api.definition.type.Label(value = "Travel Class")
	private java.lang.String travelClass;
	@org.kie.api.definition.type.Label(value = "Booking Status")
	private java.lang.String bookingStatus;
	@org.kie.api.definition.type.Label(value = "Booking Id")
	private java.lang.String bookingId;

	public Flight() {
	}

	public java.lang.String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(java.lang.String carrier) {
		this.carrier = carrier;
	}

	public java.lang.String getFlightNr() {
		return this.flightNr;
	}

	public void setFlightNr(java.lang.String flightNr) {
		this.flightNr = flightNr;
	}

	public java.lang.Integer getPriceDiscount() {
		return this.priceDiscount;
	}

	public void setPriceDiscount(java.lang.Integer priceDiscount) {
		this.priceDiscount = priceDiscount;
	}

	public java.lang.Integer getRatePerPerson() {
		return this.ratePerPerson;
	}

	public void setRatePerPerson(java.lang.Integer ratePerPerson) {
		this.ratePerPerson = ratePerPerson;
	}

	public java.lang.String getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(java.lang.String returnDate) {
		this.returnDate = returnDate;
	}

	public java.lang.String getStartCity() {
		return this.startCity;
	}

	public void setStartCity(java.lang.String startCity) {
		this.startCity = startCity;
	}

	public java.lang.String getTargetCity() {
		return this.targetCity;
	}

	public void setTargetCity(java.lang.String targetCity) {
		this.targetCity = targetCity;
	}

	public java.lang.String getTravelDate() {
		return this.travelDate;
	}

	public void setTravelDate(java.lang.String travelDate) {
		this.travelDate = travelDate;
	}

	public java.lang.String getTravelClass() {
		return this.travelClass;
	}

	public void setTravelClass(java.lang.String travelClass) {
		this.travelClass = travelClass;
	}

	public java.lang.String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(java.lang.String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public java.lang.String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(java.lang.String bookingId) {
		this.bookingId = bookingId;
	}

	public Flight(java.lang.String carrier, java.lang.String flightNr,
			java.lang.Integer priceDiscount, java.lang.Integer ratePerPerson,
			java.lang.String returnDate, java.lang.String startCity,
			java.lang.String targetCity, java.lang.String travelDate,
			java.lang.String travelClass, java.lang.String bookingStatus,
			java.lang.String bookingId) {
		this.carrier = carrier;
		this.flightNr = flightNr;
		this.priceDiscount = priceDiscount;
		this.ratePerPerson = ratePerPerson;
		this.returnDate = returnDate;
		this.startCity = startCity;
		this.targetCity = targetCity;
		this.travelDate = travelDate;
		this.travelClass = travelClass;
		this.bookingStatus = bookingStatus;
		this.bookingId = bookingId;
	}

}