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

 

public class Main extends Agent
{
  // Parameters
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.6 );

  @Override
  public Scale getScale() {
    return scale;
  }


  // Events
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _plot_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _chart_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _plot_autoUpdateEvent_xjal ) return "plot auto update event";
     if( _e == _chart_autoUpdateEvent_xjal ) return "chart auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _chart_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _plot_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    if( _e == _chart_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, MINUTE );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _plot_autoUpdateEvent_xjal ) {
      plot.updateData();
      return;
    }
    if ( _e == _chart_autoUpdateEvent_xjal ) {
      chart.updateData();
      return;
    }
    super.executeActionOf( _e );
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

  // Embedded Objects

 
  public com.anylogic.libraries.processmodeling.Source<
Body 
> sourceBodies;
 
  public com.anylogic.libraries.processmodeling.Queue<
Body 
> queueBodies;
 
  public com.anylogic.libraries.processmodeling.Conveyor<
Body 
> conveyorBodies;
 
  public com.anylogic.libraries.processmodeling.Sink<
Batch 
> sinkBodies;
 
  public com.anylogic.libraries.processmodeling.Source<
Door 
> sourcedoors;
 
  public com.anylogic.libraries.processmodeling.Queue<
Door 
> queuedoors;
 
  public com.anylogic.libraries.processmodeling.Assembler<
Assembly 
, 
Body 
, 
Door 
, 
Agent 
, 
Agent 
, 
Agent 
> assembler;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Agent 
> resourceAssembler;
 
  public com.anylogic.libraries.processmodeling.Queue<
Assembly 
> qAssembly;
 
  public com.anylogic.libraries.processmodeling.Conveyor<
Assembly 
> conveyorAssembly;
 
  public com.anylogic.libraries.processmodeling.Assembler<
Package 
, 
Assembly 
, 
Agent 
, 
Agent 
, 
Agent 
, 
Agent 
> Packaging;
 
  public com.anylogic.libraries.processmodeling.ResourcePool<
Person 
> resourceWorkers;
 
  public com.anylogic.libraries.processmodeling.Batch<
Package 
, 
Batch 
> Loading;
 
  public com.anylogic.libraries.processmodeling.Delay<
Batch 
> delay;

  public String getNameOf( Agent ao ) {
    if ( ao == sourceBodies ) return "sourceBodies";
    if ( ao == queueBodies ) return "queueBodies";
    if ( ao == conveyorBodies ) return "conveyorBodies";
    if ( ao == sinkBodies ) return "sinkBodies";
    if ( ao == sourcedoors ) return "sourcedoors";
    if ( ao == queuedoors ) return "queuedoors";
    if ( ao == assembler ) return "assembler";
    if ( ao == resourceAssembler ) return "resourceAssembler";
    if ( ao == qAssembly ) return "qAssembly";
    if ( ao == conveyorAssembly ) return "conveyorAssembly";
    if ( ao == Packaging ) return "Packaging";
    if ( ao == resourceWorkers ) return "resourceWorkers";
    if ( ao == Loading ) return "Loading";
    if ( ao == delay ) return "delay";
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }


  public String getNameOf( AgentList<?> aolist ) {
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    return super.getAnimationSettingsOf( aolist );
  }


  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Source<Body> instantiate_sourceBodies_xjal() {
    com.anylogic.libraries.processmodeling.Source<Body> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Body>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _sourceBodies_interarrivalTime_xjal( this );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_interarrivalTime() {
        return MINUTE;
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _sourceBodies_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _sourceBodies_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _sourceBodies_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Body agent ) {
        return _sourceBodies_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Body agent ) {
        return _sourceBodies_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Body agent ) {
        return _sourceBodies_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Body agent ) {
        return _sourceBodies_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Body agent ) {
        return _sourceBodies_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Body agent ) {
        return _sourceBodies_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Body agent ) {
        return _sourceBodies_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Body agent ) {
        return _sourceBodies_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Body agent ) {
        return _sourceBodies_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Body agent ) {
        return _sourceBodies_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Body agent ) {
        return _sourceBodies_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _sourceBodies_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Body agent ) {
        return _sourceBodies_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Body agent ) {
        return _sourceBodies_length_xjal( this, agent );
      }
      @Override
      public double width( Body agent ) {
        return _sourceBodies_width_xjal( this, agent );
      }
      @Override
      public double height( Body agent ) {
        return _sourceBodies_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Body agent ) {
        return _sourceBodies_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _sourceBodies_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Body agent ) {
        _sourceBodies_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Body agent ) {
        _sourceBodies_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Body agent ) {
        _sourceBodies_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sourceBodies_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, TableInput _t ) {
    self.arrivalType = 
self.INTERARRIVAL_TIME 
;
    self.rate = 
1 
;
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
true 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourceBodies_xjal( com.anylogic.libraries.processmodeling.Source<Body> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Body> instantiate_queueBodies_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Body> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Body>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Body agent ) {
        return _queueBodies_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Body agent1, Body agent2 ) {
        return _queueBodies_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Body agent ) {
        return _queueBodies_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Body agent ) {
        _queueBodies_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Body agent ) {
        _queueBodies_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Body agent ) {
        _queueBodies_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Body agent ) {
        _queueBodies_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Body agent ) {
        _queueBodies_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Body agent ) {
        _queueBodies_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queueBodies_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, TableInput _t ) {
    self.capacity = 
100 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
spaceBodiesstorage 
;
    self.queuing = 
self.QUEUING_FIFO 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_queueBodies_xjal( com.anylogic.libraries.processmodeling.Queue<Body> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Conveyor<Body> instantiate_conveyorBodies_xjal() {
    com.anylogic.libraries.processmodeling.Conveyor<Body> _result_xjal = new com.anylogic.libraries.processmodeling.Conveyor<Body>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_length() {
        return METER;
      }
      @Override
      public double entityLength( Body agent ) {
        return _conveyorBodies_entityLength_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_entityLength() {
        return METER;
      }
      @Override
      public void onEnter( Body agent ) {
        _conveyorBodies_onEnter_xjal( this, agent );
      }
      @Override
      public void onFullEnter( Body agent ) {
        _conveyorBodies_onFullEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Body agent ) {
        _conveyorBodies_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Body agent ) {
        _conveyorBodies_onExit_xjal( this, agent );
      }
      @Override
      public void onFullExit( Body agent ) {
        _conveyorBodies_onFullExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Body agent ) {
        _conveyorBodies_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_conveyorBodies_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, TableInput _t ) {
    self.lengthDefinedByPath = 
true 
;
    self.length = 
20 
;
    self.speed = 
1 
;
    self.accumulating = 
true 
;
    self.entityLocation = 
spaceBodiesconvery 
;
    self.grabBehaviour = 
self.GRAB_SMOOTHLY 
;
    self.changeLengthOfEntity = 
true 
;
    self.restoreEntityLocationOnExit = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_conveyorBodies_xjal( com.anylogic.libraries.processmodeling.Conveyor<Body> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Sink<Batch> instantiate_sinkBodies_xjal() {
    com.anylogic.libraries.processmodeling.Sink<Batch> _result_xjal = new com.anylogic.libraries.processmodeling.Sink<Batch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public void onEnter( Batch agent ) {
        _sinkBodies_onEnter_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sinkBodies_xjal( final com.anylogic.libraries.processmodeling.Sink<Batch> self, TableInput _t ) {
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sinkBodies_xjal( com.anylogic.libraries.processmodeling.Sink<Batch> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Source<Door> instantiate_sourcedoors_xjal() {
    com.anylogic.libraries.processmodeling.Source<Door> _result_xjal = new com.anylogic.libraries.processmodeling.Source<Door>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double interarrivalTime(  ) {
        return _sourcedoors_interarrivalTime_xjal( this );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_interarrivalTime() {
        return MINUTE;
      }
      @Override
      public double rateExpression( double baseRate ) {
        return _sourcedoors_rateExpression_xjal( this, baseRate );
      }
      @Override
      public Date arrivalDate(  ) {
        return _sourcedoors_arrivalDate_xjal( this );
      }
      @Override
      public int entitiesPerArrival(  ) {
        return _sourcedoors_entitiesPerArrival_xjal( this );
      }
      @Override
      public double locationX( Door agent ) {
        return _sourcedoors_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Door agent ) {
        return _sourcedoors_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Door agent ) {
        return _sourcedoors_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Door agent ) {
        return _sourcedoors_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Door agent ) {
        return _sourcedoors_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Door agent ) {
        return _sourcedoors_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Door agent ) {
        return _sourcedoors_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Door agent ) {
        return _sourcedoors_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Door agent ) {
        return _sourcedoors_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Door agent ) {
        return _sourcedoors_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Door agent ) {
        return _sourcedoors_speed_xjal( this, agent );
      }
      @Override
      public Agent newEntity(  ) {
        return _sourcedoors_newEntity_xjal( this );
      }
      @Override
      public boolean changeDimensions( Door agent ) {
        return _sourcedoors_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Door agent ) {
        return _sourcedoors_length_xjal( this, agent );
      }
      @Override
      public double width( Door agent ) {
        return _sourcedoors_width_xjal( this, agent );
      }
      @Override
      public double height( Door agent ) {
        return _sourcedoors_height_xjal( this, agent );
      }
      @Override
      public AgentList population( Door agent ) {
        return _sourcedoors_population_xjal( this, agent );
      }
      @Override
      public void onBeforeArrival(  ) {
        _sourcedoors_onBeforeArrival_xjal( this );
      }
      @Override
      public void onAtExit( Door agent ) {
        _sourcedoors_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Door agent ) {
        _sourcedoors_onExit_xjal( this, agent );
      }
      @Override
      public void onDiscard( Door agent ) {
        _sourcedoors_onDiscard_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sourcedoors_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, TableInput _t ) {
    self.arrivalType = 
self.INTERARRIVAL_TIME 
;
    self.rate = 
1 
;
    self.firstArrivalMode = 
self.AFTER_TIMEOUT 
;
    self.firstArrivalTime = 
 
;
    self.rateSchedule = 
 
;
    self.modifyRate = 
false 
;
    self.arrivalSchedule = 
 
;
    self.setAgentParametersFromDB = 
false 
;
    self.databaseTable = 
 
;
    self.multipleEntitiesPerArrival = 
false 
;
    self.limitArrivals = 
false 
;
    self.maxArrivals = 
1000 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.enableCustomStartTime = 
false 
;
    self.startTime = 
 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
true 
;
    self.discardHangingEntities = 
true 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sourcedoors_xjal( com.anylogic.libraries.processmodeling.Source<Door> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Door> instantiate_queuedoors_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Door> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Door>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Door agent ) {
        return _queuedoors_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Door agent1, Door agent2 ) {
        return _queuedoors_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Door agent ) {
        return _queuedoors_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Door agent ) {
        _queuedoors_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Door agent ) {
        _queuedoors_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Door agent ) {
        _queuedoors_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Door agent ) {
        _queuedoors_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Door agent ) {
        _queuedoors_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Door agent ) {
        _queuedoors_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_queuedoors_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, TableInput _t ) {
    self.capacity = 
100 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
spacedoorstorage 
;
    self.queuing = 
self.QUEUING_FIFO 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_queuedoors_xjal( com.anylogic.libraries.processmodeling.Queue<Door> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> instantiate_assembler_xjal() {
    com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Agent newEntity( Queue< Body > queue1, Queue< Door > queue2, Queue< Agent > queue3, Queue< Agent > queue4, Queue< Agent > queue5 ) {
        return _assembler_newEntity_xjal( this, queue1, queue2, queue3, queue4, queue5 );
      }
      @Override
      public boolean changeDimensions( Assembly agent ) {
        return _assembler_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Assembly agent ) {
        return _assembler_length_xjal( this, agent );
      }
      @Override
      public double width( Assembly agent ) {
        return _assembler_width_xjal( this, agent );
      }
      @Override
      public double height( Assembly agent ) {
        return _assembler_height_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Assembly agent ) {
        return _assembler_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Assembly agent ) {
        return _assembler_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Assembly agent ) {
        return _assembler_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Assembly agent ) {
        return _assembler_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public double locationX( Assembly agent ) {
        return _assembler_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Assembly agent ) {
        return _assembler_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Assembly agent ) {
        return _assembler_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Assembly agent ) {
        return _assembler_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Assembly agent ) {
        return _assembler_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Assembly agent ) {
        return _assembler_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Assembly agent ) {
        return _assembler_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Assembly agent ) {
        return _assembler_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Assembly agent ) {
        return _assembler_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Assembly agent ) {
        return _assembler_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Assembly agent ) {
        return _assembler_speed_xjal( this, agent );
      }
      @Override
      public double priority( Assembly agent ) {
        return _assembler_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Assembly agent ) {
        return _assembler_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.TaskPreemptionPolicy taskPreemptionPolicy( Assembly agent ) {
        return _assembler_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Assembly agent, Agent unit ) {
        return _assembler_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Assembly agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _assembler_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Assembly agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _assembler_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Assembly agent ) {
        return _assembler_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Assembly agent ) {
        return _assembler_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public AgentList population( Assembly agent ) {
        return _assembler_population_xjal( this, agent );
      }
      @Override
      public void onEnter1( Body agent ) {
        _assembler_onEnter1_xjal( this, agent );
      }
      @Override
      public void onEnter2( Door agent ) {
        _assembler_onEnter2_xjal( this, agent );
      }
      @Override
      public void onEnter3( Agent agent ) {
        _assembler_onEnter3_xjal( this, agent );
      }
      @Override
      public void onEnter4( Agent agent ) {
        _assembler_onEnter4_xjal( this, agent );
      }
      @Override
      public void onEnter5( Agent agent ) {
        _assembler_onEnter5_xjal( this, agent );
      }
      @Override
      public void onEnterDelay( Assembly agent, double delayTime ) {
        _assembler_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Assembly agent ) {
        _assembler_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Assembly agent ) {
        _assembler_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Assembly agent, Agent unit ) {
        _assembler_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Assembly agent, Agent unit ) {
        _assembler_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Assembly agent, Agent unit ) {
        _assembler_onTaskResumed_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_assembler_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, TableInput _t ) {
    self.quantity1 = 
1 
;
    self.quantity2 = 
1 
;
    self.quantity3 = 
0 
;
    self.quantity4 = 
0 
;
    self.quantity5 = 
0 
;
    self.seizeFromOnePool = 
false 
;
    self.outputBufferCapacity = 
0 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.entityLocationDelay = 
spaceassembly 
;
    self.entityLocationQueue1 = 
spaceBodiesAwitingassembly 
;
    self.entityLocationQueue2 = 
spacedoorwaitingassembly 
;
    self.entityLocationQueue3 = 
 
;
    self.entityLocationQueue4 = 
 
;
    self.entityLocationQueue5 = 
 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_assembler_xjal( com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Agent> instantiate_resourceAssembler_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Agent> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _resourceAssembler_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _resourceAssembler_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Agent unit ) {
        return _resourceAssembler_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Agent unit ) {
        return _resourceAssembler_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Agent unit ) {
        return _resourceAssembler_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Agent unit ) {
        return _resourceAssembler_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Agent unit ) {
        return _resourceAssembler_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Agent unit ) {
        return _resourceAssembler_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Agent unit ) {
        return _resourceAssembler_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Agent unit ) {
        return _resourceAssembler_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Agent unit ) {
        return _resourceAssembler_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Agent unit ) {
        return _resourceAssembler_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Agent unit ) {
        return _resourceAssembler_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Agent unit ) {
        return _resourceAssembler_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Agent unit ) {
        return _resourceAssembler_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Agent unit ) {
        return _resourceAssembler_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Agent unit ) {
        return _resourceAssembler_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Agent unit ) {
        return _resourceAssembler_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Agent unit ) {
        return _resourceAssembler_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Agent unit ) {
        return _resourceAssembler_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Agent unit ) {
        return _resourceAssembler_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Agent unit, Agent agent ) {
        return _resourceAssembler_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Agent unit ) {
        return _resourceAssembler_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Agent unit ) {
        _resourceAssembler_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Agent unit ) {
        _resourceAssembler_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Agent unit, Agent agent ) {
        _resourceAssembler_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Agent unit, Agent agent ) {
        _resourceAssembler_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Agent unit, Agent agent ) {
        _resourceAssembler_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _resourceAssembler_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Agent unit ) {
        _resourceAssembler_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Agent unit ) {
        _resourceAssembler_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Agent unit ) {
        _resourceAssembler_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Agent unit ) {
        _resourceAssembler_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Agent unit ) {
        _resourceAssembler_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Agent unit ) {
        _resourceAssembler_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Agent unit ) {
        _resourceAssembler_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_resourceAssembler_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
    self.type = 
self.RESOURCE_STATIC 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
8 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = 
{} 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_resourceAssembler_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Queue<Assembly> instantiate_qAssembly_xjal() {
    com.anylogic.libraries.processmodeling.Queue<Assembly> _result_xjal = new com.anylogic.libraries.processmodeling.Queue<Assembly>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double priority( Assembly agent ) {
        return _qAssembly_priority_xjal( this, agent );
      }
      @Override
      public boolean comparison( Assembly agent1, Assembly agent2 ) {
        return _qAssembly_comparison_xjal( this, agent1, agent2 );
      }
      @Override
      public double timeout( Assembly agent ) {
        return _qAssembly_timeout_xjal( this, agent );
      }
      @Override
      public void onEnter( Assembly agent ) {
        _qAssembly_onEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Assembly agent ) {
        _qAssembly_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Assembly agent ) {
        _qAssembly_onExit_xjal( this, agent );
      }
      @Override
      public void onExitTimeout( Assembly agent ) {
        _qAssembly_onExitTimeout_xjal( this, agent );
      }
      @Override
      public void onExitPreempted( Assembly agent ) {
        _qAssembly_onExitPreempted_xjal( this, agent );
      }
      @Override
      public void onRemove( Assembly agent ) {
        _qAssembly_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_qAssembly_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, TableInput _t ) {
    self.capacity = 
100 
;
    self.maximumCapacity = 
false 
;
    self.entityLocation = 
 
;
    self.queuing = 
self.QUEUING_FIFO 
;
    self.enableTimeout = 
false 
;
    self.enablePreemption = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_qAssembly_xjal( com.anylogic.libraries.processmodeling.Queue<Assembly> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Conveyor<Assembly> instantiate_conveyorAssembly_xjal() {
    com.anylogic.libraries.processmodeling.Conveyor<Assembly> _result_xjal = new com.anylogic.libraries.processmodeling.Conveyor<Assembly>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double entityLength( Assembly agent ) {
        return _conveyorAssembly_entityLength_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public LengthUnits getUnitsForCodeOf_entityLength() {
        return METER;
      }
      @Override
      public void onEnter( Assembly agent ) {
        _conveyorAssembly_onEnter_xjal( this, agent );
      }
      @Override
      public void onFullEnter( Assembly agent ) {
        _conveyorAssembly_onFullEnter_xjal( this, agent );
      }
      @Override
      public void onAtExit( Assembly agent ) {
        _conveyorAssembly_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Assembly agent ) {
        _conveyorAssembly_onExit_xjal( this, agent );
      }
      @Override
      public void onFullExit( Assembly agent ) {
        _conveyorAssembly_onFullExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Assembly agent ) {
        _conveyorAssembly_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_conveyorAssembly_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, TableInput _t ) {
    self.lengthDefinedByPath = 
true 
;
    self.length = 
10 
;
    self.speed = 
1 
;
    self.accumulating = 
true 
;
    self.entityLocation = 
spConveyorAssembly 
;
    self.grabBehaviour = 
self.GRAB_SMOOTHLY 
;
    self.changeLengthOfEntity = 
false 
;
    self.restoreEntityLocationOnExit = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_conveyorAssembly_xjal( com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> instantiate_Packaging_xjal() {
    com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> _result_xjal = new com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Agent newEntity( Queue< Assembly > queue1, Queue< Agent > queue2, Queue< Agent > queue3, Queue< Agent > queue4, Queue< Agent > queue5 ) {
        return _Packaging_newEntity_xjal( this, queue1, queue2, queue3, queue4, queue5 );
      }
      @Override
      public boolean changeDimensions( Package agent ) {
        return _Packaging_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Package agent ) {
        return _Packaging_length_xjal( this, agent );
      }
      @Override
      public double width( Package agent ) {
        return _Packaging_width_xjal( this, agent );
      }
      @Override
      public double height( Package agent ) {
        return _Packaging_height_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool[][] resourceSets( Package agent ) {
        return _Packaging_resourceSets_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePool resourcePool( Package agent ) {
        return _Packaging_resourcePool_xjal( this, agent );
      }
      @Override
      public int resourceQuantity( Package agent ) {
        return _Packaging_resourceQuantity_xjal( this, agent );
      }
      @Override
      public double delayTime( Package agent ) {
        return _Packaging_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public double locationX( Package agent ) {
        return _Packaging_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Package agent ) {
        return _Packaging_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Package agent ) {
        return _Packaging_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Package agent ) {
        return _Packaging_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Package agent ) {
        return _Packaging_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Package agent ) {
        return _Packaging_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Package agent ) {
        return _Packaging_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Package agent ) {
        return _Packaging_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Package agent ) {
        return _Packaging_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Package agent ) {
        return _Packaging_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Package agent ) {
        return _Packaging_speed_xjal( this, agent );
      }
      @Override
      public double priority( Package agent ) {
        return _Packaging_priority_xjal( this, agent );
      }
      @Override
      public boolean taskMayPreemptOtherTasks( Package agent ) {
        return _Packaging_taskMayPreemptOtherTasks_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.TaskPreemptionPolicy taskPreemptionPolicy( Package agent ) {
        return _Packaging_taskPreemptionPolicy_xjal( this, agent );
      }
      @Override
      public com.anylogic.libraries.processmodeling.Enter terminatedTasksEnter( Package agent, Agent unit ) {
        return _Packaging_terminatedTasksEnter_xjal( this, agent, unit );
      }
      @Override
      public boolean resourceChoiceCondition( Package agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Packaging_resourceChoiceCondition_xjal( this, agent, unit, pool );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceSelectionMode resourceSelectionMode( Package agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
        return _Packaging_resourceSelectionMode_xjal( this, agent, pool );
      }
      @Override
      public double resourceRating( Agent unit, Package agent ) {
        return _Packaging_resourceRating_xjal( this, unit, agent );
      }
      @Override
      public boolean resourceComparison( Agent unit1, Agent unit2, Package agent ) {
        return _Packaging_resourceComparison_xjal( this, unit1, unit2, agent );
      }
      @Override
      public AgentList population( Package agent ) {
        return _Packaging_population_xjal( this, agent );
      }
      @Override
      public void onEnter1( Assembly agent ) {
        _Packaging_onEnter1_xjal( this, agent );
      }
      @Override
      public void onEnter2( Agent agent ) {
        _Packaging_onEnter2_xjal( this, agent );
      }
      @Override
      public void onEnter3( Agent agent ) {
        _Packaging_onEnter3_xjal( this, agent );
      }
      @Override
      public void onEnter4( Agent agent ) {
        _Packaging_onEnter4_xjal( this, agent );
      }
      @Override
      public void onEnter5( Agent agent ) {
        _Packaging_onEnter5_xjal( this, agent );
      }
      @Override
      public void onEnterDelay( Package agent, double delayTime ) {
        _Packaging_onEnterDelay_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Package agent ) {
        _Packaging_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Package agent ) {
        _Packaging_onExit_xjal( this, agent );
      }
      @Override
      public void onTaskTerminated( Package agent, Agent unit ) {
        _Packaging_onTaskTerminated_xjal( this, agent, unit );
      }
      @Override
      public void onTaskSuspended( Package agent, Agent unit ) {
        _Packaging_onTaskSuspended_xjal( this, agent, unit );
      }
      @Override
      public void onTaskResumed( Package agent, Agent unit ) {
        _Packaging_onTaskResumed_xjal( this, agent, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Packaging_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, TableInput _t ) {
    self.quantity1 = 
1 
;
    self.quantity2 = 
0 
;
    self.quantity3 = 
0 
;
    self.quantity4 = 
0 
;
    self.quantity5 = 
0 
;
    self.seizeFromOnePool = 
false 
;
    self.outputBufferCapacity = 
0 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.entityLocationDelay = 
spPackaging 
;
    self.entityLocationQueue1 = 
spWaitingPackaging 
;
    self.entityLocationQueue2 = 
 
;
    self.entityLocationQueue3 = 
 
;
    self.entityLocationQueue4 = 
 
;
    self.entityLocationQueue5 = 
 
;
    self.suspendResumeEntities = 
true 
;
    self.customizeResourceChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Packaging_xjal( com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.ResourcePool<Person> instantiate_resourceWorkers_xjal() {
    com.anylogic.libraries.processmodeling.ResourcePool<Person> _result_xjal = new com.anylogic.libraries.processmodeling.ResourcePool<Person>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public int capacityOnValue(  ) {
        return _resourceWorkers_capacityOnValue_xjal( this );
      }
      @Override
      public Agent newUnit(  ) {
        return _resourceWorkers_newUnit_xjal( this );
      }
      @Override
      public double initialTimeToMaintenance( Person unit ) {
        return _resourceWorkers_initialTimeToMaintenance_xjal( this, unit );
      }
      @Override
      public double timeBetweenMaintenances( Person unit ) {
        return _resourceWorkers_timeBetweenMaintenances_xjal( this, unit );
      }
      @Override
      public double maintenanceTaskPriority( Person unit ) {
        return _resourceWorkers_maintenanceTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean maintenanceTaskMayPreemptOtherTasks( Person unit ) {
        return _resourceWorkers_maintenanceTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public double maintenanceTime( Person unit ) {
        return _resourceWorkers_maintenanceTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart maintenanceTaskStart( Person unit ) {
        return _resourceWorkers_maintenanceTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState maintenanceUsageState( Person unit ) {
        return _resourceWorkers_maintenanceUsageState_xjal( this, unit );
      }
      @Override
      public double initialTimeToFailure( Person unit ) {
        return _resourceWorkers_initialTimeToFailure_xjal( this, unit );
      }
      @Override
      public double timeBetweenFailures( Person unit ) {
        return _resourceWorkers_timeBetweenFailures_xjal( this, unit );
      }
      @Override
      public double repairTime( Person unit ) {
        return _resourceWorkers_repairTime_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceTaskStart repairTaskStart( Person unit ) {
        return _resourceWorkers_repairTaskStart_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState repairUsageState( Person unit ) {
        return _resourceWorkers_repairUsageState_xjal( this, unit );
      }
      @Override
      public double breakTaskPriority( Person unit ) {
        return _resourceWorkers_breakTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean breakTaskMayPreemptOtherTasks( Person unit ) {
        return _resourceWorkers_breakTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy breakTaskPreemptionPolicy( Person unit ) {
        return _resourceWorkers_breakTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourceUsageState breakUsageState( Person unit ) {
        return _resourceWorkers_breakUsageState_xjal( this, unit );
      }
      @Override
      public double endOfShiftTaskPriority( Person unit ) {
        return _resourceWorkers_endOfShiftTaskPriority_xjal( this, unit );
      }
      @Override
      public boolean endOfShiftTaskMayPreemptOtherTasks( Person unit ) {
        return _resourceWorkers_endOfShiftTaskMayPreemptOtherTasks_xjal( this, unit );
      }
      @Override
      public com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy endOfShiftTaskPreemptionPolicy( Person unit ) {
        return _resourceWorkers_endOfShiftTaskPreemptionPolicy_xjal( this, unit );
      }
      @Override
      public boolean requestChoiceCondition( Person unit, Agent agent ) {
        return _resourceWorkers_requestChoiceCondition_xjal( this, unit, agent );
      }
      @Override
      public AgentList population( Person unit ) {
        return _resourceWorkers_population_xjal( this, unit );
      }
      @Override
      public void onNewUnit( Person unit ) {
        _resourceWorkers_onNewUnit_xjal( this, unit );
      }
      @Override
      public void onDestroyUnit( Person unit ) {
        _resourceWorkers_onDestroyUnit_xjal( this, unit );
      }
      @Override
      public void onSeize( Person unit, Agent agent ) {
        _resourceWorkers_onSeize_xjal( this, unit, agent );
      }
      @Override
      public void onRelease( Person unit, Agent agent ) {
        _resourceWorkers_onRelease_xjal( this, unit, agent );
      }
      @Override
      public void onWrapUp( Person unit, Agent agent ) {
        _resourceWorkers_onWrapUp_xjal( this, unit, agent );
      }
      @Override
      public void onUnitStateChange( Person unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
        _resourceWorkers_onUnitStateChange_xjal( this, unit, busy, type, agent, task );
      }
      @Override
      public void onMaintenanceStart( Person unit ) {
        _resourceWorkers_onMaintenanceStart_xjal( this, unit );
      }
      @Override
      public void onMaintenanceEnd( Person unit ) {
        _resourceWorkers_onMaintenanceEnd_xjal( this, unit );
      }
      @Override
      public void onFailure( Person unit ) {
        _resourceWorkers_onFailure_xjal( this, unit );
      }
      @Override
      public void onRepair( Person unit ) {
        _resourceWorkers_onRepair_xjal( this, unit );
      }
      @Override
      public void onBreakStart( Person unit ) {
        _resourceWorkers_onBreakStart_xjal( this, unit );
      }
      @Override
      public void onBreakEnd( Person unit ) {
        _resourceWorkers_onBreakEnd_xjal( this, unit );
      }
      @Override
      public void onBreakTerminated( Person unit ) {
        _resourceWorkers_onBreakTerminated_xjal( this, unit );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_resourceWorkers_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, TableInput _t ) {
    self.type = 
self.RESOURCE_MOVING 
;
    self.capacityDefinitionType = 
self.CAPACITY_DIRECT 
;
    self.capacity = 
30 
;
    self.capacityBasedOnAttractors = 
true 
;
    self.capacitySchedule = 
 
;
    self.capacityScheduleOnOff = 
 
;
    self.shiftGroupSchedules = 
{} 
;
    self.shiftGroupSizes = 
{} 
;
    self.shiftGroupsPlan = 
 
;
    self.destroyExcessUnits = 
false 
;
    self.speed = 
10 
;
    self.homeNodes = new INode[]
{ spWorkers } 
;
    self.showDefaultAnimationStatic = 
true 
;
    self.downtimeSource = 
self.DOWNTIME_LIST 
;
    self.downtimeList = 
 
;
    self.enableMaintenance = 
false 
;
    self.maintenanceType = 
self.MAINTENANCE_DELAY 
;
    self.enableFailuresRepairs = 
false 
;
    self.countBusyOnlyTimeToFailure = 
false 
;
    self.repairType = 
self.REPAIR_DELAY 
;
    self.enableBreaks = 
false 
;
    self.breaksSchedule = 
 
;
    self.enableCustomTasks = 
false 
;
    self.customTasks = 
{} 
;
    self.customizeRequestChoice = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_resourceWorkers_xjal( com.anylogic.libraries.processmodeling.ResourcePool<Person> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Batch<Package, Batch> instantiate_Loading_xjal() {
    com.anylogic.libraries.processmodeling.Batch<Package, Batch> _result_xjal = new com.anylogic.libraries.processmodeling.Batch<Package, Batch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public Agent newBatch(  ) {
        return _Loading_newBatch_xjal( this );
      }
      @Override
      public boolean changeDimensions( Batch agent ) {
        return _Loading_changeDimensions_xjal( this, agent );
      }
      @Override
      public double length( Batch agent ) {
        return _Loading_length_xjal( this, agent );
      }
      @Override
      public double width( Batch agent ) {
        return _Loading_width_xjal( this, agent );
      }
      @Override
      public double height( Batch agent ) {
        return _Loading_height_xjal( this, agent );
      }
      @Override
      public double locationX( Batch agent ) {
        return _Loading_locationX_xjal( this, agent );
      }
      @Override
      public double locationY( Batch agent ) {
        return _Loading_locationY_xjal( this, agent );
      }
      @Override
      public double locationZ( Batch agent ) {
        return _Loading_locationZ_xjal( this, agent );
      }
      @Override
      public double locationLatitude( Batch agent ) {
        return _Loading_locationLatitude_xjal( this, agent );
      }
      @Override
      public double locationLongitude( Batch agent ) {
        return _Loading_locationLongitude_xjal( this, agent );
      }
      @Override
      public String locationGeoPlaceName( Batch agent ) {
        return _Loading_locationGeoPlaceName_xjal( this, agent );
      }
      @Override
      public INetwork locationNetwork( Batch agent ) {
        return _Loading_locationNetwork_xjal( this, agent );
      }
      @Override
      public Level locationLevel( Batch agent ) {
        return _Loading_locationLevel_xjal( this, agent );
      }
      @Override
      public INode locationNode( Batch agent ) {
        return _Loading_locationNode_xjal( this, agent );
      }
      @Override
      public Attractor locationAttractor( Batch agent ) {
        return _Loading_locationAttractor_xjal( this, agent );
      }
      @Override
      public double speed( Batch agent ) {
        return _Loading_speed_xjal( this, agent );
      }
      @Override
      public AgentList population( Batch batch ) {
        return _Loading_population_xjal( this, batch );
      }
      @Override
      public void onEnter( Package agent ) {
        _Loading_onEnter_xjal( this, agent );
      }
      @Override
      public void onAdd( Package agent, Batch batch ) {
        _Loading_onAdd_xjal( this, agent, batch );
      }
      @Override
      public void onExit( Batch batch ) {
        _Loading_onExit_xjal( this, batch );
      }
      @Override
      public void onRemove( Package agent ) {
        _Loading_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_Loading_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, TableInput _t ) {
    self.batchSize = 
10 
;
    self.permanent = 
false 
;
    self.entityLocation = 
SPLoading 
;
    self.locationType = 
self.LOCATION_NOT_SPECIFIED 
;
    self.locationXYZInNetwork = 
false 
;
    self.addToCustomPopulation = 
false 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_Loading_xjal( com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }
  /**
   * Creates an embedded object instance<br>
   * <i>This method should not be called by user</i>
   */
  protected com.anylogic.libraries.processmodeling.Delay<Batch> instantiate_delay_xjal() {
    com.anylogic.libraries.processmodeling.Delay<Batch> _result_xjal = new com.anylogic.libraries.processmodeling.Delay<Batch>( getEngine(), this, null ) {
      // Additional class code

 
      // End of additional class code
      @Override
      public double delayTime( Batch agent ) {
        return _delay_delayTime_xjal( this, agent );
      }

      @AnyLogicInternalCodegenAPI
      public TimeUnits getUnitsForCodeOf_delayTime() {
        return MINUTE;
      }
      @Override
      public void onEnter( Batch agent, double delayTime ) {
        _delay_onEnter_xjal( this, agent, delayTime );
      }
      @Override
      public void onAtExit( Batch agent ) {
        _delay_onAtExit_xjal( this, agent );
      }
      @Override
      public void onExit( Batch agent ) {
        _delay_onExit_xjal( this, agent );
      }
      @Override
      public void onRemove( Batch agent ) {
        _delay_onRemove_xjal( this, agent );
      }
	};
    
    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_delay_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, TableInput _t ) {
    self.type = 
self.TIMEOUT 
;
    self.capacity = 
1 
;
    self.maximumCapacity = 
true 
;
    self.entityLocation = 
spShop 
;
    self.pushProtocol = 
false 
;
    self.restoreEntityLocationOnExit = 
true 
;
    self.forceStatisticsCollection = 
false 
;
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_delay_xjal( com.anylogic.libraries.processmodeling.Delay<Batch> self, TableInput _t ) {
	double _initial_speed = 
10 
;
	self.setSpeed(_initial_speed, MPS);
	double _length = 
1 
;
	self.setLength(_length, METER);
	double _width = 
1 
;
	self.setWidth(_width, METER);
	double _height = 
1 
;
	self.setHeight(_height, METER);
	IRouteProvider _v1_xjal = 
 ;
	self.setRouteProvider( _v1_xjal );
  }

  private double _sourceBodies_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self ) {
    double _value;
    _value = 
exponential( 1.0/10.0 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private double _sourceBodies_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _sourceBodies_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _sourceBodies_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self ) {
    int _value;
    _value = 
15 
;
    return _value;
  }
  private double _sourceBodies_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceBodies_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceBodies_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceBodies_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceBodies_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _sourceBodies_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _sourceBodies_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _sourceBodies_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _sourceBodies_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _sourceBodies_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _sourceBodies_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _sourceBodies_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self ) {
    Agent _value;
    _value = 
new small_factory.Body() 
;
    return _value;
  }
  private boolean _sourceBodies_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _sourceBodies_length_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourceBodies_width_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourceBodies_height_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _sourceBodies_population_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _sourceBodies_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self ) {
    
 
;
  }
  private void _sourceBodies_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    
 
;
  }
  private void _sourceBodies_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    
 
;
  }
  private void _sourceBodies_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Body> self, Body agent ) {
    
 
;
  }
  private double _queueBodies_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _queueBodies_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent1, Body agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _queueBodies_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _queueBodies_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private void _queueBodies_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private void _queueBodies_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private void _queueBodies_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private void _queueBodies_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private void _queueBodies_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Body> self, Body agent ) {
    
 
;
  }
  private double _conveyorBodies_entityLength_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    double _value;
    _value = 
2*agent.parWidth 
;
    return _value;
  }
  private void _conveyorBodies_onEnter_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _conveyorBodies_onFullEnter_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _conveyorBodies_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _conveyorBodies_onExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _conveyorBodies_onFullExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _conveyorBodies_onRemove_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Body> self, Body agent ) {
    
 
;
  }
  private void _sinkBodies_onEnter_xjal( final com.anylogic.libraries.processmodeling.Sink<Batch> self, Batch agent ) {
    
 
;
  }
  private double _sourcedoors_interarrivalTime_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self ) {
    double _value;
    _value = 
exponential( 1.0/2.5 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private double _sourcedoors_rateExpression_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, double baseRate ) {
    double _value;
    _value = 
baseRate 
;
    return _value;
  }
  private Date _sourcedoors_arrivalDate_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self ) {
    Date _value;
    _value = 
null 
;
    return _value;
  }
  private int _sourcedoors_entitiesPerArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self ) {
    int _value;
    _value = 
uniform_discr(3, 5) 
;
    return _value;
  }
  private double _sourcedoors_locationX_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcedoors_locationY_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcedoors_locationZ_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcedoors_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcedoors_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _sourcedoors_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _sourcedoors_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _sourcedoors_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _sourcedoors_locationNode_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _sourcedoors_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _sourcedoors_speed_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private Agent _sourcedoors_newEntity_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self ) {
    Agent _value;
    _value = 
new small_factory.Door() 
;
    return _value;
  }
  private boolean _sourcedoors_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _sourcedoors_length_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourcedoors_width_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _sourcedoors_height_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private AgentList _sourcedoors_population_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _sourcedoors_onBeforeArrival_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self ) {
    
 
;
  }
  private void _sourcedoors_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    
 
;
  }
  private void _sourcedoors_onExit_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    
 
;
  }
  private void _sourcedoors_onDiscard_xjal( final com.anylogic.libraries.processmodeling.Source<Door> self, Door agent ) {
    
 
;
  }
  private double _queuedoors_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _queuedoors_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent1, Door agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _queuedoors_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _queuedoors_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private void _queuedoors_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private void _queuedoors_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private void _queuedoors_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private void _queuedoors_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private void _queuedoors_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Door> self, Door agent ) {
    
 
;
  }
  private Agent _assembler_newEntity_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Queue< Body > queue1, Queue< Door > queue2, Queue< Agent > queue3, Queue< Agent > queue4, Queue< Agent > queue5 ) {
    Agent _value;
    _value = 
new small_factory.Assembly() 
;
    return _value;
  }
  private boolean _assembler_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _assembler_length_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _assembler_width_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _assembler_height_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _assembler_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ 
  { resourceAssembler }
} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _assembler_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _assembler_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _assembler_delayTime_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
triangular(5, 15, 10) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private double _assembler_locationX_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _assembler_locationY_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _assembler_locationZ_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _assembler_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _assembler_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _assembler_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _assembler_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _assembler_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _assembler_locationNode_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _assembler_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _assembler_speed_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private double _assembler_priority_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _assembler_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _assembler_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _assembler_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private boolean _assembler_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _assembler_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _assembler_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Agent unit, Assembly agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _assembler_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Agent unit1, Agent unit2, Assembly agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private AgentList _assembler_population_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _assembler_onEnter1_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Body agent ) {
    
 
;
  }
  private void _assembler_onEnter2_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Door agent ) {
    
 
;
  }
  private void _assembler_onEnter3_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _assembler_onEnter4_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _assembler_onEnter5_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _assembler_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, double delayTime ) {
    
fnupdatecolour(); 
;
  }
  private void _assembler_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    
fnupdatecolour(); 
;
  }
  private void _assembler_onExit_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent ) {
    
 
;
  }
  private void _assembler_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, Agent unit ) {
    
 
;
  }
  private void _assembler_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, Agent unit ) {
    
 
;
  }
  private void _assembler_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Assembler<Assembly, Body, Door, Agent, Agent, Agent> self, Assembly agent, Agent unit ) {
    
 
;
  }
  private int _resourceAssembler_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _resourceAssembler_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self ) {
    Agent _value;
    _value = 
new Agent() 
;
    return _value;
  }
  private double _resourceAssembler_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _resourceAssembler_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _resourceAssembler_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _resourceAssembler_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _resourceAssembler_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _resourceAssembler_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceAssembler_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceAssembler_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _resourceAssembler_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _resourceAssembler_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _resourceAssembler_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceAssembler_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceAssembler_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _resourceAssembler_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _resourceAssembler_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceAssembler_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceAssembler_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _resourceAssembler_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _resourceAssembler_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _resourceAssembler_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _resourceAssembler_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _resourceAssembler_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _resourceAssembler_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _resourceAssembler_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, Agent agent ) {
    
 
;
  }
  private void _resourceAssembler_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _resourceAssembler_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private void _resourceAssembler_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Agent> self, Agent unit ) {
    
 
;
  }
  private double _qAssembly_priority_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _qAssembly_comparison_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent1, Assembly agent2 ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _qAssembly_timeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private void _qAssembly_onEnter_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _qAssembly_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _qAssembly_onExit_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _qAssembly_onExitTimeout_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _qAssembly_onExitPreempted_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _qAssembly_onRemove_xjal( final com.anylogic.libraries.processmodeling.Queue<Assembly> self, Assembly agent ) {
    
 
;
  }
  private double _conveyorAssembly_entityLength_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private void _conveyorAssembly_onEnter_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _conveyorAssembly_onFullEnter_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _conveyorAssembly_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _conveyorAssembly_onExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _conveyorAssembly_onFullExit_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private void _conveyorAssembly_onRemove_xjal( final com.anylogic.libraries.processmodeling.Conveyor<Assembly> self, Assembly agent ) {
    
 
;
  }
  private Agent _Packaging_newEntity_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Queue< Assembly > queue1, Queue< Agent > queue2, Queue< Agent > queue3, Queue< Agent > queue4, Queue< Agent > queue5 ) {
    Agent _value;
    _value = 
new small_factory.Package() 
;
    return _value;
  }
  private boolean _Packaging_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Packaging_length_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _Packaging_width_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _Packaging_height_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool[][] _Packaging_resourceSets_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool[][] _value;
    _value = new com.anylogic.libraries.processmodeling.ResourcePool[][]
{ 
  { resourceWorkers, resourceWorkers }
} 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePool _Packaging_resourcePool_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    com.anylogic.libraries.processmodeling.ResourcePool _value;
    _value = 
 
;
    return _value;
  }
  private int _Packaging_resourceQuantity_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private double _Packaging_delayTime_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
triangular( 5,10,15 ) 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private double _Packaging_locationX_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Packaging_locationY_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Packaging_locationZ_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Packaging_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Packaging_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _Packaging_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _Packaging_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _Packaging_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _Packaging_locationNode_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _Packaging_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _Packaging_speed_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private double _Packaging_priority_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Packaging_taskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _Packaging_taskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    com.anylogic.libraries.processmodeling.TaskPreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.Enter _Packaging_terminatedTasksEnter_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, Agent unit ) {
    com.anylogic.libraries.processmodeling.Enter _value;
    _value = 
 
;
    return _value;
  }
  private boolean _Packaging_resourceChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, Agent unit, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceSelectionMode _Packaging_resourceSelectionMode_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, com.anylogic.libraries.processmodeling.ResourcePool pool ) {
    com.anylogic.libraries.processmodeling.ResourceSelectionMode _value;
    _value = 
self.RESOURCE_SELECTION_SOME_UNIT 
;
    return _value;
  }
  private double _Packaging_resourceRating_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent unit, Package agent ) {
    double _value;
    _value = 
0 
;
    return _value;
  }
  private boolean _Packaging_resourceComparison_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent unit1, Agent unit2, Package agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private AgentList _Packaging_population_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _Packaging_onEnter1_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Assembly agent ) {
    
 
;
  }
  private void _Packaging_onEnter2_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _Packaging_onEnter3_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _Packaging_onEnter4_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _Packaging_onEnter5_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Agent agent ) {
    
 
;
  }
  private void _Packaging_onEnterDelay_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, double delayTime ) {
    
 
;
  }
  private void _Packaging_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    
 
;
  }
  private void _Packaging_onExit_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent ) {
    
 
;
  }
  private void _Packaging_onTaskTerminated_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, Agent unit ) {
    
 
;
  }
  private void _Packaging_onTaskSuspended_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, Agent unit ) {
    
 
;
  }
  private void _Packaging_onTaskResumed_xjal( final com.anylogic.libraries.processmodeling.Assembler<Package, Assembly, Agent, Agent, Agent, Agent> self, Package agent, Agent unit ) {
    
 
;
  }
  private int _resourceWorkers_capacityOnValue_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self ) {
    int _value;
    _value = 
1 
;
    return _value;
  }
  private Agent _resourceWorkers_newUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self ) {
    Agent _value;
    _value = 
new small_factory.Person() 
;
    return _value;
  }
  private double _resourceWorkers_initialTimeToMaintenance_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _resourceWorkers_timeBetweenMaintenances_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _resourceWorkers_maintenanceTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _resourceWorkers_maintenanceTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _resourceWorkers_maintenanceTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
triangular(10, 20, 30) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _resourceWorkers_maintenanceTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceWorkers_maintenanceUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceWorkers_initialTimeToFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
uniform( 0, 1000 ) 
;
    return _value;
  }
  private double _resourceWorkers_timeBetweenFailures_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
triangularAV( 1000, 0.1 ) 
;
    return _value;
  }
  private double _resourceWorkers_repairTime_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
triangularAV( 10, 0.1 ) 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceTaskStart _resourceWorkers_repairTaskStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourceTaskStart _value;
    _value = 
 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceWorkers_repairUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceWorkers_breakTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
50 
;
    return _value;
  }
  private boolean _resourceWorkers_breakTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _resourceWorkers_breakTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_TERMINATE 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourceUsageState _resourceWorkers_breakUsageState_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourceUsageState _value;
    _value = 
self.USAGE_NOT_COUNTED 
;
    return _value;
  }
  private double _resourceWorkers_endOfShiftTaskPriority_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    double _value;
    _value = 
100 
;
    return _value;
  }
  private boolean _resourceWorkers_endOfShiftTaskMayPreemptOtherTasks_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _resourceWorkers_endOfShiftTaskPreemptionPolicy_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    com.anylogic.libraries.processmodeling.ResourcePreemptionPolicy _value;
    _value = 
self.PP_NO_PREEMPTION 
;
    return _value;
  }
  private boolean _resourceWorkers_requestChoiceCondition_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit, Agent agent ) {
    boolean _value;
    _value = 
true 
;
    return _value;
  }
  private AgentList _resourceWorkers_population_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _resourceWorkers_onNewUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
unit.shapeBody.setFillColor(UtilitiesColor.green); 
;
  }
  private void _resourceWorkers_onDestroyUnit_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onSeize_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit, Agent agent ) {
    
unit.shapeBody.setFillColor(UtilitiesColor.red); 
;
  }
  private void _resourceWorkers_onRelease_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit, Agent agent ) {
    
unit.shapeBody.setFillColor(UtilitiesColor.green); 
;
  }
  private void _resourceWorkers_onWrapUp_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit, Agent agent ) {
    
 
;
  }
  private void _resourceWorkers_onUnitStateChange_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit, boolean busy, com.anylogic.libraries.processmodeling.ResourceTaskType type, Agent agent, com.anylogic.libraries.processmodeling.Downtime task ) {
    
 
;
  }
  private void _resourceWorkers_onMaintenanceStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onMaintenanceEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onFailure_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onRepair_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onBreakStart_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onBreakEnd_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private void _resourceWorkers_onBreakTerminated_xjal( final com.anylogic.libraries.processmodeling.ResourcePool<Person> self, Person unit ) {
    
 
;
  }
  private Agent _Loading_newBatch_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self ) {
    Agent _value;
    _value = 
new small_factory.Batch() 
;
    return _value;
  }
  private boolean _Loading_changeDimensions_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    boolean _value;
    _value = 
false 
;
    return _value;
  }
  private double _Loading_length_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _Loading_width_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _Loading_height_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
1 
;
    return _value;
  }
  private double _Loading_locationX_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Loading_locationY_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Loading_locationZ_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Loading_locationLatitude_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private double _Loading_locationLongitude_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
 
;
    return _value;
  }
  private String _Loading_locationGeoPlaceName_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    String _value;
    _value = 
 
;
    return _value;
  }
  private INetwork _Loading_locationNetwork_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    INetwork _value;
    _value = 
 
;
    return _value;
  }
  private Level _Loading_locationLevel_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    Level _value;
    _value = 
 
;
    return _value;
  }
  private INode _Loading_locationNode_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    INode _value;
    _value = 
 
;
    return _value;
  }
  private Attractor _Loading_locationAttractor_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    Attractor _value;
    _value = 
 
;
    return _value;
  }
  private double _Loading_speed_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch agent ) {
    double _value;
    _value = 
10 
;
    return _value;
  }
  private AgentList _Loading_population_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch batch ) {
    AgentList _value;
    _value = 
 
;
    return _value;
  }
  private void _Loading_onEnter_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Package agent ) {
    
 
;
  }
  private void _Loading_onAdd_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Package agent, Batch batch ) {
    
 
;
  }
  private void _Loading_onExit_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Batch batch ) {
    
 
;
  }
  private void _Loading_onRemove_xjal( final com.anylogic.libraries.processmodeling.Batch<Package, Batch> self, Package agent ) {
    
 
;
  }
  private double _delay_delayTime_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, Batch agent ) {
    double _value;
    _value = 
5 
;
    _value = MINUTE.convertTo( _value, SECOND );
    return _value;
  }
  private void _delay_onEnter_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, Batch agent, double delayTime ) {
    
 
;
  }
  private void _delay_onAtExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, Batch agent ) {
    
 
;
  }
  private void _delay_onExit_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, Batch agent ) {
    
 
;
  }
  private void _delay_onRemove_xjal( final com.anylogic.libraries.processmodeling.Delay<Batch> self, Batch agent ) {
    
 
;
  }
  // Functions

 
  void fnupdatecolour(  ) { 

double util = ((double)resourceAssembler.busy())/((double )resourceAssembler.capacity);
if(util==0.0  ){
  shapeAssembler.setFillColor(UtilitiesColor.white); 
} else if ( util<=0.33 ){
  shapeAssembler.setFillColor(UtilitiesColor.green);
} else if ( util<=0.67  ){
  shapeAssembler.setFillColor(UtilitiesColor.yellow); 
} else{
  shapeAssembler.setFillColor(UtilitiesColor.red); 
} 




 
  }
  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression0_dataSet_xjal_YValue() {
    return 
resourceAssembler.busy() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _plot_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __plot_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __plot_expression1_dataSet_xjal_YValue() {
    return 
resourceAssembler.utilization()*resourceAssembler.capacity 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _chart_expression0_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __chart_expression0_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression0_dataSet_xjal_YValue() {
    return 
resourceWorkers.busy() 
;
  }

  @AnyLogicInternalCodegenAPI
  public DataSet _chart_expression1_dataSet_xjal = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), __chart_expression1_dataSet_xjal_YValue() );
      _lastUpdateX = time();
    }
  } );
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double __chart_expression1_dataSet_xjal_YValue() {
    return 
resourceWorkers.idle() 
;
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
  protected static final int _plot = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _chart = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _smallfactoryimage = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeAssembler = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int _spaceBodiesstorage = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int _spacedoorstorage = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int _spacedoorwaitingassembly = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int _spaceassembly = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int _spaceBodiesAwitingassembly = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _spaceBodiesconvery = 10;
  @AnyLogicInternalCodegenAPI
  protected static final int _spPackaging = 11;
  @AnyLogicInternalCodegenAPI
  protected static final int _SPLoading = 12;
  @AnyLogicInternalCodegenAPI
  protected static final int _spWaitingPackaging = 13;
  @AnyLogicInternalCodegenAPI
  protected static final int _spConveyorAssembly = 14;
  @AnyLogicInternalCodegenAPI
  protected static final int _spWorkers = 15;
  @AnyLogicInternalCodegenAPI
  protected static final int _spShop = 16;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 17;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network_xjal() {
	  network.addAll(spaceBodiesAwitingassembly, spaceBodiesconvery);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_network1_xjal() {
	  network1.addAll(spWaitingPackaging, spConveyorAssembly);
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(smallfactoryimage, spaceBodiesstorage, spacedoorstorage, spacedoorwaitingassembly, spaceassembly, network, plot, shapeAssembler, spPackaging, SPLoading, network1, spWorkers, spShop, chart);
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _spaceBodiesstorage_pointsDX_xjal() {
    return new double[] { 0.0, 80.0, 80.0, 80.0, 55.0, 50.0, 50.0, 35.0, 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _spaceBodiesstorage_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 175.0, 180.0, 180.0, 180.0, 160.0, 165.0, 160.0, 135.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _spaceBodiesconvery_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 120.0, 365.0, 0.0, 195.0, 365.0, 0.0 ),
       new MarkupSegmentLine( 195.0, 365.0, 0.0, 240.0, 450.0, 0.0 ),
       new MarkupSegmentLine( 240.0, 450.0, 0.0, 317.0, 450.0, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _spPackaging_pointsDX_xjal() {
    return new double[] { 0.0, 20.0, 40.0, 55.0, 50.0, 35.0, 15.0, -5.0, -20.0, -40.0, -50.0, -55.0, -45.0, -40.0, -30.0, -15.0, -10.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _spPackaging_pointsDY_xjal() {
    return new double[] { 0.0, 5.0, 20.0, 55.0, 80.0, 100.0, 110.0, 110.0, 105.0, 95.0, 75.0, 50.0, 30.0, 20.0, 10.0, 5.0, 5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _SPLoading_pointsDX_xjal() {
    return new double[] { 0.0, 5.0, 90.0, 100.0, 100.0, 95.0, 40.0, 30.0, 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _SPLoading_pointsDY_xjal() {
    return new double[] { 0.0, -10.0, -10.0, -5.0, 60.0, 65.0, 65.0, 35.0, 15.0, 10.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _spWaitingPackaging_pointsDX_xjal() {
    return new double[] { 0.0, 3.0, -11.0, -16.0, -16.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _spWaitingPackaging_pointsDY_xjal() {
    return new double[] { 0.0, 21.0, 34.0, 15.0, 14.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private static MarkupSegment[] _spConveyorAssembly_segments_xjal() {
    return new MarkupSegment[] {
       new MarkupSegmentLine( 363.0, 450.0, 0.0, 477.0, 451.0, 0.0 ),
       new MarkupSegmentLine( 477.0, 451.0, 0.0, 499.0, 472.0, 0.0 ),
       new MarkupSegmentLine( 499.0, 472.0, 0.0, 574.591, 470.845, 0.0 ), };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _spWorkers_pointsDX_xjal() {
    return new double[] { 0.0, 120.0, 120.0, 80.0, 60.0, 50.0, 0.0, 0.0,  };
  }

  @AnyLogicInternalCodegenAPI
  protected static final double[] _spWorkers_pointsDY_xjal() {
    return new double[] { 0.0, 0.0, 60.0, 70.0, 100.0, 110.0, 110.0, 100.0,  };
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean onShapeClick( int _shape, int index, double clickx, double clicky ){
    switch( _shape ){
      case _smallfactoryimage:
        if (true) {
          ShapeImage self = this.smallfactoryimage;
          
 
        }
        break;
      case _shapeAssembler:
        if (true) {
          ShapeRectangle self = this.shapeAssembler;
          
 
        }
        break;
      default: return super.onShapeClick( _shape, index, clickx, clicky );
 	}
 	return false;
  }
   
  @Override
  @AnyLogicInternalCodegenAPI
  public void onSelectionChanged_xjal( int _shape, int index, int[] selectedIndices, boolean programmatically ) {
    switch( _shape ) {
      case _plot: {
        TimePlot self = this.plot;
        
 
;}
        break;
      case _chart: {
        TimeStackChart self = this.chart;
        
 
;}
        break;
      default:
        super.onSelectionChanged_xjal( _shape, index, selectedIndices, programmatically );
        break;
    }
  }


  // Stub function for code completion support (internal)
  @AnyLogicInternalCodegenAPI
  private void _stubForReplication_xjal() {
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
100 
;
    }
    {
      int _result_xjal = 
 
;
    }
    {
      int _result_xjal = 
 
;
    }
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
  private void _plot_SetDynamicParams_xjal( TimePlot shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimePlot plot;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _chart_SetDynamicParams_xjal( TimeStackChart shape ) {
    boolean _visible = 
 
;
    shape.setVisible( _visible );
 	if ( _visible ) {
    shape.setX(
 
);
    shape.setY(
 
);
    shape.setWidth(
 
);
    shape.setHeight(
 
);
 	}
  }
  
  protected TimeStackChart chart;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _smallfactoryimage_SetDynamicParams_xjal( ShapeImage shape ) {
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
    shape.setWidth(
 
);
    shape.setHeight(
 
);
    shape.setScaleX(
 
);
    shape.setScaleY(
 
);
    shape.setRotation(
 
);
    shape.setIndex(
 
);
 	}
  }
  
  protected ShapeImage smallfactoryimage;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _shapeAssembler_SetDynamicParams_xjal( ShapeRectangle shape ) {
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
    shape.setWidth(
 
);
    shape.setHeight(
 
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
 	}
  }
  
  protected ShapeRectangle shapeAssembler;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spaceBodiesstorage_SetDynamicParams_xjal( PolygonalNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected PolygonalNode<Agent> spaceBodiesstorage;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spacedoorstorage_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> spacedoorstorage;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spacedoorwaitingassembly_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> spacedoorwaitingassembly;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spaceassembly_SetDynamicParams_xjal( PointNode shape ) {
    shape.setFillColor(
 
);
  }
  
  protected PointNode spaceassembly;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spaceBodiesAwitingassembly_SetDynamicParams_xjal( RectangularNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected RectangularNode<Agent> spaceBodiesAwitingassembly;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spaceBodiesconvery_SetDynamicParams_xjal( Path shape ) {
    shape.setLineColor(
 
);
  }
  
  protected Path spaceBodiesconvery;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spPackaging_SetDynamicParams_xjal( PolygonalNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected PolygonalNode<Agent> spPackaging;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _SPLoading_SetDynamicParams_xjal( PolygonalNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected PolygonalNode<Agent> SPLoading;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spWaitingPackaging_SetDynamicParams_xjal( PolygonalNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected PolygonalNode<Agent> spWaitingPackaging;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spConveyorAssembly_SetDynamicParams_xjal( Path shape ) {
    shape.setLineColor(
 
);
  }
  
  protected Path spConveyorAssembly;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spWorkers_SetDynamicParams_xjal( PolygonalNode<Agent> shape ) {
    shape.setLineColor(
 
);
    shape.setFillColor(
 
);
    shape.setLineWidth(
 
);
    shape.setLineStyle(
 
);
  }
  
  protected PolygonalNode<Agent> spWorkers;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _spShop_SetDynamicParams_xjal( PointNode shape ) {
    shape.setFillColor(
 
);
  }
  
  protected PointNode spShop;
  protected com.anylogic.engine.markup.Network network;
  protected com.anylogic.engine.markup.Network network1;

  private INetwork[] _getNetworks_xjal;

  @Override
  public INetwork[] getNetworks() {
    return _getNetworks_xjal;
  }

  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    smallfactoryimage = new ShapeImage(
		Main.this, SHAPE_DRAW_2D3D, true, 50.0, 330.0, 0.0, 0.0, 
			720.0, 220.0, "/small_factory/", 
			new String[]{"smallFactoryLayout.png",}	 ) {
      @Override
      public void updateDynamicProperties() {
        _smallfactoryimage_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    shapeAssembler = new ShapeRectangle(
       SHAPE_DRAW_2D3D, true,335.0, 435.0, 0.0, 0.0, 
            black, white,
			28.0, 30.0, 10.0, 1.0, LINE_STYLE_SOLID ) {
      @Override
      public void updateDynamicProperties() {
        _shapeAssembler_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spaceBodiesconvery = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_CONVEYOR, dodgerBlue, 1.8, _spaceBodiesconvery_segments_xjal() ) {
      @Override
      public void updateDynamicProperties() {
        _spaceBodiesconvery_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spConveyorAssembly = new Path( this, SHAPE_DRAW_2D3D, true, true, false, 10, false, 10, PATH_CONVEYOR, dodgerBlue, 1.0, _spConveyorAssembly_segments_xjal() ) {
      @Override
      public void updateDynamicProperties() {
        _spConveyorAssembly_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

		spaceBodiesstorage = new PolygonalNode<Agent>( this, SHAPE_DRAW_2D3D, true,
		null, 55.0, 335.0, 0.0, _spaceBodiesstorage_pointsDX_xjal(), _spaceBodiesstorage_pointsDY_xjal(),  null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spaceBodiesstorage_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spacedoorstorage = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 257.0, 481.0, 0.0, 98.0, 59.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spacedoorstorage_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spacedoorwaitingassembly = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 317.0, 465.0, 0.0, 38.0, 15.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spacedoorwaitingassembly_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spaceassembly = new PointNode(this, SHAPE_DRAW_2D3D, true, 345.0, 450.0, 0.0, 10.0, dodgerBlue, false, 10.0, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spaceassembly_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spaceBodiesAwitingassembly = new RectangularNode<Agent>( this, SHAPE_DRAW_2D3D, true,
    null, 317.0, 442.0, 0.0, 17.0, 17.0, 0.0,
            null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] { new PathEnd(spaceBodiesconvery, PathEndType.END)} ) {
      @Override
      public void updateDynamicProperties() {
        _spaceBodiesAwitingassembly_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

		spPackaging = new PolygonalNode<Agent>( this, SHAPE_DRAW_2D3D, true,
		null, 645.0, 395.0, 0.0, _spPackaging_pointsDX_xjal(), _spPackaging_pointsDY_xjal(),  null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spPackaging_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

		SPLoading = new PolygonalNode<Agent>( this, SHAPE_DRAW_2D3D, true,
		null, 660.0, 380.0, 0.0, _SPLoading_pointsDX_xjal(), _SPLoading_pointsDY_xjal(),  null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _SPLoading_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

		spWaitingPackaging = new PolygonalNode<Agent>( this, SHAPE_DRAW_2D3D, true,
		null, 588.0, 446.0, 0.0, _spWaitingPackaging_pointsDX_xjal(), _spWaitingPackaging_pointsDY_xjal(),  null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_RANDOM, new PathEnd[] { new PathEnd(spConveyorAssembly, PathEndType.END)} ) {
      @Override
      public void updateDynamicProperties() {
        _spWaitingPackaging_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

		spWorkers = new PolygonalNode<Agent>( this, SHAPE_DRAW_2D3D, true,
		null, 530.0, 330.0, 0.0, _spWorkers_pointsDX_xjal(), _spWorkers_pointsDY_xjal(),  null, dodgerBlue, 1.0, LINE_STYLE_DASHED, POSITION_CHOICE_ARRANGED, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spWorkers_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    spShop = new PointNode(this, SHAPE_DRAW_2D3D, true, 790.0, 410.0, 0.0, 20.0, dodgerBlue, false, 10.0, new PathEnd[] {} ) {
      @Override
      public void updateDynamicProperties() {
        _spShop_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _plot_expression0_dataSet_xjal ); 
    _items.add( _plot_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Number of busy units" );
    _titles.add( "utilization" );
    List<Chart2DPlot.Appearance> _appearances = new ArrayList<Chart2DPlot.Appearance>( 2 );
    _appearances.add( new Chart2DPlot.Appearance( lime, true, false, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    _appearances.add( new Chart2DPlot.Appearance( blue, true, false, Chart.INTERPOLATION_LINEAR, 1.0, Chart.POINT_NONE ) );
    plot = new TimePlot(
		    Main.this, true, 790.0, 190.0, 
			240.0, 220.0,
            null, null,
            50.0, 30.0,
			180.0, 110.0, white, black, black,
            50.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_FIXED,
            
0 
            , 
8 
            , Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _appearances ) {
      @Override
      public void updateDynamicProperties() {
        _plot_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
    {
    DataSet _item;
    List<DataSet> _items = new ArrayList<DataSet>( 2 );
    _items.add( _chart_expression0_dataSet_xjal ); 
    _items.add( _chart_expression1_dataSet_xjal ); 
    List<String> _titles = new ArrayList<String>( 2 );
    _titles.add( "Busy" );
    _titles.add( "Idel" );
    List<Color> _colors = new ArrayList<Color>( 2 );
    _colors.add( red );
    _colors.add( green );
    chart = new TimeStackChart(
		    Main.this, true, 790.0, 400.0, 
			260.0, 210.0,
            null, null,
            50.0, 30.0,
			180.0, 120.0, white, black, black,
            30.0, Chart.SOUTH,
            
100 
            , Chart.WINDOW_MOVES_WITH_TIME, null, Chart.SCALE_AUTO
            , 0, Chart.GRID_DEFAULT, Chart.GRID_DEFAULT,
            darkGray, darkGray, _items, _titles, _colors ) {
      @Override
      public void updateDynamicProperties() {
        _chart_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }
    };

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    network = new com.anylogic.engine.markup.Network(this, "network", SHAPE_DRAW_2D3D, 0.0, true, true);  			
    network1 = new com.anylogic.engine.markup.Network(this, "network1", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getNetworks_xjal = new INetwork[] { 
      network,
      network1 };
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
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
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
    sourceBodies = instantiate_sourceBodies_xjal();
    queueBodies = instantiate_queueBodies_xjal();
    conveyorBodies = instantiate_conveyorBodies_xjal();
    sinkBodies = instantiate_sinkBodies_xjal();
    sourcedoors = instantiate_sourcedoors_xjal();
    queuedoors = instantiate_queuedoors_xjal();
    assembler = instantiate_assembler_xjal();
    resourceAssembler = instantiate_resourceAssembler_xjal();
    qAssembly = instantiate_qAssembly_xjal();
    conveyorAssembly = instantiate_conveyorAssembly_xjal();
    Packaging = instantiate_Packaging_xjal();
    resourceWorkers = instantiate_resourceWorkers_xjal();
    Loading = instantiate_Loading_xjal();
    delay = instantiate_delay_xjal();
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_network_xjal();
	_initialize_network1_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "small_factory.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Creating non-replicated embedded objects
    setupParameters_sourceBodies_xjal( sourceBodies, null );
    doBeforeCreate_sourceBodies_xjal( sourceBodies, null );
    sourceBodies.createAsEmbedded();
    setupParameters_queueBodies_xjal( queueBodies, null );
    doBeforeCreate_queueBodies_xjal( queueBodies, null );
    queueBodies.createAsEmbedded();
    setupParameters_conveyorBodies_xjal( conveyorBodies, null );
    doBeforeCreate_conveyorBodies_xjal( conveyorBodies, null );
    conveyorBodies.createAsEmbedded();
    setupParameters_sinkBodies_xjal( sinkBodies, null );
    doBeforeCreate_sinkBodies_xjal( sinkBodies, null );
    sinkBodies.createAsEmbedded();
    setupParameters_sourcedoors_xjal( sourcedoors, null );
    doBeforeCreate_sourcedoors_xjal( sourcedoors, null );
    sourcedoors.createAsEmbedded();
    setupParameters_queuedoors_xjal( queuedoors, null );
    doBeforeCreate_queuedoors_xjal( queuedoors, null );
    queuedoors.createAsEmbedded();
    setupParameters_assembler_xjal( assembler, null );
    doBeforeCreate_assembler_xjal( assembler, null );
    assembler.createAsEmbedded();
    setupParameters_resourceAssembler_xjal( resourceAssembler, null );
    doBeforeCreate_resourceAssembler_xjal( resourceAssembler, null );
    resourceAssembler.createAsEmbedded();
    setupParameters_qAssembly_xjal( qAssembly, null );
    doBeforeCreate_qAssembly_xjal( qAssembly, null );
    qAssembly.createAsEmbedded();
    setupParameters_conveyorAssembly_xjal( conveyorAssembly, null );
    doBeforeCreate_conveyorAssembly_xjal( conveyorAssembly, null );
    conveyorAssembly.createAsEmbedded();
    setupParameters_Packaging_xjal( Packaging, null );
    doBeforeCreate_Packaging_xjal( Packaging, null );
    Packaging.createAsEmbedded();
    setupParameters_resourceWorkers_xjal( resourceWorkers, null );
    doBeforeCreate_resourceWorkers_xjal( resourceWorkers, null );
    resourceWorkers.createAsEmbedded();
    setupParameters_Loading_xjal( Loading, null );
    doBeforeCreate_Loading_xjal( Loading, null );
    Loading.createAsEmbedded();
    setupParameters_delay_xjal( delay, null );
    doBeforeCreate_delay_xjal( delay, null );
    delay.createAsEmbedded();
	 // Port connectors with non-replicated objects
    queueBodies.in.connect( sourceBodies.out ); // connector
    conveyorBodies.in.connect( queueBodies.out ); // connector1
    queuedoors.in.connect( sourcedoors.out ); // connector3
    assembler.in1.connect( conveyorBodies.out ); // connector4
    queuedoors.out.connect( assembler.in2 ); // connector5
    qAssembly.in.connect( assembler.out ); // connector6
    conveyorAssembly.in.connect( qAssembly.out ); // connector7
    Packaging.in1.connect( conveyorAssembly.out ); // connector8
    Loading.in.connect( Packaging.out ); // connector9
    sinkBodies.in.connect( delay.out ); // connector2
    delay.in.connect( Loading.out ); // connector10
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Main.class );
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
    _plot_autoUpdateEvent_xjal.start();
    _chart_autoUpdateEvent_xjal.start();
    sourceBodies.startAsEmbedded();
    queueBodies.startAsEmbedded();
    conveyorBodies.startAsEmbedded();
    sinkBodies.startAsEmbedded();
    sourcedoors.startAsEmbedded();
    queuedoors.startAsEmbedded();
    assembler.startAsEmbedded();
    resourceAssembler.startAsEmbedded();
    qAssembly.startAsEmbedded();
    conveyorAssembly.startAsEmbedded();
    Packaging.startAsEmbedded();
    resourceWorkers.startAsEmbedded();
    Loading.startAsEmbedded();
    delay.startAsEmbedded();
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
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
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

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( sourceBodies );
    list.add( queueBodies );
    list.add( conveyorBodies );
    list.add( sinkBodies );
    list.add( sourcedoors );
    list.add( queuedoors );
    list.add( assembler );
    list.add( resourceAssembler );
    list.add( qAssembly );
    list.add( conveyorAssembly );
    list.add( Packaging );
    list.add( resourceWorkers );
    list.add( Loading );
    list.add( delay );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _plot_autoUpdateEvent_xjal ) return false;
    if ( _e == _chart_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _plot_autoUpdateEvent_xjal.onDestroy();
    _chart_autoUpdateEvent_xjal.onDestroy();
    sourceBodies.onDestroy();
    queueBodies.onDestroy();
    conveyorBodies.onDestroy();
    sinkBodies.onDestroy();
    sourcedoors.onDestroy();
    queuedoors.onDestroy();
    assembler.onDestroy();
    resourceAssembler.onDestroy();
    qAssembly.onDestroy();
    conveyorAssembly.onDestroy();
    Packaging.onDestroy();
    resourceWorkers.onDestroy();
    Loading.onDestroy();
    delay.onDestroy();
    // On destroy code
    
 
    _plot_expression0_dataSet_xjal.destroyUpdater_xjal();
    _plot_expression1_dataSet_xjal.destroyUpdater_xjal();
    _chart_expression0_dataSet_xjal.destroyUpdater_xjal();
    _chart_expression1_dataSet_xjal.destroyUpdater_xjal();
    logToDB( _plot_expression0_dataSet_xjal, "plot : Number of busy units" );
    logToDB( _plot_expression1_dataSet_xjal, "plot : utilization" );
    logToDB( _chart_expression0_dataSet_xjal, "chart : Busy" );
    logToDB( _chart_expression1_dataSet_xjal, "chart : Idel" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    sourceBodies.doFinish();
    queueBodies.doFinish();
    conveyorBodies.doFinish();
    sinkBodies.doFinish();
    sourcedoors.doFinish();
    queuedoors.doFinish();
    assembler.doFinish();
    resourceAssembler.doFinish();
    qAssembly.doFinish();
    conveyorAssembly.doFinish();
    Packaging.doFinish();
    resourceWorkers.doFinish();
    Loading.doFinish();
    delay.doFinish();
  }

  // Additional class code

 
  // End of additional class code


}
