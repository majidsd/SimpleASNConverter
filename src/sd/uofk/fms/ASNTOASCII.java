/**
 * 
 */
package sd.uofk.fms;

/**
 * @author MaJiD
 *
 */
public enum ASNTOASCII {
	
	TYPE1("type_a", "We are type one."),
	TYPE2("type_b", "We are type two."),
	TYPE3("type_c", "We are type three.");
	
	private String key;
	private String value;
	
	private ASNTOASCII(String key, String value) {
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
