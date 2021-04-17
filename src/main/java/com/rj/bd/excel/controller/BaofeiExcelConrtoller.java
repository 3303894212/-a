package com.rj.bd.excel.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rj.bd.baofei.entity.BaoFei;
import com.rj.bd.baofei.service.IBaoFeiService;
import com.rj.bd.utils.DateUtils;
import com.rj.bd.utils.EDownLoadUtils;

@CrossOrigin
@ResponseBody
@Controller
@RequestMapping("/excel")
public class BaofeiExcelConrtoller {

	
	@Autowired
	IBaoFeiService baofeiService;
	
	@RequestMapping("/baofeiExcel")
	public void weixiuExcel(HttpServletResponse response) throws IOException {
		
	       //创建工作簿  HSSFWorkbook -- 2003
	       Workbook wb = new XSSFWorkbook(); //2007版本
	       //创建表单sheet
	       Sheet sheet = wb.createSheet("test");
	       Row row = sheet.createRow(0);
	       
	       List<BaoFei> list = baofeiService.queryAll();
	       
	     //创建行对象  参数：索引（从0开始）
	       //Row row = sheet.createRow(2);
	       
	       Cell[] cell = new XSSFCell[6];
	       System.out.println("cell");
	       for (int i = 0; i < cell.length; i++) {
	    	  
				// 吧每一列放到数组中
				cell[i] = row.createCell(i);
			}
	       
			// 这个是写的标题头
			// 给第0行第一列元素赋值
			cell[0].setCellValue("id");
			// 给第0行第二列元素赋值
			cell[1].setCellValue("资产名");
			
			// 给第0行第三列元素赋值
			cell[2].setCellValue("资产价格");
			// 给第0行第四列元素赋值
			cell[3].setCellValue("报废时间");
			// 给第0行第五列元素赋值
			cell[4].setCellValue("报废描述");
			
			//创建单元格对象  参数：索引（从0开始）
		      // Cell cell = row.createCell(2);
			for (int i = 0; i < list.size(); i++) {
				// 查询的每个对象的数据
				BaoFei  baoFei= list.get(i);
				// 设置要插入的行为i+1(就是标题下的第一行)
				Row row1 = sheet.createRow(i + 1);
				// 创建存放列的数组
				Cell[] cell2 = new XSSFCell[6];
				for (int j = 0; j < cell.length; j++) {
					// 吧每一列放到数组中
					cell2[j] = row1.createCell(j);
				}
				cell2[0].setCellValue(baoFei.getBf_id());
				cell2[1].setCellValue(baoFei.getZc_name()); 
				cell2[2].setCellValue(baoFei.getZc_jiage());
				cell2[3].setCellValue(baoFei.getBf_date());
				cell2[4].setCellValue(baoFei.getBf_des());
			}
			
	       //向单元格中写入内容
	       //cell.setCellValue("双手合十");
	       

			
	   	ByteArrayOutputStream os = new ByteArrayOutputStream();

			wb.write(os);
			DateUtils dateUtils=new DateUtils();
			String timeStamp = dateUtils.timeStamp();
			String riqi= dateUtils.timeStamp2Date(timeStamp, "yyyy-MM-dd");
			
	       new EDownLoadUtils().download(os, response, riqi+"报废.xlsx");
	       System.out.println("导出成功");
	}
}
