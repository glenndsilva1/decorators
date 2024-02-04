package nodto;

public class LowerText implements Text {
    private Text text;
	 public LowerText(Text text) {
		 this.text = text;
	 }
	 
	@Override
	public String text() {
		return  text.text().toLowerCase();
	}
}
