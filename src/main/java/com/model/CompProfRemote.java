package com.model;
import javax.ejb.Remote;
import com.entity.*;
@Remote
public interface CompProfRemote {
  public String insertData(CompProf P)throws Exception;
  public CompProf findData(String uname)throws Exception;
  public String deleteData(String uname)throws Exception;

}