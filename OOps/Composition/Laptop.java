package Composition;
import Composition.GraphicCard;
import Composition.Processor;

public class Laptop {
private float screen;
private Processor processor;
private String ram;
private String hardDrive;
private GraphicCard graphiccard;
private String OpticaltDrive;
private String Keyboard;

public Laptop() {
	this.screen = 15.6f;
	this.processor = new Processor();
	this.ram = "16GB";
	this.hardDrive = "2TB";
	this.graphiccard =new GraphicCard();
	this.OpticaltDrive = "Multilayer";
	this.Keyboard = "Backlit";
}
public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphiccard,
		String opticaltDrive, String keyboard) {
	this.screen = screen;
	this.processor = processor;
	this.ram = ram;
	this.hardDrive = hardDrive;
	this.graphiccard = graphiccard;
	this.OpticaltDrive = opticaltDrive;
	this.Keyboard = keyboard;
}

public float getScreen() {
	return screen;
}
public void setScreen(float screen) {
	this.screen = screen;
}
public Processor getProcessor() {
	return processor;
}
public void setProcessor(Processor processor) {
	this.processor = processor;
}
public String getRam() {
	return ram;
}
public void setRam(String ram) {
	this.ram = ram;
}
public String getHardDrive() {
	return hardDrive;
}
public void setHardDrive(String hardDrive) {
	this.hardDrive = hardDrive;
}
public GraphicCard getGraphiccard() {
	return graphiccard;
}
public void setGraphiccard(GraphicCard graphiccard) {
	this.graphiccard = graphiccard;
}
public String getOpticaltDrive() {
	return OpticaltDrive;
}
public void setOpticaltDrive(String opticaltDrive) {
	OpticaltDrive = opticaltDrive;
}
public String getKeyboard() {
	return Keyboard;
}
public void setKeyboard(String keyboard) {
	Keyboard = keyboard;
}
@Override
public String toString() {
	return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
			+ ", graphiccard=" + graphiccard + ", OpticaltDrive=" + OpticaltDrive + ", Keyboard=" + Keyboard + "]";
}
}