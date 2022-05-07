
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BaseController.BaseController;
import Helper.Helper;
import MODEL.MainModel;
import Query.MainQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miqba
 */
public class MainController extends BaseController {
    
    Helper helper = new Helper();
    MainQuery query = new MainQuery();



public boolean create(MainModel model) throws ParseException {

        String date = helper.parseDateToString(model.getTanggal());
    
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getNama());
        map.put(2, model.getTipe());
        map.put(3, model.getJumlah());
        map.put(4, model.getHarga());
        map.put(5, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
public ResultSet get() {

        String sql = this.query.get;
        return this.get(sql);
    }
    
public ResultSet showById(String id) {

        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        return this.getWithParameter(map, sql);
    }
    
public ResultSet showByName(String name) {

        String sql = this.query.showByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return this.getWithParameter(map, sql);
    }

public boolean update(String id, MainModel model) throws ParseException {
        String date = helper.parseDateToString(model.getTanggal());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getNama());
        map.put(2, model.getTipe());
        map.put(3, model.getJumlah());
        map.put(4, model.getHarga());
        map.put(5, date);
        map.put(6, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }

public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
    }

