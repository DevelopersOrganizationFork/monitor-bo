/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.developers.monitor.persistence.service;

import org.developers.monitor.persistence.DAO.SensorDao;
import org.developers.monitor.persistence.Sensor;

/**
 *
 * @author Tomek
 */
public class SensorService {
    private static SensorDao sensorDao;
    
    public SensorService(){
        sensorDao = new SensorDao();
    }
    
    public Sensor persist(Sensor entity) throws Exception {
       return sensorDao.persist(entity);
    }
    
    public void remove(Sensor entity) throws Exception { 
        sensorDao.remove(entity); 
    }
    
    public Sensor findById(Integer id) throws Exception { 
        return sensorDao.findById(id); 
    }  
}