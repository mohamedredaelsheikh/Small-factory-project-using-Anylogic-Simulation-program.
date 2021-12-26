package small_factory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.processmodeling.*;

import java.awt.geom.Arc2D;

 

public class Person extends Agent
        implements IResourceUnit
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Person.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 21.0 );

  @Override
  public Scale getScale() {
    return scale;
  }



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForCodeCompletion_xjal(){
    {double _t = 
0 
;}
    {double _t = 
1 
;}
    class _Stub_Implements_xjal implements 
  {}
    class _Stub_Extends_xjal extends 
  {}
  }

  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 4.975, -1.658, -3.317, -3.317, -3.317, 0.0, -1.658, 0.0, 1.658, 4.975, 6.634, 8.292, 6.634, 9.951, 9.951, 9.951, 8.292, 1.658, 6.634, 6.634, 6.634, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 7.112, 3.556, 5.334, 5.334, 17.78, 19.557, 19.557, 16.002, 30.225, 30.225, 30.225, 30.225, 16.002, 19.557, 19.557, 17.78, 5.334, 5.334, 3.556, 7.112, 0.0, -5.334, -5.334,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _shapeBody:
        if (true) {
          ShapeCurve self = this.shapeBody;
          
 
        }
        break;
      case _person:
        if (true) {
          ShapeGroup self = this.person;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onShapeGroupDraw( int _shape, int index ) {
    switch( _shape ) {
      case _person:
          
 
        break;
      default:
        super.onShapeGroupDraw( _shape, index );
        break;
    }
  }
  
  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _shapeBody_SetDynamicParams_xjal( ShapeCurve shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setZHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotation(
 
);
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
    shape.setNPoints(
 
);
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDx( indexPt, 
 
);
     }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDy( indexPt, 
 
);
    }
    for (int indexPt = 0; indexPt < shape.getNPoints(); indexPt++) {
      shape.setPointDz( indexPt, 
 
);
    }
 	}
  }
  
  protected ShapeCurve shapeBody;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _person_SetDynamicParams_xjal( ShapeGroup shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setZ(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setScaleZ(
 
);
    shape.setRotationY(
 
);
    shape.setRotationX(
 
);
    shape.setRotationZ(
 
);
 	}
  }
  
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
      true,-3.317, -12.446, 
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    ) {
      @Override
      public void updateDynamicProperties() {
        _shapeBody_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    person = new ShapeGroup( Person.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBody ) {
      @Override
      public void updateDynamicProperties() {
        _person_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void onDraw() {
        onShapeGroupDraw( _person, 0 );
      }
    };

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onArrival() {
    super.onArrival();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onStep() {
    super.onStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onEnterFlowchartBlock(Agent oldBlock, Agent block) {
    super.onEnterFlowchartBlock( oldBlock, block );
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onExitFlowchartBlock(Agent block) {
    super.onExitFlowchartBlock(block);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onSeizeResource(Agent unit) {
    super.onSeizeResource(unit);
    
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void onReleaseResource(Agent unit) {
    super.onReleaseResource(unit);
    
 
  }

  /**
   * Constructor
   */
  public Person( Engine engine, Agent owner, AgentList<? extends Person> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Person() {
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_Person_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Person.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Person.this, getElementProperty( "small_factory.Person.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Person.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupExt_xjal(AgentExtension _ext) {
    // Agent properties setup
    if ( _ext instanceof ExtAgentWithSpatialMetrics && _ext instanceof ExtWithSpaceType && !(tryExt(ExtAgentWithSpatialMetrics.class) instanceof ExtWithSpaceType) ) {
      double _speed;
      _speed = 
10 
;
      ((ExtAgentWithSpatialMetrics) _ext).setSpeed( _speed, MPS );
    }
    if ( _ext instanceof ExtEntity && tryExt(ExtEntity.class) == null ) {
      ExtEntity _e = (ExtEntity) _ext;
      double _length;
      _length = 
1 
;
	  _e.setLength( _length, METER );
	  double _width;
      _width = 
1 
;
	  _e.setWidth( _width, METER );
	  double _height;
      _height = 
1 
;
	  _e.setHeight( _height, METER );
    }
    if ( _ext instanceof ExtAgentWithSpatialMetrics && tryExt(ExtAgentWithSpatialMetrics.class) == null ) {
      ExtAgentWithSpatialMetrics _e = (ExtAgentWithSpatialMetrics) _ext;
      _e.setAutomaticHorizontalRotation( true );
    }
    if ( _ext instanceof ExtAgentContinuous && tryExt(ExtAgentContinuous.class) == null ) {
      ExtAgentContinuous _e = (ExtAgentContinuous) _ext;
      _e.setAutomaticVerticalRotation( false );
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Person_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Person_xjal() {
  }

  // User API -----------------------------------------------------
  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    
Object  msg = (Object) _msg_xjal;
    Agent sender = _sender_xjal;
    
 
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Person> getPopulation() {
    return (AgentList<? extends Person>) super.getPopulation();
  }

  public List<? extends Person> agentsInRange( double distance ) {
    return (List<? extends Person>) super.agentsInRange( distance );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    // On destroy code
    
 
    super.onDestroy();
  }

  // Additional class code

 
  // End of additional class code

  public com.anylogic.libraries.processmodeling.ResourcePool resourcePool() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).resourcePool();
  }

  public com.anylogic.libraries.processmodeling.ResourceType getResourceType() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getResourceType();
  }

  public boolean isBusy() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isBusy();
  }

  public boolean isIdle() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isIdle();
  }

  public double getUtilization() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getUtilization();
  }

  public double timeInState(com.anylogic.libraries.processmodeling.ResourceUsageState state) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).timeInState(state);
  }

  public double timeInState(com.anylogic.libraries.processmodeling.ResourceUsageState state, TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).timeInState(state, units);
  }

  public void resetStats() {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).resetStats();
  }

  public boolean isReserved() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isReserved();
  }

  public Agent getReservedBy() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getReservedBy();
  }

  public Agent getServicedEntity() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getServicedEntity();
  }

  public com.anylogic.libraries.processmodeling.ResourceTaskType currentTaskType() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).currentTaskType();
  }

  public com.anylogic.libraries.processmodeling.ResourceUnitTask currentTask() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).currentTask();
  }

  @AnyLogicInternalAPI
  public void addTask(com.anylogic.libraries.processmodeling.ResourceUnitTask task) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).addTask(task);
  }

  @AnyLogicInternalAPI
  public void removeTask(com.anylogic.libraries.processmodeling.ResourceUnitTask task) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).removeTask(task);
  }

  public void setHomeLocation(INode home) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomeLocation(home);
  }

  public INode getHomeLocation() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeLocation();
  }

  public void setHomePosition(double x, double y) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomePosition(x, y);
  }

  public void setHomePosition(double x, double y, double z) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setHomePosition(x, y, z);
  }

  public double getHomeX() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeX();
  }

  public double getHomeY() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeY();
  }

  public double getHomeZ() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeZ();
  }

  public double getHomeRotation() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).getHomeRotation();
  }

  public void setAttached(boolean attached) {
    ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).setAttached(attached);
  }

  public boolean isAttached() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).isAttached();
  }
  
  public double totalDowntime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalDowntime();
  }

  public double totalRepairTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalRepairTime();
  }
	
  public double totalMaintenanceTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalMaintenanceTime();
  }

  public double totalBreaksTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalBreaksTime();
  }

  public double totalCustomTasksTime() {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalCustomTasksTime();
  }

  public double totalDowntime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalDowntime(units);
  }

  public double totalRepairTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalRepairTime(units);
  }

  public double totalMaintenanceTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalMaintenanceTime(units);
  }

  public double totalBreaksTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalBreaksTime(units);
  }

  public double totalCustomTasksTime(TimeUnits units) {
    return ext(com.anylogic.libraries.processmodeling.ResourceUnitExtension.class).totalCustomTasksTime(units);
  }
  
}
