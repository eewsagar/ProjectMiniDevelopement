/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.images.process;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.media.jai.PlanarImage;

/**
 *
 */
public class Element {

    private int index;
    private PlanarImage planarImage;
    private Rectangle rectangle;
    private int type;
    private Element parentElement;
    private BufferedImage bufferedImage;
    private String elementName;
    private int pixels[];

    public int[] getPixels() {
        return pixels;
    }

    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Element getParentElement() {
        return parentElement;
    }

    public void setParentElement(Element parentElement) {
        this.parentElement = parentElement;
    }

    public PlanarImage getPlanarImage() {
        return planarImage;
    }

    public void setPlanarImage(PlanarImage planarImage) {
        this.planarImage = planarImage;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return elementName;
    }
    
}
