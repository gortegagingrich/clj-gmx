(ns clj_gmx.gmx)

(def room-start
	"<room>
    <caption/>
    <width>800</width>
    <height>608</height>
    <vsnap>16</vsnap>
    <hsnap>16</hsnap>
    <isometric>0</isometric>
    <speed>50</speed>
    <persistent>0</persistent>
    <colour>16515056</colour>
    <showcolour>-1</showcolour>
    <code/>
    <enableViews>-1</enableViews>
    <clearViewBackground>-1</clearViewBackground>
    <clearDisplayBuffer>-1</clearDisplayBuffer>
    <makerSettings>
        <isSet>0</isSet>
        <w>0</w>
        <h>0</h>
        <showGrid>0</showGrid>
        <showObjects>0</showObjects>
        <showTiles>0</showTiles>
        <showBackgrounds>0</showBackgrounds>
        <showForegrounds>0</showForegrounds>
        <showViews>0</showViews>
        <deleteUnderlyingObj>0</deleteUnderlyingObj>
        <deleteUnderlyingTiles>0</deleteUnderlyingTiles>
        <page>0</page>
        <xoffset>0</xoffset>
        <yoffset>0</yoffset>
    </makerSettings>
    <backgrounds>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
        <background visible=\"0\" foreground=\"0\" name=\"\" x=\"0\" y=\"0\" htiled=\"-1\" vtiled=\"-1\" hspeed=\"0\" vspeed=\"0\" stretch=\"0\"/>
    </backgrounds>
    <views>
        <view visible=\"-1\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"800\" hview=\"608\" xport=\"0\" yport=\"0\" wport=\"800\" hport=\"608\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
        <view visible=\"0\" objName=\"&lt;undefined&gt;\" xview=\"0\" yview=\"0\" wview=\"640\" hview=\"480\" xport=\"0\" yport=\"0\" wport=\"640\" hport=\"480\" hborder=\"32\" vborder=\"32\" hspeed=\"-1\" vspeed=\"-1\"/>
    </views>
    <instances>")

(def room-end
	"
    </instances>
    <tiles/>
    <PhysicsWorld>0</PhysicsWorld>
    <PhysicsWorldTop>0</PhysicsWorldTop>
    <PhysicsWorldLeft>0</PhysicsWorldLeft>
    <PhysicsWorldRight>1024</PhysicsWorldRight>
    <PhysicsWorldBottom>768</PhysicsWorldBottom>
    <PhysicsWorldGravityX>0</PhysicsWorldGravityX>
    <PhysicsWorldGravityY>10</PhysicsWorldGravityY>
    <PhysicsWorldPixToMeters>0.100000001490116</PhysicsWorldPixToMeters>
</room>")

(def instance-format 
	"
        <instance objName=\"%s\" x=\"%d\" y=\"%d\" name=\"inst_%s\" locked=\"0\" code=\"\" scaleX=\"1\" scaleY=\"1\" colour=\"4294967295\" rotation=\"0\"/>")


(defn obj-name [x] 
  (case x
    "1" "objBlock"
    "2" "objMiniBlock"
    "3" "objSpikeUp"
    "4" "objSpikeRight"
    "5" "objSpikeLeft"
    "6" "objSPikeDown"
    "7" "objMiniUp"
    "8" "objMiniRight"
    "9" "objMiniLeft"
    "10" "objMiniDown"
    "12" "objSave"
    "13" "objMovingPlatform"
    "15" "objWater2"
    "20" "objPlayerStart"
    "21" "objWarpAutosaveNext"
    "default"))
