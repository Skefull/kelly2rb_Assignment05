package kelly2rb_Assignment05;

public class Device {
	private String partNumber;
	private String sku;
	private Boolean onOrOff; // True = 'on'
	
	public Device(String partNumber, String sku) {
		setPartNumber(partNumber);
		setSku(sku);
		onOrOff = false; // Default to off
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Boolean getOnOrOff() {
		return onOrOff;
	}

	public void setOnOrOff(Boolean onOrOff) {
		this.onOrOff = onOrOff;
	}
	public String toString() {
		return "Part Number: " + partNumber + "\nSKU: " + sku + "\nOn or Off: " + onOrOff;
	}
}
