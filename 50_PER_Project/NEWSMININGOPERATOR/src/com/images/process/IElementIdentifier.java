/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.images.process;


/**
 *
 */
public interface IElementIdentifier {

    public final static int TYPE_IMAGE = 1;

    public void init(Element element);

    public int getElementCount();

    public Element getElement(int index);
}
