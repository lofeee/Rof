package com.wc.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
SessionAware,ServletContextAware,ServletResponseAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JSONObject jsonMessage;

	protected void addJsonMessage(boolean success, String msg) {
		this.addJsonMessage(success, msg, null);
	}

	protected void addJsonMessage(boolean success, String msg, Object data) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("success", success);
		map.put("msg", msg.equals("") ? "" : msg);
		map.put("data", data == null ? "" : data);
		jsonMessage = JSONObject.fromObject(map);
	}

	public void setJsonMessage(JSONObject jsonMessage) {
		this.jsonMessage = jsonMessage;
	}

	public JSONObject getJsonMessage() {
		return jsonMessage;
	}

	
	protected HttpServletRequest request;
	protected ServletContext application;
	protected Map<String, Object> session;
	protected HttpServletResponse response;
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}

	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application=application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	

}
