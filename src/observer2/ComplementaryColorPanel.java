package observer2;

import java.awt.Color;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ComplementaryColorPanel extends ColorPanel implements ChangeListener {

	public ComplementaryColorPanel(Color initialColor) {
		super(initialColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(DisplayColors.hueSlider != null && DisplayColors.saturationSlider != null && DisplayColors.brightnessSlider != null){
		    float newHue = (float)DisplayColors.hueSlider.getValue()/100;
		    float newSaturation = (float)DisplayColors.saturationSlider.getValue()/100;
		    float newBrightness = (float)DisplayColors.brightnessSlider.getValue()/100;
		    float complementaryHue = newHue - (float)0.5;
		    if(complementaryHue < 0){
		    		complementaryHue = complementaryHue + 1;
		    }
		    Color complementaryColor = Color.getHSBColor(complementaryHue, newSaturation, newBrightness);
		    // WHAT GOES HERE?
		    // You need to update the two color panels with the appropriate colors
		    setColor(complementaryColor);
		}
	}
}
