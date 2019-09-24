package com.spring.baseball.dto;
//Team
public class Team {
	
	private String tname;
	private int thit;
	private int thr;
	private double tavr;
	private double twalk;
	private double tslg;
	private double tops;
	private double twoba;
	private double twrc;
	private double traa_run;
	private double tst_era;
	private double tre_era;
	private double traa_def;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getThit() {
		return thit;
	}
	public void setThit(int thit) {
		this.thit = thit;
	}
	public int getThr() {
		return thr;
	}
	public void setThr(int thr) {
		this.thr = thr;
	}
	public double getTavr() {
		return tavr;
	}
	public void setTavr(double tavr) {
		this.tavr = tavr;
	}
	public double getTwalk() {
		return twalk;
	}
	public void setTwalk(double twalk) {
		this.twalk = twalk;
	}
	public double getTslg() {
		return tslg;
	}
	public void setTslg(double tslg) {
		this.tslg = tslg;
	}
	public double getTops() {
		return tops;
	}
	public void setTops(double tops) {
		this.tops = tops;
	}
	public double getTwoba() {
		return twoba;
	}
	public void setTwoba(double twoba) {
		this.twoba = twoba;
	}
	public double getTwrc() {
		return twrc;
	}
	public void setTwrc(double twrc) {
		this.twrc = twrc;
	}
	public double getTraa_run() {
		return traa_run;
	}
	public void setTraa_run(double traa_run) {
		this.traa_run = traa_run;
	}
	public double getTst_era() {
		return tst_era;
	}
	public void setTst_era(double tst_era) {
		this.tst_era = tst_era;
	}
	public double getTre_era() {
		return tre_era;
	}
	public void setTre_era(double tre_era) {
		this.tre_era = tre_era;
	}
	public double getTraa_def() {
		return traa_def;
	}
	public void setTraa_def(double traa_def) {
		this.traa_def = traa_def;
	}
	@Override
	public String toString() {
		return "Team [tname=" + tname + ", thit=" + thit + ", thr=" + thr + ", tavr=" + tavr + ", twalk=" + twalk
				+ ", tslg=" + tslg + ", tops=" + tops + ", twoba=" + twoba + ", twrc=" + twrc + ", traa_run=" + traa_run
				+ ", tst_era=" + tst_era + ", tre_era=" + tre_era + ", traa_def=" + traa_def + "]";
	}
	
}
