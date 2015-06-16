package com.wc.action;

import net.sf.json.JSONObject;

import com.wc.entity.User;
import com.wc.service.UserService;

public class UserAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;

//	public String tsAdd(){
//		user=new User();
//		user.setUserName("ts");
//		user.setName("111");
//		userService.addUser(user);
//		return SUCCESS;
//	}
	
//	public String authorizationLogin() {
//		user=getWechar();
//		if(user!=null){
//			userService.addUser(user);
//		}else{
//			this.addJsonMessage(false, "获取微信用户失败，请联系管理员");
//			return "error";
//		}
//		return "message";
//	}

//	/**
//	 * 实现 1.微信用户点击授权，获取code 
//	 * 2.根据code获取access_token 
//	 * 3.第二步获取的 access_token 和
//	 * openid 实现拉取微信用户基本信息 
//	 * appid secret对应的是公众号的 appID 和 appsecret 信息
//	 * 
//	 */
//	public User getWechar() {
//		User wcUser = null;
//		String appid = "wx3c654750ec731a89";
//		String secret = "640afb875ccef3b14a0f69dcba3748a4";
//		// -----------------------------------------1---------------------------------------------------------//
//		//String code = this.request.getParameter("code"); // 这是获取微信用户点击服务链接的时候获取的code
//		String code="031eb98d8d861dd30fd8be7bb883abfy";
//		// -----------------------------------------2---------------------------------------------------------//
//		String get_access_token = "https://api.weixin.qq.com/sns/oauth2/access_token?appid="+ appid+ "&secret="+ secret+ "&code="+ code+ "&grant_type=authorization_code";
//		String atJSON = HttpUtil.getUrl(get_access_token);
//		JSONObject tokenJson = JSONObject.fromObject(atJSON);
//		String access_token = tokenJson.getString("access_token"); // 网页授权接口调用凭证
//		String openid = tokenJson.getString("openid");
//		// -----------------------------------------3---------------------------------------------------------//
//		String get_userinfo = "https://api.weixin.qq.com/sns/userinfo?access_token="+ access_token + "&openid=" + openid + "&lang=zh_CN";
//		String uiJSON = HttpUtil.getUrl(get_userinfo);
//		JSONObject userinfoJson = JSONObject.fromObject(uiJSON);
//		// 拉取用户信息
//		if (userinfoJson != null) {
//			wcUser = new User();
//			wcUser.setUserToken(userinfoJson.getString("openid"));
//			wcUser.setUserName(userinfoJson.getString("nickname"));
//			wcUser.setPassword("123456");
//			wcUser.setAvatar(userinfoJson.getString("headimgurl"));
//		}
//		return wcUser;
//	}
	public String idx(){
		user=userService.getUserByUserId(1);
		return SUCCESS;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
