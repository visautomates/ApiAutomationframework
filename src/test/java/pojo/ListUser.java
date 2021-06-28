package pojo;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class ListUser {
	@JsonPropertyOrder({
		
		"page",
		"per_page",
		"total",
		"total_pages",
		"data",
		"support"
		
	})
		
		
	@JsonProperty("page")
	private String page;
	@JsonProperty("per_page")
	private String per_page;
	@JsonProperty("total")
	private String total;
	@JsonProperty("total_pages")
	private String total_pages;
	@JsonProperty("data")
	private List<Data> data;
	@JsonProperty("support")
	private Support support;
	
	
	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

	
	public String getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}

	public String getPage() {
		return page;
	}
	
	public void setpage(String page) {
		
		this.page = page;
	}
	public String getper_page() {
		
		return per_page ;
	}
	
	public void setper_page(String per_page) {
		
		this.per_page = per_page;
	}
	
	public String gettotal() {
		return total;
	}
	
	public void settotal(String total ) {
		
		this.total = total;
	}
	

	

	
	

}
