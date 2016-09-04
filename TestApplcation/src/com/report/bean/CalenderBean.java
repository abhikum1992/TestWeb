package com.report.bean;
import java.io.Serializable;
import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.timeline.TimelineSelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.timeline.TimelineEvent;
import org.primefaces.model.timeline.TimelineGroup;
import org.primefaces.model.timeline.TimelineModel;
 
@ManagedBean(name="basicTimelineView")
@ViewScoped
public class CalenderBean implements Serializable {  
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
   
    public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

	private String helloWorld="hello world";
   
    @PostConstruct 
    protected void initialize() {  
    	
         
    }  
   
    
}  