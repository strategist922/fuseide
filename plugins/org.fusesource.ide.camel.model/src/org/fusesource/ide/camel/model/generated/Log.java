/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

/**
 * NOTE - this file is auto-generated using Scalate. 
 * 
 * DO NOT EDIT!
 */
package org.fusesource.ide.camel.model.generated;

import java.util.Map;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.LogDefinition;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.model.language.ExpressionDefinition;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;
import org.fusesource.ide.camel.model.AbstractNode;
import org.fusesource.ide.camel.model.ExpressionPropertyDescriptor;
import org.fusesource.ide.camel.model.RouteContainer;
import org.fusesource.ide.camel.model.util.Objects;
import org.fusesource.ide.commons.properties.BooleanPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexPropertyDescriptor;
import org.fusesource.ide.commons.properties.ComplexUnionPropertyDescriptor;
import org.fusesource.ide.commons.properties.EnumPropertyDescriptor;
import org.fusesource.ide.commons.properties.ListPropertyDescriptor;
import org.fusesource.ide.commons.properties.UnionTypeValue;

/**
 * The Node class for Camel's LogDefinition
 */
public class Log extends AbstractNode {

	public static final String PROPERTY_MESSAGE = "Log.Message";
	public static final String PROPERTY_LOGNAME = "Log.LogName";
	public static final String PROPERTY_MARKER = "Log.Marker";
	public static final String PROPERTY_LOGGINGLEVEL = "Log.LoggingLevel";
	
	private String message;
	private String logName;
	private String marker;
	private LoggingLevel loggingLevel;
	
    public Log() {
    }		
	
    public Log(LogDefinition definition, RouteContainer parent) {

      super(parent);
    	loadPropertiesFromCamelDefinition(definition);
    	loadChildrenFromCamelDefinition(definition);
    }


    /* (non-Javadoc)
     * @see org.fusesource.ide.camel.model.AbstractNode#getIconName()
     */
    @Override
    public String getIconName() {
    	return "endpoint.png";
    }
    
  	@Override
  	public String getDocumentationFileName() {
  		return "logEIP";
  	}
  	
  	@Override
  	public String getCategoryName() {
  		return "Endpoints";
  	}


	

	/**
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		String oldValue = this.message;
		this.message = message;
		if (!isSame(oldValue, message)) {
		    firePropertyChange(PROPERTY_MESSAGE, oldValue, message);
		}
	}

	/**
	 * @return the logName
	 */
	public String getLogName() {
		return this.logName;
	}
	
	/**
	 * @param logName the logName to set
	 */
	public void setLogName(String logName) {
		String oldValue = this.logName;
		this.logName = logName;
		if (!isSame(oldValue, logName)) {
		    firePropertyChange(PROPERTY_LOGNAME, oldValue, logName);
		}
	}

	/**
	 * @return the marker
	 */
	public String getMarker() {
		return this.marker;
	}
	
	/**
	 * @param marker the marker to set
	 */
	public void setMarker(String marker) {
		String oldValue = this.marker;
		this.marker = marker;
		if (!isSame(oldValue, marker)) {
		    firePropertyChange(PROPERTY_MARKER, oldValue, marker);
		}
	}

	/**
	 * @return the loggingLevel
	 */
	public LoggingLevel getLoggingLevel() {
		return this.loggingLevel;
	}
	
	/**
	 * @param loggingLevel the loggingLevel to set
	 */
	public void setLoggingLevel(LoggingLevel loggingLevel) {
		LoggingLevel oldValue = this.loggingLevel;
		this.loggingLevel = loggingLevel;
		if (!isSame(oldValue, loggingLevel)) {
		    firePropertyChange(PROPERTY_LOGGINGLEVEL, oldValue, loggingLevel);
		}
	}


	
	/*
	 * (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#addCustomProperties(java.util.Map)
	 */
	@Override
	protected void addCustomProperties(Map<String, PropertyDescriptor> descriptors) {
		super.addCustomProperties(descriptors);
		
  		PropertyDescriptor descMessage = new TextPropertyDescriptor(PROPERTY_MESSAGE, Messages.propertyLabelLogMessage);
    		PropertyDescriptor descLogName = new TextPropertyDescriptor(PROPERTY_LOGNAME, Messages.propertyLabelLogLogName);
    		PropertyDescriptor descMarker = new TextPropertyDescriptor(PROPERTY_MARKER, Messages.propertyLabelLogMarker);
      	PropertyDescriptor descLoggingLevel = new EnumPropertyDescriptor(PROPERTY_LOGGINGLEVEL, Messages.propertyLabelLogLoggingLevel, LoggingLevel.class);
  		descriptors.put(PROPERTY_MESSAGE, descMessage);
		descriptors.put(PROPERTY_LOGNAME, descLogName);
		descriptors.put(PROPERTY_MARKER, descMarker);
		descriptors.put(PROPERTY_LOGGINGLEVEL, descLoggingLevel);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void setPropertyValue(Object id, Object value) {
		if (PROPERTY_MESSAGE.equals(id)) {
			setMessage(Objects.convertTo(value, String.class));
		}		else if (PROPERTY_LOGNAME.equals(id)) {
			setLogName(Objects.convertTo(value, String.class));
		}		else if (PROPERTY_MARKER.equals(id)) {
			setMarker(Objects.convertTo(value, String.class));
		}		else if (PROPERTY_LOGGINGLEVEL.equals(id)) {
			setLoggingLevel(Objects.convertTo(value, LoggingLevel.class));
		}    else {
			super.setPropertyValue(id, value);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.fusesource.ide.camel.model.AbstractNode#getPropertyValue(java.lang.Object)
	 */
	@Override
	public Object getPropertyValue(Object id) {
		if (PROPERTY_MESSAGE.equals(id)) {
			return this.getMessage();
		}		else if (PROPERTY_LOGNAME.equals(id)) {
			return this.getLogName();
		}		else if (PROPERTY_MARKER.equals(id)) {
			return this.getMarker();
		}		else if (PROPERTY_LOGGINGLEVEL.equals(id)) {
			return this.getLoggingLevel();
		}    else {
			return super.getPropertyValue(id);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ProcessorDefinition createCamelDefinition() {
		LogDefinition answer = new LogDefinition();
    answer.setMessage(toXmlPropertyValue(PROPERTY_MESSAGE, this.getMessage()));
    answer.setLogName(toXmlPropertyValue(PROPERTY_LOGNAME, this.getLogName()));
    answer.setMarker(toXmlPropertyValue(PROPERTY_MARKER, this.getMarker()));
    answer.setLoggingLevel(toXmlPropertyValue(PROPERTY_LOGGINGLEVEL, this.getLoggingLevel()));
        super.savePropertiesToCamelDefinition(answer);
		return answer;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Class<?> getCamelDefinitionClass() {
	  return LogDefinition.class;
  }

	@SuppressWarnings("rawtypes")
	@Override
	protected void loadPropertiesFromCamelDefinition(ProcessorDefinition processor) {
    super.loadPropertiesFromCamelDefinition(processor);
    
    if (processor instanceof LogDefinition) {
      LogDefinition node = (LogDefinition) processor;
      this.setMessage(node.getMessage());
      this.setLogName(node.getLogName());
      this.setMarker(node.getMarker());
      this.setLoggingLevel(node.getLoggingLevel());
    } else {
      throw new IllegalArgumentException("ProcessorDefinition not an instanceof LogDefinition. Was " + processor.getClass().getName());
    }
	}
}
 
      
