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
public class OffScenePanelBeanFormBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor

    // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_actionMap = 1;
    private static final int PROPERTY_alignmentX = 2;
    private static final int PROPERTY_alignmentY = 3;
    private static final int PROPERTY_ancestorListeners = 4;
    private static final int PROPERTY_autoscrolls = 5;
    private static final int PROPERTY_background = 6;
    private static final int PROPERTY_backgroundSet = 7;
    private static final int PROPERTY_baselineResizeBehavior = 8;
    private static final int PROPERTY_border = 9;
    private static final int PROPERTY_bounds = 10;
    private static final int PROPERTY_camera = 11;
    private static final int PROPERTY_camFocus = 12;
    private static final int PROPERTY_colorModel = 13;
    private static final int PROPERTY_component = 14;
    private static final int PROPERTY_componentCount = 15;
    private static final int PROPERTY_componentListeners = 16;
    private static final int PROPERTY_componentOrientation = 17;
    private static final int PROPERTY_componentPopupMenu = 18;
    private static final int PROPERTY_components = 19;
    private static final int PROPERTY_containerListeners = 20;
    private static final int PROPERTY_cursor = 21;
    private static final int PROPERTY_cursorSet = 22;
    private static final int PROPERTY_debugGraphicsOptions = 23;
    private static final int PROPERTY_displayable = 24;
    private static final int PROPERTY_doubleBuffered = 25;
    private static final int PROPERTY_dropTarget = 26;
    private static final int PROPERTY_enabled = 27;
    private static final int PROPERTY_focusable = 28;
    private static final int PROPERTY_focusCycleRoot = 29;
    private static final int PROPERTY_focusCycleRootAncestor = 30;
    private static final int PROPERTY_focusListeners = 31;
    private static final int PROPERTY_focusOwner = 32;
    private static final int PROPERTY_focusTraversable = 33;
    private static final int PROPERTY_focusTraversalKeys = 34;
    private static final int PROPERTY_focusTraversalKeysEnabled = 35;
    private static final int PROPERTY_focusTraversalPolicy = 36;
    private static final int PROPERTY_focusTraversalPolicyProvider = 37;
    private static final int PROPERTY_focusTraversalPolicySet = 38;
    private static final int PROPERTY_font = 39;
    private static final int PROPERTY_fontSet = 40;
    private static final int PROPERTY_foreground = 41;
    private static final int PROPERTY_foregroundSet = 42;
    private static final int PROPERTY_graphics = 43;
    private static final int PROPERTY_graphicsConfiguration = 44;
    private static final int PROPERTY_height = 45;
    private static final int PROPERTY_hierarchyBoundsListeners = 46;
    private static final int PROPERTY_hierarchyListeners = 47;
    private static final int PROPERTY_ignoreRepaint = 48;
    private static final int PROPERTY_inheritsPopupMenu = 49;
    private static final int PROPERTY_initialized = 50;
    private static final int PROPERTY_inputContext = 51;
    private static final int PROPERTY_inputMap = 52;
    private static final int PROPERTY_inputMethodListeners = 53;
    private static final int PROPERTY_inputMethodRequests = 54;
    private static final int PROPERTY_inputVerifier = 55;
    private static final int PROPERTY_insets = 56;
    private static final int PROPERTY_keyListeners = 57;
    private static final int PROPERTY_layout = 58;
    private static final int PROPERTY_lightweight = 59;
    private static final int PROPERTY_locale = 60;
    private static final int PROPERTY_location = 61;
    private static final int PROPERTY_locationOnScreen = 62;
    private static final int PROPERTY_managingFocus = 63;
    private static final int PROPERTY_maximumSize = 64;
    private static final int PROPERTY_maximumSizeSet = 65;
    private static final int PROPERTY_minimumSize = 66;
    private static final int PROPERTY_minimumSizeSet = 67;
    private static final int PROPERTY_mouseListeners = 68;
    private static final int PROPERTY_mouseMotionListeners = 69;
    private static final int PROPERTY_mousePosition = 70;
    private static final int PROPERTY_mouseWheelListeners = 71;
    private static final int PROPERTY_name = 72;
    private static final int PROPERTY_nextFocusableComponent = 73;
    private static final int PROPERTY_opaque = 74;
    private static final int PROPERTY_optimizedDrawingEnabled = 75;
    private static final int PROPERTY_paintingForPrint = 76;
    private static final int PROPERTY_paintingTile = 77;
    private static final int PROPERTY_parent = 78;
    private static final int PROPERTY_peer = 79;
    private static final int PROPERTY_preferredSize = 80;
    private static final int PROPERTY_preferredSizeSet = 81;
    private static final int PROPERTY_propertyChangeListeners = 82;
    private static final int PROPERTY_registeredKeyStrokes = 83;
    private static final int PROPERTY_requestFocusEnabled = 84;
    private static final int PROPERTY_rootNode = 85;
    private static final int PROPERTY_rootPane = 86;
    private static final int PROPERTY_showing = 87;
    private static final int PROPERTY_size = 88;
    private static final int PROPERTY_toolkit = 89;
    private static final int PROPERTY_toolTipText = 90;
    private static final int PROPERTY_topLevelAncestor = 91;
    private static final int PROPERTY_transferHandler = 92;
    private static final int PROPERTY_treeLock = 93;
    private static final int PROPERTY_UI = 94;
    private static final int PROPERTY_UIClassID = 95;
    private static final int PROPERTY_valid = 96;
    private static final int PROPERTY_validateRoot = 97;
    private static final int PROPERTY_verifyInputWhenFocusTarget = 98;
    private static final int PROPERTY_vetoableChangeListeners = 99;
    private static final int PROPERTY_viewPort = 100;
    private static final int PROPERTY_visible = 101;
    private static final int PROPERTY_visibleRect = 102;
    private static final int PROPERTY_width = 103;
    private static final int PROPERTY_x = 104;
    private static final int PROPERTY_y = 105;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[106];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_actionMap] = new PropertyDescriptor ( "actionMap", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getActionMap", "setActionMap" ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getAlignmentX", "setAlignmentX" ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getAlignmentY", "setAlignmentY" ); // NOI18N
            properties[PROPERTY_ancestorListeners] = new PropertyDescriptor ( "ancestorListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getAncestorListeners", null ); // NOI18N
            properties[PROPERTY_autoscrolls] = new PropertyDescriptor ( "autoscrolls", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getAutoscrolls", "setAutoscrolls" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_camera] = new PropertyDescriptor ( "camera", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getCamera", null ); // NOI18N
            properties[PROPERTY_camFocus] = new PropertyDescriptor ( "camFocus", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, null, "setCamFocus" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_componentPopupMenu] = new PropertyDescriptor ( "componentPopupMenu", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getComponentPopupMenu", "setComponentPopupMenu" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_debugGraphicsOptions] = new PropertyDescriptor ( "debugGraphicsOptions", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getDebugGraphicsOptions", "setDebugGraphicsOptions" ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isDoubleBuffered", "setDoubleBuffered" ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, null, null, null, "setFocusTraversalKeys" ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inheritsPopupMenu] = new PropertyDescriptor ( "inheritsPopupMenu", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInheritsPopupMenu", "setInheritsPopupMenu" ); // NOI18N
            properties[PROPERTY_initialized] = new PropertyDescriptor ( "initialized", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isInitialized", null ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMap] = new PropertyDescriptor ( "inputMap", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInputMap", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_inputVerifier] = new PropertyDescriptor ( "inputVerifier", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInputVerifier", "setInputVerifier" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_managingFocus] = new PropertyDescriptor ( "managingFocus", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isManagingFocus", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_nextFocusableComponent] = new PropertyDescriptor ( "nextFocusableComponent", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getNextFocusableComponent", "setNextFocusableComponent" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isOpaque", "setOpaque" ); // NOI18N
            properties[PROPERTY_optimizedDrawingEnabled] = new PropertyDescriptor ( "optimizedDrawingEnabled", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isOptimizedDrawingEnabled", null ); // NOI18N
            properties[PROPERTY_paintingForPrint] = new PropertyDescriptor ( "paintingForPrint", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isPaintingForPrint", null ); // NOI18N
            properties[PROPERTY_paintingTile] = new PropertyDescriptor ( "paintingTile", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isPaintingTile", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_registeredKeyStrokes] = new PropertyDescriptor ( "registeredKeyStrokes", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getRegisteredKeyStrokes", null ); // NOI18N
            properties[PROPERTY_requestFocusEnabled] = new PropertyDescriptor ( "requestFocusEnabled", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isRequestFocusEnabled", "setRequestFocusEnabled" ); // NOI18N
            properties[PROPERTY_rootNode] = new PropertyDescriptor ( "rootNode", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getRootNode", null ); // NOI18N
            properties[PROPERTY_rootPane] = new PropertyDescriptor ( "rootPane", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getRootPane", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_toolTipText] = new PropertyDescriptor ( "toolTipText", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getToolTipText", "setToolTipText" ); // NOI18N
            properties[PROPERTY_topLevelAncestor] = new PropertyDescriptor ( "topLevelAncestor", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getTopLevelAncestor", null ); // NOI18N
            properties[PROPERTY_transferHandler] = new PropertyDescriptor ( "transferHandler", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getTransferHandler", "setTransferHandler" ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_UI] = new PropertyDescriptor ( "UI", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getUI", "setUI" ); // NOI18N
            properties[PROPERTY_UIClassID] = new PropertyDescriptor ( "UIClassID", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getUIClassID", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_verifyInputWhenFocusTarget] = new PropertyDescriptor ( "verifyInputWhenFocusTarget", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getVerifyInputWhenFocusTarget", "setVerifyInputWhenFocusTarget" ); // NOI18N
            properties[PROPERTY_vetoableChangeListeners] = new PropertyDescriptor ( "vetoableChangeListeners", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getVetoableChangeListeners", null ); // NOI18N
            properties[PROPERTY_viewPort] = new PropertyDescriptor ( "viewPort", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getViewPort", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_visibleRect] = new PropertyDescriptor ( "visibleRect", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getVisibleRect", null ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "getY", null ); // NOI18N
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
            eventSets[EVENT_ancestorListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "ancestorListener", javax.swing.event.AncestorListener.class, new String[] {"ancestorAdded", "ancestorRemoved", "ancestorMoved"}, "addAncestorListener", "removeAncestorListener" ); // NOI18N
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
            eventSets[EVENT_vetoableChangeListener] = new EventSetDescriptor ( com.jme3.gde.jmeguiforms.OffScenePanelBeanForm.class, "vetoableChangeListener", java.beans.VetoableChangeListener.class, new String[] {"vetoableChange"}, "addVetoableChangeListener", "removeVetoableChangeListener" ); // NOI18N
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
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_attach11 = 11;
    private static final int METHOD_bounds12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_checkImage14 = 14;
    private static final int METHOD_cleanup15 = 15;
    private static final int METHOD_computeVisibleRect16 = 16;
    private static final int METHOD_contains17 = 17;
    private static final int METHOD_contains18 = 18;
    private static final int METHOD_countComponents19 = 19;
    private static final int METHOD_createImage20 = 20;
    private static final int METHOD_createImage21 = 21;
    private static final int METHOD_createToolTip22 = 22;
    private static final int METHOD_createVolatileImage23 = 23;
    private static final int METHOD_createVolatileImage24 = 24;
    private static final int METHOD_deliverEvent25 = 25;
    private static final int METHOD_detach26 = 26;
    private static final int METHOD_disable27 = 27;
    private static final int METHOD_dispatchEvent28 = 28;
    private static final int METHOD_doLayout29 = 29;
    private static final int METHOD_doSetCamFocus30 = 30;
    private static final int METHOD_enable31 = 31;
    private static final int METHOD_enable32 = 32;
    private static final int METHOD_enableInputMethods33 = 33;
    private static final int METHOD_findComponentAt34 = 34;
    private static final int METHOD_findComponentAt35 = 35;
    private static final int METHOD_firePropertyChange36 = 36;
    private static final int METHOD_firePropertyChange37 = 37;
    private static final int METHOD_firePropertyChange38 = 38;
    private static final int METHOD_firePropertyChange39 = 39;
    private static final int METHOD_firePropertyChange40 = 40;
    private static final int METHOD_firePropertyChange41 = 41;
    private static final int METHOD_firePropertyChange42 = 42;
    private static final int METHOD_firePropertyChange43 = 43;
    private static final int METHOD_getActionForKeyStroke44 = 44;
    private static final int METHOD_getBaseline45 = 45;
    private static final int METHOD_getBounds46 = 46;
    private static final int METHOD_getClientProperty47 = 47;
    private static final int METHOD_getComponentAt48 = 48;
    private static final int METHOD_getComponentAt49 = 49;
    private static final int METHOD_getComponentZOrder50 = 50;
    private static final int METHOD_getConditionForKeyStroke51 = 51;
    private static final int METHOD_getDefaultLocale52 = 52;
    private static final int METHOD_getFocusTraversalKeys53 = 53;
    private static final int METHOD_getFontMetrics54 = 54;
    private static final int METHOD_getInsets55 = 55;
    private static final int METHOD_getListeners56 = 56;
    private static final int METHOD_getLocation57 = 57;
    private static final int METHOD_getMousePosition58 = 58;
    private static final int METHOD_getPopupLocation59 = 59;
    private static final int METHOD_getPropertyChangeListeners60 = 60;
    private static final int METHOD_getSize61 = 61;
    private static final int METHOD_getToolTipLocation62 = 62;
    private static final int METHOD_getToolTipText63 = 63;
    private static final int METHOD_gotFocus64 = 64;
    private static final int METHOD_grabFocus65 = 65;
    private static final int METHOD_handleEvent66 = 66;
    private static final int METHOD_hasFocus67 = 67;
    private static final int METHOD_hide68 = 68;
    private static final int METHOD_imageUpdate69 = 69;
    private static final int METHOD_initialize70 = 70;
    private static final int METHOD_insets71 = 71;
    private static final int METHOD_inside72 = 72;
    private static final int METHOD_invalidate73 = 73;
    private static final int METHOD_isAncestorOf74 = 74;
    private static final int METHOD_isFocusCycleRoot75 = 75;
    private static final int METHOD_isLightweightComponent76 = 76;
    private static final int METHOD_keyDown77 = 77;
    private static final int METHOD_keyUp78 = 78;
    private static final int METHOD_layout79 = 79;
    private static final int METHOD_list80 = 80;
    private static final int METHOD_list81 = 81;
    private static final int METHOD_list82 = 82;
    private static final int METHOD_list83 = 83;
    private static final int METHOD_list84 = 84;
    private static final int METHOD_locate85 = 85;
    private static final int METHOD_location86 = 86;
    private static final int METHOD_lostFocus87 = 87;
    private static final int METHOD_minimumSize88 = 88;
    private static final int METHOD_mouseDown89 = 89;
    private static final int METHOD_mouseDrag90 = 90;
    private static final int METHOD_mouseEnter91 = 91;
    private static final int METHOD_mouseExit92 = 92;
    private static final int METHOD_mouseMove93 = 93;
    private static final int METHOD_mouseUp94 = 94;
    private static final int METHOD_move95 = 95;
    private static final int METHOD_moveCamera96 = 96;
    private static final int METHOD_nextFocus97 = 97;
    private static final int METHOD_paint98 = 98;
    private static final int METHOD_paintAll99 = 99;
    private static final int METHOD_paintComponent100 = 100;
    private static final int METHOD_paintComponents101 = 101;
    private static final int METHOD_paintImmediately102 = 102;
    private static final int METHOD_paintImmediately103 = 103;
    private static final int METHOD_panCamera104 = 104;
    private static final int METHOD_postEvent105 = 105;
    private static final int METHOD_postFrame106 = 106;
    private static final int METHOD_postQueue107 = 107;
    private static final int METHOD_preferredSize108 = 108;
    private static final int METHOD_preFrame109 = 109;
    private static final int METHOD_prepareImage110 = 110;
    private static final int METHOD_prepareImage111 = 111;
    private static final int METHOD_print112 = 112;
    private static final int METHOD_printAll113 = 113;
    private static final int METHOD_printComponents114 = 114;
    private static final int METHOD_putClientProperty115 = 115;
    private static final int METHOD_registerKeyboardAction116 = 116;
    private static final int METHOD_registerKeyboardAction117 = 117;
    private static final int METHOD_remove118 = 118;
    private static final int METHOD_remove119 = 119;
    private static final int METHOD_remove120 = 120;
    private static final int METHOD_removeAll121 = 121;
    private static final int METHOD_removeNotify122 = 122;
    private static final int METHOD_removePropertyChangeListener123 = 123;
    private static final int METHOD_repaint124 = 124;
    private static final int METHOD_repaint125 = 125;
    private static final int METHOD_repaint126 = 126;
    private static final int METHOD_repaint127 = 127;
    private static final int METHOD_repaint128 = 128;
    private static final int METHOD_requestDefaultFocus129 = 129;
    private static final int METHOD_requestFocus130 = 130;
    private static final int METHOD_requestFocus131 = 131;
    private static final int METHOD_requestFocusInWindow132 = 132;
    private static final int METHOD_resetKeyboardActions133 = 133;
    private static final int METHOD_reshape134 = 134;
    private static final int METHOD_reshape135 = 135;
    private static final int METHOD_resize136 = 136;
    private static final int METHOD_resize137 = 137;
    private static final int METHOD_revalidate138 = 138;
    private static final int METHOD_rotateCamera139 = 139;
    private static final int METHOD_scrollRectToVisible140 = 140;
    private static final int METHOD_setBounds141 = 141;
    private static final int METHOD_setComponentZOrder142 = 142;
    private static final int METHOD_setDefaultLocale143 = 143;
    private static final int METHOD_show144 = 144;
    private static final int METHOD_show145 = 145;
    private static final int METHOD_size146 = 146;
    private static final int METHOD_startPreview147 = 147;
    private static final int METHOD_stopPreview148 = 148;
    private static final int METHOD_toString149 = 149;
    private static final int METHOD_transferFocus150 = 150;
    private static final int METHOD_transferFocusBackward151 = 151;
    private static final int METHOD_transferFocusDownCycle152 = 152;
    private static final int METHOD_transferFocusUpCycle153 = 153;
    private static final int METHOD_unregisterKeyboardAction154 = 154;
    private static final int METHOD_update155 = 155;
    private static final int METHOD_updateUI156 = 156;
    private static final int METHOD_validate157 = 157;
    private static final int METHOD_zoomCamera158 = 158;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[159];
    
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
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_attach11] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("attach", new Class[] {com.jme3.scene.Spatial.class})); // NOI18N
            methods[METHOD_attach11].setDisplayName ( "" );
            methods[METHOD_bounds12] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_checkImage14] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage14].setDisplayName ( "" );
            methods[METHOD_cleanup15] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("cleanup", new Class[] {})); // NOI18N
            methods[METHOD_cleanup15].setDisplayName ( "" );
            methods[METHOD_computeVisibleRect16] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("computeVisibleRect", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_computeVisibleRect16].setDisplayName ( "" );
            methods[METHOD_contains17] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains17].setDisplayName ( "" );
            methods[METHOD_contains18] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains18].setDisplayName ( "" );
            methods[METHOD_countComponents19] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents19].setDisplayName ( "" );
            methods[METHOD_createImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage20].setDisplayName ( "" );
            methods[METHOD_createImage21] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage21].setDisplayName ( "" );
            methods[METHOD_createToolTip22] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("createToolTip", new Class[] {})); // NOI18N
            methods[METHOD_createToolTip22].setDisplayName ( "" );
            methods[METHOD_createVolatileImage23] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage23].setDisplayName ( "" );
            methods[METHOD_createVolatileImage24] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage24].setDisplayName ( "" );
            methods[METHOD_deliverEvent25] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent25].setDisplayName ( "" );
            methods[METHOD_detach26] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("detach", new Class[] {com.jme3.scene.Spatial.class})); // NOI18N
            methods[METHOD_detach26].setDisplayName ( "" );
            methods[METHOD_disable27] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable27].setDisplayName ( "" );
            methods[METHOD_dispatchEvent28] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent28].setDisplayName ( "" );
            methods[METHOD_doLayout29] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout29].setDisplayName ( "" );
            methods[METHOD_doSetCamFocus30] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("doSetCamFocus", new Class[] {com.jme3.math.Vector3f.class})); // NOI18N
            methods[METHOD_doSetCamFocus30].setDisplayName ( "" );
            methods[METHOD_enable31] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable31].setDisplayName ( "" );
            methods[METHOD_enable32] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable32].setDisplayName ( "" );
            methods[METHOD_enableInputMethods33] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods33].setDisplayName ( "" );
            methods[METHOD_findComponentAt34] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt34].setDisplayName ( "" );
            methods[METHOD_findComponentAt35] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt35].setDisplayName ( "" );
            methods[METHOD_firePropertyChange36] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange36].setDisplayName ( "" );
            methods[METHOD_firePropertyChange37] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange37].setDisplayName ( "" );
            methods[METHOD_firePropertyChange38] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange38].setDisplayName ( "" );
            methods[METHOD_firePropertyChange39] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange39].setDisplayName ( "" );
            methods[METHOD_firePropertyChange40] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange40].setDisplayName ( "" );
            methods[METHOD_firePropertyChange41] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, boolean.class, boolean.class})); // NOI18N
            methods[METHOD_firePropertyChange41].setDisplayName ( "" );
            methods[METHOD_firePropertyChange42] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, int.class, int.class})); // NOI18N
            methods[METHOD_firePropertyChange42].setDisplayName ( "" );
            methods[METHOD_firePropertyChange43] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange43].setDisplayName ( "" );
            methods[METHOD_getActionForKeyStroke44] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getActionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getActionForKeyStroke44].setDisplayName ( "" );
            methods[METHOD_getBaseline45] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline45].setDisplayName ( "" );
            methods[METHOD_getBounds46] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds46].setDisplayName ( "" );
            methods[METHOD_getClientProperty47] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getClientProperty", new Class[] {java.lang.Object.class})); // NOI18N
            methods[METHOD_getClientProperty47].setDisplayName ( "" );
            methods[METHOD_getComponentAt48] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt48].setDisplayName ( "" );
            methods[METHOD_getComponentAt49] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt49].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder50] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder50].setDisplayName ( "" );
            methods[METHOD_getConditionForKeyStroke51] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getConditionForKeyStroke", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_getConditionForKeyStroke51].setDisplayName ( "" );
            methods[METHOD_getDefaultLocale52] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getDefaultLocale", new Class[] {})); // NOI18N
            methods[METHOD_getDefaultLocale52].setDisplayName ( "" );
            methods[METHOD_getFocusTraversalKeys53] = new MethodDescriptor(java.awt.Container.class.getMethod("getFocusTraversalKeys", new Class[] {int.class})); // NOI18N
            methods[METHOD_getFocusTraversalKeys53].setDisplayName ( "" );
            methods[METHOD_getFontMetrics54] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics54].setDisplayName ( "" );
            methods[METHOD_getInsets55] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getInsets", new Class[] {java.awt.Insets.class})); // NOI18N
            methods[METHOD_getInsets55].setDisplayName ( "" );
            methods[METHOD_getListeners56] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners56].setDisplayName ( "" );
            methods[METHOD_getLocation57] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation57].setDisplayName ( "" );
            methods[METHOD_getMousePosition58] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition58].setDisplayName ( "" );
            methods[METHOD_getPopupLocation59] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getPopupLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getPopupLocation59].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners60] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners60].setDisplayName ( "" );
            methods[METHOD_getSize61] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize61].setDisplayName ( "" );
            methods[METHOD_getToolTipLocation62] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipLocation", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipLocation62].setDisplayName ( "" );
            methods[METHOD_getToolTipText63] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("getToolTipText", new Class[] {java.awt.event.MouseEvent.class})); // NOI18N
            methods[METHOD_getToolTipText63].setDisplayName ( "" );
            methods[METHOD_gotFocus64] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus64].setDisplayName ( "" );
            methods[METHOD_grabFocus65] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("grabFocus", new Class[] {})); // NOI18N
            methods[METHOD_grabFocus65].setDisplayName ( "" );
            methods[METHOD_handleEvent66] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent66].setDisplayName ( "" );
            methods[METHOD_hasFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus67].setDisplayName ( "" );
            methods[METHOD_hide68] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide68].setDisplayName ( "" );
            methods[METHOD_imageUpdate69] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate69].setDisplayName ( "" );
            methods[METHOD_initialize70] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("initialize", new Class[] {com.jme3.renderer.RenderManager.class, com.jme3.renderer.ViewPort.class})); // NOI18N
            methods[METHOD_initialize70].setDisplayName ( "" );
            methods[METHOD_insets71] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets71].setDisplayName ( "" );
            methods[METHOD_inside72] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside72].setDisplayName ( "" );
            methods[METHOD_invalidate73] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate73].setDisplayName ( "" );
            methods[METHOD_isAncestorOf74] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf74].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot75] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot75].setDisplayName ( "" );
            methods[METHOD_isLightweightComponent76] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("isLightweightComponent", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isLightweightComponent76].setDisplayName ( "" );
            methods[METHOD_keyDown77] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown77].setDisplayName ( "" );
            methods[METHOD_keyUp78] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp78].setDisplayName ( "" );
            methods[METHOD_layout79] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout79].setDisplayName ( "" );
            methods[METHOD_list80] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list80].setDisplayName ( "" );
            methods[METHOD_list81] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list81].setDisplayName ( "" );
            methods[METHOD_list82] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list82].setDisplayName ( "" );
            methods[METHOD_list83] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list83].setDisplayName ( "" );
            methods[METHOD_list84] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list84].setDisplayName ( "" );
            methods[METHOD_locate85] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate85].setDisplayName ( "" );
            methods[METHOD_location86] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location86].setDisplayName ( "" );
            methods[METHOD_lostFocus87] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus87].setDisplayName ( "" );
            methods[METHOD_minimumSize88] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize88].setDisplayName ( "" );
            methods[METHOD_mouseDown89] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown89].setDisplayName ( "" );
            methods[METHOD_mouseDrag90] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag90].setDisplayName ( "" );
            methods[METHOD_mouseEnter91] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter91].setDisplayName ( "" );
            methods[METHOD_mouseExit92] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit92].setDisplayName ( "" );
            methods[METHOD_mouseMove93] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove93].setDisplayName ( "" );
            methods[METHOD_mouseUp94] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp94].setDisplayName ( "" );
            methods[METHOD_move95] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move95].setDisplayName ( "" );
            methods[METHOD_moveCamera96] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("moveCamera", new Class[] {float.class})); // NOI18N
            methods[METHOD_moveCamera96].setDisplayName ( "" );
            methods[METHOD_nextFocus97] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus97].setDisplayName ( "" );
            methods[METHOD_paint98] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint98].setDisplayName ( "" );
            methods[METHOD_paintAll99] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll99].setDisplayName ( "" );
            methods[METHOD_paintComponent100] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("paintComponent", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponent100].setDisplayName ( "" );
            methods[METHOD_paintComponents101] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents101].setDisplayName ( "" );
            methods[METHOD_paintImmediately102] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_paintImmediately102].setDisplayName ( "" );
            methods[METHOD_paintImmediately103] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("paintImmediately", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_paintImmediately103].setDisplayName ( "" );
            methods[METHOD_panCamera104] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("panCamera", new Class[] {float.class, float.class})); // NOI18N
            methods[METHOD_panCamera104].setDisplayName ( "" );
            methods[METHOD_postEvent105] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent105].setDisplayName ( "" );
            methods[METHOD_postFrame106] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("postFrame", new Class[] {com.jme3.texture.FrameBuffer.class})); // NOI18N
            methods[METHOD_postFrame106].setDisplayName ( "" );
            methods[METHOD_postQueue107] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("postQueue", new Class[] {com.jme3.renderer.queue.RenderQueue.class})); // NOI18N
            methods[METHOD_postQueue107].setDisplayName ( "" );
            methods[METHOD_preferredSize108] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize108].setDisplayName ( "" );
            methods[METHOD_preFrame109] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("preFrame", new Class[] {float.class})); // NOI18N
            methods[METHOD_preFrame109].setDisplayName ( "" );
            methods[METHOD_prepareImage110] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage110].setDisplayName ( "" );
            methods[METHOD_prepareImage111] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage111].setDisplayName ( "" );
            methods[METHOD_print112] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print112].setDisplayName ( "" );
            methods[METHOD_printAll113] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll113].setDisplayName ( "" );
            methods[METHOD_printComponents114] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents114].setDisplayName ( "" );
            methods[METHOD_putClientProperty115] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("putClientProperty", new Class[] {java.lang.Object.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_putClientProperty115].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction116] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, java.lang.String.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction116].setDisplayName ( "" );
            methods[METHOD_registerKeyboardAction117] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("registerKeyboardAction", new Class[] {java.awt.event.ActionListener.class, javax.swing.KeyStroke.class, int.class})); // NOI18N
            methods[METHOD_registerKeyboardAction117].setDisplayName ( "" );
            methods[METHOD_remove118] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove118].setDisplayName ( "" );
            methods[METHOD_remove119] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove119].setDisplayName ( "" );
            methods[METHOD_remove120] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove120].setDisplayName ( "" );
            methods[METHOD_removeAll121] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll121].setDisplayName ( "" );
            methods[METHOD_removeNotify122] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify122].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener123] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener123].setDisplayName ( "" );
            methods[METHOD_repaint124] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint124].setDisplayName ( "" );
            methods[METHOD_repaint125] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint125].setDisplayName ( "" );
            methods[METHOD_repaint126] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint126].setDisplayName ( "" );
            methods[METHOD_repaint127] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint127].setDisplayName ( "" );
            methods[METHOD_repaint128] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("repaint", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_repaint128].setDisplayName ( "" );
            methods[METHOD_requestDefaultFocus129] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestDefaultFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestDefaultFocus129].setDisplayName ( "" );
            methods[METHOD_requestFocus130] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus130].setDisplayName ( "" );
            methods[METHOD_requestFocus131] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocus", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_requestFocus131].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow132] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow132].setDisplayName ( "" );
            methods[METHOD_resetKeyboardActions133] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("resetKeyboardActions", new Class[] {})); // NOI18N
            methods[METHOD_resetKeyboardActions133].setDisplayName ( "" );
            methods[METHOD_reshape134] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape134].setDisplayName ( "" );
            methods[METHOD_reshape135] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("reshape", new Class[] {com.jme3.renderer.ViewPort.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape135].setDisplayName ( "" );
            methods[METHOD_resize136] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize136].setDisplayName ( "" );
            methods[METHOD_resize137] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize137].setDisplayName ( "" );
            methods[METHOD_revalidate138] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate138].setDisplayName ( "" );
            methods[METHOD_rotateCamera139] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("rotateCamera", new Class[] {com.jme3.math.Vector3f.class, float.class})); // NOI18N
            methods[METHOD_rotateCamera139].setDisplayName ( "" );
            methods[METHOD_scrollRectToVisible140] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("scrollRectToVisible", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_scrollRectToVisible140].setDisplayName ( "" );
            methods[METHOD_setBounds141] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds141].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder142] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder142].setDisplayName ( "" );
            methods[METHOD_setDefaultLocale143] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("setDefaultLocale", new Class[] {java.util.Locale.class})); // NOI18N
            methods[METHOD_setDefaultLocale143].setDisplayName ( "" );
            methods[METHOD_show144] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show144].setDisplayName ( "" );
            methods[METHOD_show145] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show145].setDisplayName ( "" );
            methods[METHOD_size146] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size146].setDisplayName ( "" );
            methods[METHOD_startPreview147] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("startPreview", new Class[] {})); // NOI18N
            methods[METHOD_startPreview147].setDisplayName ( "" );
            methods[METHOD_stopPreview148] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("stopPreview", new Class[] {})); // NOI18N
            methods[METHOD_stopPreview148].setDisplayName ( "" );
            methods[METHOD_toString149] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString149].setDisplayName ( "" );
            methods[METHOD_transferFocus150] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus150].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward151] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward151].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle152] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle152].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle153] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle153].setDisplayName ( "" );
            methods[METHOD_unregisterKeyboardAction154] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("unregisterKeyboardAction", new Class[] {javax.swing.KeyStroke.class})); // NOI18N
            methods[METHOD_unregisterKeyboardAction154].setDisplayName ( "" );
            methods[METHOD_update155] = new MethodDescriptor(javax.swing.JComponent.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update155].setDisplayName ( "" );
            methods[METHOD_updateUI156] = new MethodDescriptor(javax.swing.JPanel.class.getMethod("updateUI", new Class[] {})); // NOI18N
            methods[METHOD_updateUI156].setDisplayName ( "" );
            methods[METHOD_validate157] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate157].setDisplayName ( "" );
            methods[METHOD_zoomCamera158] = new MethodDescriptor(com.jme3.gde.core.scene.OffScenePanel.class.getMethod("zoomCamera", new Class[] {float.class})); // NOI18N
            methods[METHOD_zoomCamera158].setDisplayName ( "" );
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
