/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.images.process;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 */
public abstract class IdentifierFactory {

    public final static int TYPE_IMAGE = 1;
    public final static int TYPE_LINE = 2;
    public final static int TYPE_WORD = 3;
    public final static int TYPE_HEADING = 4;
    public final static int TYPE_TOP_MODIFIER = 5;
    public final static int TYPE_BOTTOM_MODIFIER = 6;
    public final static int TYPE_DOT_MODIFIER = 2306;
    public final static int TYPE_DOWN_CONE_MODIFIER = 2367;
    public final static int TYPE_DOWN_CUT_CONE_MODIFIER = 2388;
    public final static int TYPE_SINGLE_LINE_MODIFIER = 2375;
    public final static int TYPE_UP_CONE_MODIFIER = 2373;
    private static HashMap<Integer, IElementIdentifier> identifierList = new HashMap<Integer, IElementIdentifier>();
    private static HashMap<Integer, int[]> parentChildMap = new HashMap<Integer, int[]>();
    private static HashMap<Element, ArrayList<Element>> elementsMap = new HashMap<Element, ArrayList<Element>>();
    private static HashMap<Integer, String> typeNames = new HashMap<Integer, String>();
    

    static {
//        identifierList.put(TYPE_IMAGE, new ImageIdentifier());
//        identifierList.put(TYPE_LINE, new LinesIdentifier());
//        identifierList.put(TYPE_WORD, new WordsIdentifier());

        int imageChilds[] = {TYPE_LINE};
        parentChildMap.put(TYPE_IMAGE, imageChilds);
        int lineChilds[] = {TYPE_WORD};
        parentChildMap.put(TYPE_LINE, lineChilds);
        int wordChilds[] = {TYPE_HEADING, TYPE_TOP_MODIFIER, TYPE_BOTTOM_MODIFIER};
        parentChildMap.put(TYPE_WORD, wordChilds);

        typeNames.put(TYPE_IMAGE, "Image");
        typeNames.put(TYPE_LINE, "Line");
        typeNames.put(TYPE_WORD, "Word");
        typeNames.put(TYPE_HEADING, "Heading");

    }

    public static Element getChild(Element parentElement, int index) {
        ArrayList<Element> childList = elementsMap.get(parentElement);
        if (childList == null) {
            int childTypes[] = parentChildMap.get(parentElement.getType());
            ArrayList<Element> elementList = new ArrayList<Element>();
            for (int childIndex = 0; childIndex < childTypes.length; childIndex++) {
                IElementIdentifier elementIdentifier = identifierList.get(childTypes[childIndex]);
                if (elementIdentifier != null) {
                    elementIdentifier.init(parentElement);
                    int elementCount = elementIdentifier.getElementCount();
                    for (int elementIndex = 0; elementIndex < elementCount; elementIndex++) {
                        Element element = elementIdentifier.getElement(elementIndex);
                        elementList.add(element);
                    }
                }
            }
            elementsMap.put(parentElement, elementList);
            return elementList.get(index);
        } else {

            return childList.get(index);
        }
    }

    public static int getChildCount(Element parentElement) {
        int elementCount = 0;
        ArrayList<Element> childList = elementsMap.get(parentElement);
        if (childList == null) {
            int childTypes[] = parentChildMap.get(parentElement.getType());
            if (childTypes != null) {
                ArrayList<Element> elementList = new ArrayList<Element>();
                for (int index = 0; index < childTypes.length; index++) {
                    IElementIdentifier elementIdentifier = identifierList.get(childTypes[index]);
                    if (elementIdentifier != null) {
                        elementIdentifier.init(parentElement);
                        int childCount = elementIdentifier.getElementCount();
                        for (int childIndex = 0; childIndex < childCount; childIndex++) {
                            elementList.add(elementIdentifier.getElement(childIndex));
                        }
                        elementCount += childCount;
                    }
                }
                elementsMap.put(parentElement, elementList);
            }
        } else {
            elementCount = childList.size();
        }
        return elementCount;
    }

    public static String getTypeName(int type) {
        return typeNames.get(type);
    }
}
