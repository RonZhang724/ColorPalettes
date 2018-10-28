package observer2;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OriginalColorPanel extends ColorPanel implements ChangeListener {

	public OriginalColorPanel(Color initialColor) {
		super(initialColor);
	}
	
    public void stateChanged(ChangeEvent e){
		if(DisplayColors.hueSlider != null && DisplayColors.saturationSlider != null && DisplayColors.brightnessSlider != null){
		    float newHue = (float)DisplayColors.hueSlider.getValue()/100;
		    float newSaturation = (float)DisplayColors.saturationSlider.getValue()/100;
		    float newBrightness = (float)DisplayColors.brightnessSlider.getValue()/100;
		    Color newColor = Color.getHSBColor(newHue, newSaturation, newBrightness);
		    // WHAT GOES HERE?
		    // You need to update the two color panels with the appropriate colors
		    setColor(newColor);
		}
    }

}
