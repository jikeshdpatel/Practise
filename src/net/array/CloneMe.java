package net.array;

import java.util.HashMap;
import java.util.Map;

public class CloneMe implements Cloneable{
	public Map<String, Map<String, String>> cloneMeMap = new HashMap<String, Map<String, String>>();
	public Map<String, String> cloneMeMap1 = new HashMap<>();
	@Override
	protected CloneMe clone() {
		try {
			return (CloneMe) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException("It's impossible...");
		}
	}
	@Override
	public String toString() {
		return "CloneMe [cloneMeMap=" + cloneMeMap + ", cloneMeMap1=" + cloneMeMap1 + "]";
	}
	
}
