package com.epam.maventask;

public class Sweets {
int n, ct, wt;
Sweets(int n, int ct, int wt){
	this.n = n;
	this.ct = ct;
	this.wt = wt;
}
public String toString() {
	return "Cost: "+this.ct+"Weight: "+this.wt+"Total Number: "+this.n;
}
}
