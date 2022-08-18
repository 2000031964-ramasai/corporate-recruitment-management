package com.model;
import javax.ejb.Remote;
import com.entity.*;
@Remote
public interface UserRemote {
  public String insertData(User U)throws Exception;
  public User findData(String uname)throws Exception;
  public String deleteData(String uname)throws Exception;

}