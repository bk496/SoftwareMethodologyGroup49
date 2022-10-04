package gymdatabase;
/*
 *  @author Bradley Kolczynkski
 */



public enum Location {
	
	BRIDGEWATER ("08807", "SOMERSET"), EDISON ("08837", "MIDDLESEX"), FRANKLIN ("08873", "SOMERSET"), PISCATAWAY ("08854", "MIDDLESEX"), SOMERVILLE ("08876", "SOMERSET");

	private final String zip;
	private final String county;
	
	Location(String zip, String county){
		this.zip = zip;
		this.county = county;
	}
	
	public String getCity() {
		return county;
	}
	
	public String getZip() {
		return zip;
	}
	
	@Override
	public String toString() {
		return "Location: " + this.name() + ", " + this.zip + ", " + this.county;
	}
	
	
}