/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jme3.gde.jmeguiforms;

import java.beans.*;

/**
 *
 * @author Glauco
 */
public class WheelPanelBeanFormBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_alpha = 4;
    private static final int PROPERTY_ancestorListeners = 5;
    private static final int PROPERTY_autoscrolls = 6;
    private static final int PROPERTY_axleValue = 7;
    private static final int PROPERTY_background = 8;
    private static final int PROPERTY_backgroundPainter = 9;
    private static final int PROPERTY_backgroundSet = 10;
    private static final int PROPERTY_baselineResizeBehavior = 11;
    private static final int PROPERTY_border = 12;
    private static final int PROPERTY_bounds = 13;
    private static final int PROPERTY_colorModel = 14;
    private static final int PROPERTY_component = 15;
    private static final int PROPERTY_componentCount = 16;
    private static final int PROPERTY_componentListeners = 17;
    private static final int PROPERTY_componentOrientation = 18;
    private static final int PROPERTY_componentPopupMenu = 19;
    private static final int PROPERTY_components = 20;
    private static final int PROPERTY_connectionPointValue = 21;
    private static final int PROPERTY_containerListeners = 22;
    private static final int PROPERTY_contentContainer = 23;
    private static final int PROPERTY_cursor = 24;
    private static final int PROPERTY_cursorSet = 25;
    private static final int PROPERTY_debugGraphicsOptions = 26;
    private static final int PROPERTY_directionValue = 27;
    private static final int PROPERTY_displayable = 28;
    private static final int PROPERTY_doubleBuffered = 29;
    private static final int PROPERTY_dropTarget = 30;
    private static final int PROPERTY_effectiveAlpha = 31;
    private static final int PROPERTY_enabled = 32;
    private static final int PROPERTY_focusable = 33;
    private static final int PROPERTY_focusCycleRoot = 34;
    private static final int PROPERTY_focusCycleRootAncestor = 35;
    private static final int PROPERTY_focusListeners = 36;
    private static final int PROPERTY_focusOwner = 37;
    private static final int PROPERTY_focusTraversable = 38;
    private static final int PROPERTY_focusTraversalKeys = 39;
    private static final int PROPERTY_focusTraversalKeysEnabled = 40;
    private static final int PROPERTY_focusTraversalPolicy = 41;
    private static final int PROPERTY_focusTraversalPolicyProvider = 42;
    private static final int PROPERTY_focusTraversalPolicySet = 43;
    private static final int PROPERTY_font = 44;
    private static final int PROPERTY_fontSet = 45;
    private static final int PROPERTY_foreground = 46;
    private static final int PROPERTY_foregroundSet = 47;
    private static final int PROPERTY_frontWheelValue = 48;
    private static final int PROPERTY_graphics = 49;
    private static final int PROPERTY_graphicsConfiguration = 50;
    private static final int PROPERTY_height = 51;
    private static final int PROPERTY_hierarchyBoundsListeners = 52;
    private static final int PROPERTY_hierarchyListeners = 53;
    private static final int PROPERTY_ignoreRepaint = 54;
    private static final int PROPERTY_inheritAlpha = 55;
    private static final int PROPERTY_inheritsPopupMenu = 56;
    private static final int PROPERTY_inputContext = 57;
    private static final int PROPERTY_inputMap = 58;
    private static final int PROPERTY_inputMethodListeners = 59;
    private static final int PROPERTY_inputMethodRequests = 60;
    private static final int PROPERTY_inputVerifier = 61;
    private static final int PROPERTY_insets = 62;
    private static final int PROPERTY_keyListeners = 63;
    private static final int PROPERTY_layout = 64;
    private static final int PROPERTY_leftDecoration = 65;
    private static final int PROPERTY_lightweight = 66;
    private static final int PROPERTY_locale = 67;
    private static final int PROPERTY_location = 68;
    private static final int PROPERTY_locationOnScreen = 69;
    private static final int PROPERTY_managingFocus = 70;
    private static final int PROPERTY_maximumSize = 71;
    private static final int PROPERTY_maximumSizeSet = 72;
    private static final int PROPERTY_minimumSize = 73;
    private static final int PROPERTY_minimumSizeSet = 74;
    private static final int PROPERTY_mouseListeners = 75;
    private static final int PROPERTY_mouseMotionListeners = 76;
    private static final int PROPERTY_mousePosition = 77;
    private static final int PROPERTY_mouseWheelListeners = 78;
    private static final int PROPERTY_name = 79;
    private static final int PROPERTY_nameValue = 80;
    private static final int PROPERTY_nextFocusableComponent = 81;
    private static final int PROPERTY_opaque = 82;
    private static final int PROPERTY_optimizedDrawingEnabled = 83;
    private static final int PROPERTY_paintBorderInsets = 84;
    private static final int PROPERTY_paintingForPrint = 85;
    private static final int PROPERTY_paintingTile = 86;
    private static final int PROPERTY_parent = 87;
    private static final int PROPERTY_peer = 88;
    private static final int PROPERTY_preferredScrollableViewportSize = 89;
    private static final int PROPERTY_preferredSize = 90;
    private static final int PROPERTY_preferredSizeSet = 91;
    private static final int PROPERTY_propertyChangeListeners = 92;
    private static final int PROPERTY_radiusValue = 93;
    private static final int PROPERTY_registeredKeyStrokes = 94;
    private static final int PROPERTY_requestFocusEnabled = 95;
    private static final int PROPERTY_restLengthValue = 96;
    private static final int PROPERTY_rightDecoration = 97;
    private static final int PROPERTY_rootPane = 98;
    private static final int PROPERTY_scrollableHeightHint = 99;
    private static final int PROPERTY_scrollableTracksViewportHeight = 100;
    private static final int PROPERTY_scrollableTracksViewportWidth = 101;
    private static final int PROPERTY_scrollableWidthHint = 102;
    private static final int PROPERTY_showing = 103;
    private static final int PROPERTY_size = 104;
    private static final int PROPERTY_spatialValue = 105;
    private static final int PROPERTY_title = 106;
    private static final int PROPERTY_titleFont = 107;
    private static final int PROPERTY_titleForeground = 108;
    private static final int PROPERTY_titlePainter = 109;
    private static final int PROPERTY_toolkit = 110;
    private static final int PROPERTY_toolTipText = 111;
    private static final int PROPERTY_topLevelAncestor = 112;
    private static final int PROPERTY_transferHandler = 113;
    private static final int PROPERTY_treeLock = 114;
    private static final int PROPERTY_UI = 115;
    private static final int PROPERTY_UIClassID = 116;
    private static final int PROPERTY_valid = 117;
    private static final int PROPERTY_validateRoot = 118;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 119;
    private static final int PROPERTY_vetoableChangeListeners = 120;
    private static final int PROPERTY_visible = 121;
    private static final int PROPERTY_visibleRect = 122;
    private static final int PROPERTY_width = 123;
    private static final int PROPERTY_x = 124;
    private static final int PROPERTY_y = 125;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[126];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_alpha] = new PropertyDescriptor ( "alpha", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAlpha", "setAlpha" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_axleValue] = new PropertyDescriptor ( "axleValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getAxleValue", "setAxleValue" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundPainter] = new PropertyDescriptor ( "backgroundPainter", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getBackgroundPainter", "setBackgroundPainter" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_connectionPointValue] = new PropertyDescriptor ( "connectionPointValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getConnectionPointValue", "setConnectionPointValue" ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_contentContainer] = new PropertyDescriptor ( "contentContainer", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getContentContainer", "setContentContainer" ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_directionValue] = new PropertyDescriptor ( "directionValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getDirectionValue", "setDirectionValue" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_effectiveAlpha] = new PropertyDescriptor ( "effectiveAlpha", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getEffectiveAlpha", null ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_frontWheelValue] = new PropertyDescriptor ( "frontWheelValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isFrontWheelValue", "setFrontWheelValue" ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritAlpha] = new PropertyDescriptor ( "inheritAlpha", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isInheritAlpha", "setInheritAlpha" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_leftDecoration] = new PropertyDescriptor ( "leftDecoration", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getLeftDecoration", "setLeftDecoration" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nameValue] = new PropertyDescriptor ( "nameValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getNameValue", null ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintBorderInsets] = new PropertyDescriptor ( "paintBorderInsets", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isPaintBorderInsets", "setPaintBorderInsets" ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredScrollableViewportSize] = new PropertyDescriptor ( "preferredScrollableViewportSize", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getPreferredScrollableViewportSize", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_radiusValue] = new PropertyDescriptor ( "radiusValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getRadiusValue", "setRadiusValue" ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_restLengthValue] = new PropertyDescriptor ( "restLengthValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getRestLengthValue", "setRestLengthValue" ); // NOI18N
            properties[PROPERTY_rightDecoration] = new PropertyDescriptor ( "rightDecoration", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getRightDecoration", "setRightDecoration" ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_scrollableHeightHint] = new PropertyDescriptor ( "scrollableHeightHint", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, null, "setScrollableHeightHint" ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportHeight] = new PropertyDescriptor ( "scrollableTracksViewportHeight", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getScrollableTracksViewportHeight", "setScrollableTracksViewportHeight" ); // NOI18N
            properties[PROPERTY_scrollableTracksViewportWidth] = new PropertyDescriptor ( "scrollableTracksViewportWidth", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getScrollableTracksViewportWidth", "setScrollableTracksViewportWidth" ); // NOI18N
            properties[PROPERTY_scrollableWidthHint] = new PropertyDescriptor ( "scrollableWidthHint", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, null, "setScrollableWidthHint" ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_spatialValue] = new PropertyDescriptor ( "spatialValue", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getSpatialValue", "setSpatialValue" ); // NOI18N
            properties[PROPERTY_title] = new PropertyDescriptor ( "title", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTitle", "setTitle" ); // NOI18N
            properties[PROPERTY_titleFont] = new PropertyDescriptor ( "titleFont", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTitleFont", "setTitleFont" ); // NOI18N
            properties[PROPERTY_titleForeground] = new PropertyDescriptor ( "titleForeground", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTitleForeground", "setTitleForeground" ); // NOI18N
            properties[PROPERTY_titlePainter] = new PropertyDescriptor ( "titlePainter", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTitlePainter", "setTitlePainter" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties

    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_ancestorListener = 0;
    private static final int EVENT_componentListener = 1;
    private static final int EVENT_containerListener = 2;
    private static final int EVENT_focusListener = 3;
    private static final int EVENT_hierarchyBoundsListener = 4;
    private static final int EVENT_hierarchyListener = 5;
    private static final int EVENT_inputMethodListener = 6;
    private static final int EVENT_keyListener = 7;
    private static final int EVENT_mouseListener = 8;
    private static final int EVENT_mouseMotionListener = 9;
    private static final int EVENT_mouseWheelListener = 10;
    private static final int EVENT_propertyChangeListener = 11;
    private static final int EVENT_vetoableChangeListener = 12;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[13];
    
        try {
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events

    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_addWheelPanelListener9 = 9;
    private static final int METHOD_applyComponentOrientation10 = 10;
    private static final int METHOD_areFocusTraversalKeysSet11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_computeVisibleRect15 = 15;
    private static final int METHOD_contains16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_countComponents18 = 18;
    private static final int METHOD_createImage19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createToolTip21 = 21;
    private static final int METHOD_createVolatileImage22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_deliverEvent24 = 24;
    private static final int METHOD_disable25 = 25;
    private static final int METHOD_dispatchEvent26 = 26;
    private static final int METHOD_doLayout27 = 27;
    private static final int METHOD_enable28 = 28;
    private static final int METHOD_enable29 = 29;
    private static final int METHOD_enableInputMethods30 = 30;
    private static final int METHOD_findComponentAt31 = 31;
    private static final int METHOD_findComponentAt32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_getActionForKeyStroke41 = 41;
    private static final int METHOD_getBaseline42 = 42;
    private static final int METHOD_getBounds43 = 43;
    private static final int METHOD_getClientProperty44 = 44;
    private static final int METHOD_getComponentAt45 = 45;
    private static final int METHOD_getComponentAt46 = 46;
    private static final int METHOD_getComponentZOrder47 = 47;
    private static final int METHOD_getConditionForKeyStroke48 = 48;
    private static final int METHOD_getDefaultLocale49 = 49;
    private static final int METHOD_getFocusTraversalKeys50 = 50;
    private static final int METHOD_getFontMetrics51 = 51;
    private static final int METHOD_getInsets52 = 52;
    private static final int METHOD_getListeners53 = 53;
    private static final int METHOD_getLocation54 = 54;
    private static final int METHOD_getMousePosition55 = 55;
    private static final int METHOD_getPopupLocation56 = 56;
    private static final int METHOD_getPropertyChangeListeners57 = 57;
    private static final int METHOD_getScrollableBlockIncrement58 = 58;
    private static final int METHOD_getScrollableUnitIncrement59 = 59;
    private static final int METHOD_getSize60 = 60;
    private static final int METHOD_getToolTipLocation61 = 61;
    private static final int METHOD_getToolTipText62 = 62;
    private static final int METHOD_gotFocus63 = 63;
    private static final int METHOD_grabFocus64 = 64;
    private static final int METHOD_handleEvent65 = 65;
    private static final int METHOD_hasFocus66 = 66;
    private static final int METHOD_hide67 = 67;
    private static final int METHOD_imageUpdate68 = 68;
    private static final int METHOD_insets69 = 69;
    private static final int METHOD_inside70 = 70;
    private static final int METHOD_invalidate71 = 71;
    private static final int METHOD_isAncestorOf72 = 72;
    private static final int METHOD_isFocusCycleRoot73 = 73;
    private static final int METHOD_isLightweightComponent74 = 74;
    private static final int METHOD_keyDown75 = 75;
    private static final int METHOD_keyUp76 = 76;
    private static final int METHOD_layout77 = 77;
    private static final int METHOD_list78 = 78;
    private static final int METHOD_list79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_locate83 = 83;
    private static final int METHOD_location84 = 84;
    private static final int METHOD_lostFocus85 = 85;
    private static final int METHOD_minimumSize86 = 86;
    private static final int METHOD_mouseDown87 = 87;
    private static final int METHOD_mouseDrag88 = 88;
    private static final int METHOD_mouseEnter89 = 89;
    private static final int METHOD_mouseExit90 = 90;
    private static final int METHOD_mouseMove91 = 91;
    private static final int METHOD_mouseUp92 = 92;
    private static final int METHOD_move93 = 93;
    private static final int METHOD_nextFocus94 = 94;
    private static final int METHOD_paint95 = 95;
    private static final int METHOD_paintAll96 = 96;
    private static final int METHOD_paintComponents97 = 97;
    private static final int METHOD_paintImmediately98 = 98;
    private static final int METHOD_paintImmediately99 = 99;
    private static final int METHOD_postEvent100 = 100;
    private static final int METHOD_preferredSize101 = 101;
    private static final int METHOD_prepareImage102 = 102;
    private static final int METHOD_prepareImage103 = 103;
    private static final int METHOD_print104 = 104;
    private static final int METHOD_printAll105 = 105;
    private static final int METHOD_printComponents106 = 106;
    private static final int METHOD_putClientProperty107 = 107;
    private static final int METHOD_registerKeyboardAction108 = 108;
    private static final int METHOD_registerKeyboardAction109 = 109;
    private static final int METHOD_remove110 = 110;
    private static final int METHOD_remove111 = 111;
    private static final int METHOD_remove112 = 112;
    private static final int METHOD_removeAll113 = 113;
    private static final int METHOD_removeNotify114 = 114;
    private static final int METHOD_removePropertyChangeListener115 = 115;
    private static final int METHOD_removeWheelPanelListener116 = 116;
    private static final int METHOD_repaint117 = 117;
    private static final int METHOD_repaint118 = 118;
    private static final int METHOD_repaint119 = 119;
    private static final int METHOD_repaint120 = 120;
    private static final int METHOD_repaint121 = 121;
    private static final int METHOD_requestDefaultFocus122 = 122;
    private static final int METHOD_requestFocus123 = 123;
    private static final int METHOD_requestFocus124 = 124;
    private static final int METHOD_requestFocusInWindow125 = 125;
    private static final int METHOD_resetKeyboardActions126 = 126;
    private static final int METHOD_reshape127 = 127;
    private static final int METHOD_resize128 = 128;
    private static final int METHOD_resize129 = 129;
    private static final int METHOD_revalidate130 = 130;
    private static final int METHOD_scrollRectToVisible131 = 131;
    private static final int METHOD_setBounds132 = 132;
    private static final int METHOD_setComponentZOrder133 = 133;
    private static final int METHOD_setDefaultLocale134 = 134;
    private static final int METHOD_setNameValue135 = 135;
    private static final int METHOD_setUI136 = 136;
    private static final int METHOD_show137 = 137;
    private static final int METHOD_show138 = 138;
    private static final int METHOD_size139 = 139;
    private static final int METHOD_toString140 = 140;
    private static final int METHOD_transferFocus141 = 141;
    private static final int METHOD_transferFocusBackward142 = 142;
    private static final int METHOD_transferFocusDownCycle143 = 143;
    private static final int METHOD_transferFocusUpCycle144 = 144;
    private static final int METHOD_unregisterKeyboardAction145 = 145;
    private static final int METHOD_update146 = 146;
    private static final int METHOD_updateUI147 = 147;
    private static final int METHOD_validate148 = 148;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[149];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_addWheelPanelListener9] = new MethodDescriptor(com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class.getMethod("addWheelPanelListener", new Class[] {com.jme3.gde.jmeguiforms.event.WheelPanelListener.class})); // NOI18N
            methods[METHOD_addWheelPanelListener9].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation10] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation10].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet11] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect15] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect15].setDisplayName ( "" );
            methods[METHOD_contains16] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_countComponents18] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents18].setDisplayName ( "" );
            methods[METHOD_createImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createToolTip21] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip21].setDisplayName ( "" );
            methods[METHOD_createVolatileImage22] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_deliverEvent24] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent24].setDisplayName ( "" );
            methods[METHOD_disable25] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable25].setDisplayName ( "" );
            methods[METHOD_dispatchEvent26] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent26].setDisplayName ( "" );
            methods[METHOD_doLayout27] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout27].setDisplayName ( "" );
            methods[METHOD_enable28] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable28].setDisplayName ( "" );
            methods[METHOD_enable29] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable29].setDisplayName ( "" );
            methods[METHOD_enableInputMethods30] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods30].setDisplayName ( "" );
            methods[METHOD_findComponentAt31] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt31].setDisplayName ( "" );
            methods[METHOD_findComponentAt32] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt32].setDisplayName ( "" );
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke41].setDisplayName ( "" );
            methods[METHOD_getBaseline42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline42].setDisplayName ( "" );
            methods[METHOD_getBounds43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds43].setDisplayName ( "" );
            methods[METHOD_getClientProperty44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty44].setDisplayName ( "" );
            methods[METHOD_getComponentAt45] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt45].setDisplayName ( "" );
            methods[METHOD_getComponentAt46] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt46].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder47] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder47].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke48] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke48].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale49] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale49].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys50] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys50].setDisplayName ( "" );
            methods[METHOD_getFontMetrics51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics51].setDisplayName ( "" );
            methods[METHOD_getInsets52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets52].setDisplayName ( "" );
            methods[METHOD_getListeners53] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners53].setDisplayName ( "" );
            methods[METHOD_getLocation54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation54].setDisplayName ( "" );
            methods[METHOD_getMousePosition55] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition55].setDisplayName ( "" );
            methods[METHOD_getPopupLocation56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation56].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners57] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners57].setDisplayName ( "" );
            methods[METHOD_getScrollableBlockIncrement58] = new MethodDescriptor(org.jdesktop.swingx.JXPanel.class.getMethod("getScrollableBlockIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableBlockIncrement58].setDisplayName ( "" );
            methods[METHOD_getScrollableUnitIncrement59] = new MethodDescriptor(org.jdesktop.swingx.JXPanel.class.getMethod("getScrollableUnitIncrement", new Class[] {java.awt.Rectangle.class, int.class, int.class})); // NOI18N
            methods[METHOD_getScrollableUnitIncrement59].setDisplayName ( "" );
            methods[METHOD_getSize60] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize60].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation61].setDisplayName ( "" );
            methods[METHOD_getToolTipText62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText62].setDisplayName ( "" );
            methods[METHOD_gotFocus63] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus63].setDisplayName ( "" );
            methods[METHOD_grabFocus64] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus64].setDisplayName ( "" );
            methods[METHOD_handleEvent65] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent65].setDisplayName ( "" );
            methods[METHOD_hasFocus66] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus66].setDisplayName ( "" );
            methods[METHOD_hide67] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide67].setDisplayName ( "" );
            methods[METHOD_imageUpdate68] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate68].setDisplayName ( "" );
            methods[METHOD_insets69] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets69].setDisplayName ( "" );
            methods[METHOD_inside70] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside70].setDisplayName ( "" );
            methods[METHOD_invalidate71] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate71].setDisplayName ( "" );
            methods[METHOD_isAncestorOf72] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf72].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot73] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot73].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent74] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent74].setDisplayName ( "" );
            methods[METHOD_keyDown75] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown75].setDisplayName ( "" );
            methods[METHOD_keyUp76] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp76].setDisplayName ( "" );
            methods[METHOD_layout77] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout77].setDisplayName ( "" );
            methods[METHOD_list78] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list78].setDisplayName ( "" );
            methods[METHOD_list79] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_locate83] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate83].setDisplayName ( "" );
            methods[METHOD_location84] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location84].setDisplayName ( "" );
            methods[METHOD_lostFocus85] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus85].setDisplayName ( "" );
            methods[METHOD_minimumSize86] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize86].setDisplayName ( "" );
            methods[METHOD_mouseDown87] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown87].setDisplayName ( "" );
            methods[METHOD_mouseDrag88] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag88].setDisplayName ( "" );
            methods[METHOD_mouseEnter89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter89].setDisplayName ( "" );
            methods[METHOD_mouseExit90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit90].setDisplayName ( "" );
            methods[METHOD_mouseMove91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove91].setDisplayName ( "" );
            methods[METHOD_mouseUp92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp92].setDisplayName ( "" );
            methods[METHOD_move93] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move93].setDisplayName ( "" );
            methods[METHOD_nextFocus94] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus94].setDisplayName ( "" );
            methods[METHOD_paint95] = new MethodDescriptor(org.jdesktop.swingx.JXPanel.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint95].setDisplayName ( "" );
            methods[METHOD_paintAll96] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll96].setDisplayName ( "" );
            methods[METHOD_paintComponents97] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents97].setDisplayName ( "" );
            methods[METHOD_paintImmediately98] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately98].setDisplayName ( "" );
            methods[METHOD_paintImmediately99] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately99].setDisplayName ( "" );
            methods[METHOD_postEvent100] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent100].setDisplayName ( "" );
            methods[METHOD_preferredSize101] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize101].setDisplayName ( "" );
            methods[METHOD_prepareImage102] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage102].setDisplayName ( "" );
            methods[METHOD_prepareImage103] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage103].setDisplayName ( "" );
            methods[METHOD_print104] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print104].setDisplayName ( "" );
            methods[METHOD_printAll105] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll105].setDisplayName ( "" );
            methods[METHOD_printComponents106] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents106].setDisplayName ( "" );
            methods[METHOD_putClientProperty107] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty107].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction108] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction108].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction109] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction109].setDisplayName ( "" );
            methods[METHOD_remove110] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove110].setDisplayName ( "" );
            methods[METHOD_remove111] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove111].setDisplayName ( "" );
            methods[METHOD_remove112] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove112].setDisplayName ( "" );
            methods[METHOD_removeAll113] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll113].setDisplayName ( "" );
            methods[METHOD_removeNotify114] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify114].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener115] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener115].setDisplayName ( "" );
            methods[METHOD_removeWheelPanelListener116] = new MethodDescriptor(com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class.getMethod("removeWheelPanelListener", new Class[] {com.jme3.gde.jmeguiforms.event.WheelPanelListener.class})); // NOI18N
            methods[METHOD_removeWheelPanelListener116].setDisplayName ( "" );
            methods[METHOD_repaint117] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint117].setDisplayName ( "" );
            methods[METHOD_repaint118] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint118].setDisplayName ( "" );
            methods[METHOD_repaint119] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint119].setDisplayName ( "" );
            methods[METHOD_repaint120] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint120].setDisplayName ( "" );
            methods[METHOD_repaint121] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint121].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus122].setDisplayName ( "" );
            methods[METHOD_requestFocus123] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus123].setDisplayName ( "" );
            methods[METHOD_requestFocus124] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus124].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow125] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow125].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions126] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions126].setDisplayName ( "" );
            methods[METHOD_reshape127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape127].setDisplayName ( "" );
            methods[METHOD_resize128] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize128].setDisplayName ( "" );
            methods[METHOD_resize129] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize129].setDisplayName ( "" );
            methods[METHOD_revalidate130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate130].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible131].setDisplayName ( "" );
            methods[METHOD_setBounds132] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds132].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder133] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder133].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale134].setDisplayName ( "" );
            methods[METHOD_setNameValue135] = new MethodDescriptor(com.jme3.gde.jmeguiforms.WheelPanelBeanForm.class.getMethod("setNameValue", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_setNameValue135].setDisplayName ( "" );
            methods[METHOD_setUI136] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("setUI", new Class[] {javax.swing.plaf.PanelUI.class})); // NOI18N
            methods[METHOD_setUI136].setDisplayName ( "" );
            methods[METHOD_show137] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show137].setDisplayName ( "" );
            methods[METHOD_show138] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show138].setDisplayName ( "" );
            methods[METHOD_size139] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size139].setDisplayName ( "" );
            methods[METHOD_toString140] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString140].setDisplayName ( "" );
            methods[METHOD_transferFocus141] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus141].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward142] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward142].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle143] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle143].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle144] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle144].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction145] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction145].setDisplayName ( "" );
            methods[METHOD_update146] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update146].setDisplayName ( "" );
            methods[METHOD_updateUI147] = new MethodDescriptor(org.jdesktop.swingx.JXTitledPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI147].setDisplayName ( "" );
            methods[METHOD_validate148] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate148].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods

    // Here you can add code for customizing the methods array.
    
        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx

    
//GEN-FIRST:Superclass

    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
	
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     * 
     * @return BeanDescriptor describing the editable
     * properties of this bean.  May return null if the
     * information should be obtained by automatic analysis.
     */
    public BeanDescriptor getBeanDescriptor() {
	return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     * 
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean.  May return null if the
     * information should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will
     * belong to the IndexedPropertyDescriptor subclass of PropertyDescriptor.
     * A client of getPropertyDescriptors can use "instanceof" to check
     * if a given PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    public PropertyDescriptor[] getPropertyDescriptors() {
	return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     * 
     * @return  An array of EventSetDescriptors describing the kinds of 
     * events fired by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public EventSetDescriptor[] getEventSetDescriptors() {
	return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     * 
     * @return  An array of MethodDescriptors describing the methods 
     * implemented by this bean.  May return null if the information
     * should be obtained by automatic analysis.
     */
    public MethodDescriptor[] getMethodDescriptors() {
	return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are 
     * customizing the bean.
     * @return  Index of default property in the PropertyDescriptor array
     * 		returned by getPropertyDescriptors.
     * <P>	Returns -1 if there is no default property.
     */
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will
     * mostly commonly be used by human's when using the bean. 
     * @return Index of default event in the EventSetDescriptor array
     *		returned by getEventSetDescriptors.
     * <P>	Returns -1 if there is no default event.
     */
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to
     * represent the bean in toolboxes, toolbars, etc.   Icon images
     * will typically be GIFs, but may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from
     * this method.
     * <p>
     * There are four possible flavors of icons (16x16 color,
     * 32x32 color, 16x16 mono, 32x32 mono).  If a bean choses to only
     * support a single icon we recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background
     * so they can be rendered onto an existing background.
     *
     * @param  iconKind  The kind of icon requested.  This should be
     *    one of the constant values ICON_COLOR_16x16, ICON_COLOR_32x32, 
     *    ICON_MONO_16x16, or ICON_MONO_32x32.
     * @return  An image object representing the requested icon.  May
     *    return null if no suitable icon is available.
     */
    public java.awt.Image getIcon(int iconKind) {
        switch ( iconKind ) {
        case ICON_COLOR_16x16:
            if ( iconNameC16 == null )
                return null;
            else {
                if( iconColor16 == null )
                    iconColor16 = loadImage( iconNameC16 );
                return iconColor16;
            }
        case ICON_COLOR_32x32:
            if ( iconNameC32 == null )
                return null;
            else {
                if( iconColor32 == null )
                    iconColor32 = loadImage( iconNameC32 );
                return iconColor32;
            }
        case ICON_MONO_16x16:
            if ( iconNameM16 == null )
                return null;
            else {
                if( iconMono16 == null )
                    iconMono16 = loadImage( iconNameM16 );
                return iconMono16;
            }
        case ICON_MONO_32x32:
            if ( iconNameM32 == null )
                return null;
            else {
                if( iconMono32 == null )
                    iconMono32 = loadImage( iconNameM32 );
                return iconMono32;
            }
	default: return null;
        }
    }

}

