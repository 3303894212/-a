package com.rj.bd.user.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.user.entity.User;
import com.rj.bd.user.service.IUserService;
@CrossOrigin
@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;
	/**
	 * 查询管理员
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public Map<String, Object> Userlogin(HttpServletRequest request,HttpSession httpSession) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String token = httpSession.getId() + username +password;
		System.out.println(token);
		//String token = Md5Utils.makeMd5(str);
		//System.out.println("user_name:"+username+"  user_password:"+password);
		List<User> list = userService.queryAll(username,password);
		Map<String, Object> map = new HashMap<String, Object>();
		if (list.isEmpty()) {
			map.put("code", -1);
			map.put("msg", "登录失败");
			return map;
		}else{
			map.put("code", 200);
			map.put("msg", "请求成功");
			map.put("token", token);
			System.out.println(map);
			return map;
		}
	}
	/**
	 * @desc  进入查询
	 * 
	 */
	@RequestMapping(value ="/query", method = RequestMethod.GET)
	@ResponseBody
	public List<User> UserAll() {
		List<User> list = userService.queryAll2();
		//System.out.println(list);
		return list;
	}
	/**
	 * @desc  添加
	 * @param 
	 * @return
	 * @throws IOException 
	 * @throws FileUploadException 
	 */
	@RequestMapping(value ="/add")
	@ResponseBody
	public Map<String, Object>  insertUser(User user,HttpServletRequest request,HttpServletResponse response ) throws IOException, FileUploadException{
		// 设定类型和编码
				response.setContentType("text/html;charset=utf-8");
				// 设定图片保存的名字
				String fileSaveName = null;
				List<FileItem> formItemsList = null;// 解析结果

				// 设定图片保存在服务器上的路径
				String path = "D:\\Documents\\ZichanguanliQian\\images";
				System.out.println(path);
				// 根据路径名创建一个 File实例其目的是为了创建存储的路径目录
				File file = new File(path);

				if (!file.exists()) {
					file.mkdir();// 创建文件夹
				}
				// 4.4.将请求消息实体中的每一个项目封装成单独的DiskFileItem (FileItem接口的实现) 对象的任务
				// 直白的说就是将本次请求的request封装成DiskFileItemFactory对象
				DiskFileItemFactory factory = new DiskFileItemFactory();
				// 使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
				ServletFileUpload upload = new ServletFileUpload(factory);

				// 设定中文
				upload.setHeaderEncoding("utf-8");
				formItemsList = upload.parseRequest(request);

				if ((formItemsList.size() > 0) && formItemsList != null) {
					for (FileItem item : formItemsList) {
						if (!item.isFormField()) {// 目的时为了要筛出文件域
							// System.out.println(item);
							// 获取上传文件的名字
							String fileName = item.getName();
							System.out.println("上传文件的名字：" + fileName);
							// 获取文件的后缀
							String prifix = fileName.substring(fileName.lastIndexOf(".") + 1);
							System.out.println("后缀为:" + prifix);
							// 设定id(可以绑定session实现区别用户)，当然也可以直接用UUID来命名图片保存的名字

							String id = UUID.randomUUID().toString();

							fileSaveName = id + "." + prifix;// 设定保存文件的名字
							System.out.println("保存文件的名字：" + fileSaveName);
							// 利用commons-io.jar包中的方法实现上传
							FileUtils.copyInputStreamToFile(item.getInputStream(), new File(path + "/" + fileSaveName));
						}
					}
				}
				// 5.调用M层实现保存添加页面的数据
				String virtualPath = fileSaveName;
				System.out.println(virtualPath);
				String user_name = formItemsList.get(0).getString("utf-8");

				String user_passowrd = formItemsList.get(1).getString("utf-8");

				user.setUser_name(user_name);
				user.setUser_password(user_passowrd);
				user.setImg(virtualPath);
				userService.add(user);

				return null;
	

}
	/**
	 * @desc  删除
	 * 
	 */
	@RequestMapping(value ="/delete", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delete(User user){
		userService.delete(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "删除成功");
		System.out.println(map);
		return map;
	}
	/**
	 * @desc  进入修改
	 * 
	 */
	@RequestMapping(value ="/editpage", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editpage(User user){
		System.out.println(user);
		User user2=userService.queryById(user);
		System.out.println(user2);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "添加成功");
		map.put("data", user2);
		return map;
	}
	/**
	 * @desc 修改保存
	 */
	@RequestMapping(value ="/edit", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> edit(User user){
		System.out.println(user);
		userService.edit(user);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("msg", "修改成功");
		return map;
	}
}
