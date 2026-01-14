package com.tnsif.intro.Collections.Hashset;

public class InstaId {
    String name;
    int instaid;
    InstaId(String n,int id){
    	name=n;
    	instaid=id;
    }
    @Override
    public boolean equals(Object o) {
    	InstaId other = (InstaId) o;
    	return this.instaid == other.instaid;
    } @Override
    public int hashCode() { 
    	return instaid; 
    	
    }
}

