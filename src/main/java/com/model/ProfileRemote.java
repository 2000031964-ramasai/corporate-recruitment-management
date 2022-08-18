package com.model;
import javax.ejb.Remote;
import com.entity.*;
@Remote
public interface ProfileRemote {
  public String insertData(Profile P)throws Exception;
  public Profile findData(String uname)throws Exception;
  public String deleteData(String uname)throws Exception;

}