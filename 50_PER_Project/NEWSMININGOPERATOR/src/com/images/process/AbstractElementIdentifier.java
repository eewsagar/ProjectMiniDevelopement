/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.images.process;

import java.util.ArrayList;

/**
 *
 */
public abstract class AbstractElementIdentifier implements IElementIdentifier {

    private ArrayList<Element> elementList = new ArrayList<Element>();

    public int getElementCount() {
        return elementList.size();
    }
    public Element getElement(int index) {
        return elementList.get(index);
    }
    public void addElement(Element element)
    {
        elementList.add(element);
    }
    public void clearList()
    {
        elementList.clear();
    }
}
