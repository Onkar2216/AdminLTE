package com.javabykiran.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.UserOperationsDao;
import com.javabykiran.hibernate.Downloads;
import com.javabykiran.hibernate.Links;
import com.javabykiran.hibernate.Operators;
import com.javabykiran.hibernate.State;
import com.javabykiran.hibernate.Users;
import com.javabykiran.model.AddUserModel;
import com.javabykiran.model.DownloadsModel;
import com.javabykiran.model.OperatorsModel;
import com.javabykiran.model.StateModel;
import com.javabykiran.model.UserlistModel;

@Service
public class UserOperationsService {

	@Autowired
	UserOperationsDao uod;

	public ArrayList<UserlistModel> getUSerListService(int loginid, int page_id, int total) {
		System.out.println("I am in get Userlist Service..");
		List<Users> registration=uod.getUserlistDao(loginid,page_id,total);
		System.out.println(registration);
		ArrayList<UserlistModel> rm = new ArrayList<>();
		for(Users u:registration)
		{
			rm.add(getDataService(u));
		}
		System.out.println(rm);
		return rm;
	}
	
	@Autowired
	HttpSession session;
	public int getLoginIDService()
	{
		System.out.println("I am in get Login ID Service..");
		int loginid=(Integer)session.getAttribute("loginid");
		System.out.println("LoginID >> "+loginid);
		return loginid;
	}
	
	private UserlistModel getDataService(Users user) {
		System.out.println("I am in get data Service..");
		UserlistModel aum=new UserlistModel();
		aum.setIdregistration(user.getIdregistration());
		aum.setEmail(user.getEmail());
		aum.setMobile(user.getMobile());
		aum.setCourses(user.getCourses());
		aum.setGender(user.getGender());
		aum.setPassword(user.getPassword());
		aum.setUsername(user.getUsername());
		aum.setIduser(user.getIdusers());
		aum.setStatename(user.getState().getStatename());
		aum.setIsDefault(user.getIsDefault());
		return aum;
	}

	public boolean getAddUserService(AddUserModel aum, int sid) {
		System.out.println("I am in Add User Service");
		State st=new State();
		st.setSid(sid);
		st.setStatename(getStatenameService(sid));
		aum.setState(st);
		Users user=setUserData(aum);
		return uod.getAddUSerDao(user);
	}

	private Users setUserData(AddUserModel aum) {
		Users user=new Users();
		user.setIdusers(aum.getIduser());
		user.setUsername(aum.getUsername());
		user.setEmail(aum.getEmail());
		user.setCourses(aum.getCourses());
		user.setGender(aum.getGender());
		user.setState(aum.getState());
		user.setPassword(aum.getPassword());
		user.setIdregistration(aum.getIdregistration());
		user.setIsDefault(aum.getIsDefault());
		user.setMobile(aum.getMobile());
		return user;
	}
	
	public ArrayList<AddUserModel> getUpdateUserDataService(int iduser) 
	{
		System.out.println("I am in get update user data Service..");
		List<Users> userlist=uod.getUpdateDataDao(iduser);
		ArrayList<AddUserModel> usermodel=new ArrayList<>();
		for(Users user:userlist)
		{
			
			usermodel.add(setUpdateDataService(user));
		}
		return usermodel;
	}

	private AddUserModel setUpdateDataService(Users user) 
	{
		AddUserModel aum=new AddUserModel(user.getIdusers(), user.getUsername(), user.getMobile(), user.getEmail(), user.getCourses(), user.getGender(), user.getPassword(), user.getIdregistration(),user.getState(),user.getIsDefault());
		return aum;
	}

	
	public boolean getUpdateService(AddUserModel aum,int sid)
	{
		System.out.println("I am Update Method Service"); 
		State st=new State();
		st.setSid(sid);
		st.setStatename(getStatenameService(sid));
		aum.setState(st);
		Users user=setUpdateUserDataService(aum); 
		return uod.getupdateUserDao(user); 
	}
	
	private Users setUpdateUserDataService(AddUserModel aum) 
	{ 
		Users user= new Users(aum.getIduser(),aum.getState(), aum.getUsername(), aum.getMobile(),aum.getEmail(), aum.getCourses(), aum.getGender(), aum.getPassword(),aum.getIdregistration(),aum.getIsDefault());
		return user; 
	}
	
	public boolean getdeleteUserService(int iduser) {
		System.out.println("I am in get delete User Service..");
		return uod.getdeleteUserDao(iduser);
	}

	public ArrayList<StateModel> getStateListService() {
		List<State> state=uod.getStateListDao();
		ArrayList<StateModel> statelist=new ArrayList<>();
		for(State st:state)
		{
			 statelist.add(setStateDataService(st));
		}
		return statelist;
	}

	private StateModel setStateDataService(State st) {
		StateModel state=new StateModel();
		state.setSid(st.getSid());
		state.setStatename(st.getStatename());
		return state;
	}

	public List<Links> getLinklistService() {
		return uod.getLinklistDao();
	}

	public ArrayList<OperatorsModel> getOperatorService() {
		List<Operators> operatorlist=uod.getOperatorListDao();
		ArrayList<OperatorsModel> operatorlistt=new ArrayList<>();
		for(Operators op:operatorlist)
		{
			operatorlistt.add(setOperatorsData(op));
		}
		return operatorlistt;
	}

	private OperatorsModel setOperatorsData(Operators op) {
		OperatorsModel opm=new OperatorsModel(op.getIdoperators(), op.getPerson(), op.getFor_(), op.getWhatsapp(),op.getPhonecall(), op.getSms(), op.getEmail(), op.getContact(), op.getTimings());
		return opm;
	}

	public ArrayList<DownloadsModel> getDownloadService() 
	{
		List<Downloads> downloadlist=uod.getDownloadDao();
		ArrayList<DownloadsModel> dl=new ArrayList<>();
		for(Downloads dw:downloadlist)
		{
			dl.add(setDownloadData(dw));
		}
		return dl;
	}
	
	private DownloadsModel setDownloadData(Downloads dw) 
	{ 
		DownloadsModel dm=new DownloadsModel();
		dm.setIddownloads(dw.getIddownloads()); 
		byte[] image=dw.getName(); 
		String base64Image = Base64.getEncoder().encodeToString(image);
		dm.setBase64Image(base64Image);
		dm.setVender(dw.getVender());
		dm.setVersion(dw.getSoftwareversion());
		dm.setBit32(dw.getBit32()); 
		dm.setBit64(dw.getBit64());
		dm.setCommon(dw.getCommon());
		dm.setOfficialSource(dw.getOfficialSource());
		return dm; 
	 }
	 

	public String getStatenameService(int sid) {
		return uod.getStatenameDao(sid);
	}
}
