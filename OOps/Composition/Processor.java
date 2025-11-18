package Composition;

public class Processor {
private String brand;
private String series;
private int generations;
private int cores;
private int threads;
private String Cachememory;
private String Frequency;
private String minfrequency;
private String maxfrequency;

public Processor() {
	this.brand = "Intel";
	this.series = "1100u";
	this.generations =11;
	this.cores = 4;
	this.threads = 4;
	this.Cachememory = "5MB";
	this.Frequency = "2.5GHZ";
	this.minfrequency = "2.4GHZ";
	this.maxfrequency = "3.1GHZ";
}
public Processor(String brand, String series, int generations, int cores, int threads, String cachememory,
		String frequency, String minfrequency, String maxfrequency) {
	this.brand = brand;
	this.series = series;
	this.generations = generations;
	this.cores = cores;
	this.threads = threads;
	this.Cachememory = cachememory;
	this.Frequency = frequency;
	this.minfrequency = minfrequency;
	this.maxfrequency = maxfrequency;
}

public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSeries() {
	return series;
}
public void setSeries(String series) {
	this.series = series;
}
public int getGenerations() {
	return generations;
}
public void setGenerations(int generations) {
	this.generations = generations;
}
public int getCores() {
	return cores;
}
public void setCores(int cores) {
	this.cores = cores;
}
public int getThreads() {
	return threads;
}
public void setThreads(int threads) {
	this.threads = threads;
}
public String getCachememory() {
	return Cachememory;
}
public void setCachememory(String cachememory) {
	Cachememory = cachememory;
}
public String getFrequency() {
	return Frequency;
}
public void setFrequency(String frequency) {
	Frequency = frequency;
}
public String getMinfrequency() {
	return minfrequency;
}
public void setMinfrequency(String minfrequency) {
	this.minfrequency = minfrequency;
}
public String getMaxfrequency() {
	return maxfrequency;
}
public void setMaxfrequency(String maxfrequency) {
	this.maxfrequency = maxfrequency;
}
@Override
public String toString() {
	return "Processor [brand=" + brand + ", series=" + series + ", generations=" + generations + ", cores=" + cores
			+ ", threads=" + threads + ", Cachememory=" + Cachememory + ", Frequency=" + Frequency + ", minfrequency="
			+ minfrequency + ", maxfrequency=" + maxfrequency + "]";
}

}