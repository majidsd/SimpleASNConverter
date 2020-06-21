/**
 * 
 */
package sd.uofk.fms;

import java.util.HashMap;

/**
 * @author MaJiD
 *
 */
public class ASNLogic {
	
	private HashMap<String, String> ASN;
	
	public ASNLogic() {
		addTypes();
	}
	
	public String getType(String key) {
		return ASN.get(key);
	}
	
	public void addTypes() {
		ASN = new HashMap<>();
		ASN.put(ASNTOASCII.TYPE1.getKey(), ASNTOASCII.TYPE1.getValue());
		ASN.put(ASNTOASCII.TYPE2.getKey(), ASNTOASCII.TYPE2.getValue());
		ASN.put(ASNTOASCII.TYPE3.getKey(), ASNTOASCII.TYPE3.getValue());
	}

}
