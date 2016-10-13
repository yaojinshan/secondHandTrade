package com.blog.util;

/**
 * 分页工具类
 * @author Administrator
 *
 */
public class PageUtil {

	/**
	 * 生成分页代码
	 * 分页格式展示规则 ： 如果大于5页，即从第7页开始，展示格式为： 首页 + 上一页 + 第一页  + ... + 当前页的前一页 + 当前页  + 当前页的后一页  + ... + 尾页 
	 * @param targetUrl 目标地址
	 * @param totalNum 总记录数
	 * @param currentPage 当前页
	 * @param pageSize 每页大小
	 * @return
	 */
	public static String genPagination(String targetUrl,long totalNum,int currentPage,int pageSize,String param){
		long totalPage=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
		if(totalPage==0){
			return "未查询到数据";
		}else{
			StringBuffer pageCode=new StringBuffer();
			if(StringUtil.isEmpty(param)){
				pageCode.append("<li><a href='"+targetUrl+"?page=1'>首页</a></li>");
			}else{
				pageCode.append("<li><a href='"+targetUrl+"?page=1&"+param+"'>首页</a></li>");
			}
			if(currentPage>1){
				if(StringUtil.isEmpty(param)){
					pageCode.append("<li><a href='"+targetUrl+"?page="+(currentPage-1)+"'>上一页</a></li>");
				}else{
					pageCode.append("<li><a href='"+targetUrl+"?page="+(currentPage-1)+"&"+param+"'>上一页</a></li>");
				}
			}else{
				pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");		
			}
			for(int i=currentPage-2;i<=currentPage+2;i++){
				if(i<1||i>totalPage){
					continue;
				}
				if(i==currentPage){
					if(StringUtil.isEmpty(param)){
						pageCode.append("<li class='active'><a href='"+targetUrl+"?page=" + i + "'>" + i + "</a></li>");
					}else{
						pageCode.append("<li class='active'><a href='"+targetUrl+"?page="+i+"&"+param+"'>"+i+"</a></li>");
					}
				}else{
					if(StringUtil.isEmpty(param)){
						pageCode.append("<li><a href='"+targetUrl+"?page=" + i + "'>" + i + "</a></li>");	
					}else{
						pageCode.append("<li><a href='"+targetUrl+"?page="+i+"&"+param+"'>"+i+"</a></li>");	
					}
				}
				if(currentPage<totalPage){
					if(StringUtil.isEmpty(param)){
						pageCode.append("<li><a href='"+targetUrl+"?page="+(currentPage+1)+"'>下一页</a></li>");		
					}else{
						pageCode.append("<li><a href='"+targetUrl+"?page="+(currentPage+1)+"&"+param+"'>下一页</a></li>");		
					}
				}else{
					pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");	
				}
				if(StringUtil.isEmpty(param)){
					pageCode.append("<li><a href='"+targetUrl+"?page=" + totalPage +"'>尾页</a></li>");
				}else{
					pageCode.append("<li><a href='"+targetUrl+"?page="+totalPage+"&"+param+"'>尾页</a></li>");
				}
			}
			return pageCode.toString();
		}
	}
	
}
