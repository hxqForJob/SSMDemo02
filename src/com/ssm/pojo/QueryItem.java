package com.ssm.pojo;

public class QueryItem {

		private String custName;//姓名
		private String custSource;//来源
		private String custIndustry;//行业
		private String custLevel;//级别
		
		private Integer pageSize=5;//页大小
		
		private Integer currentPage;//页码
		
		private Integer start;//分页开始

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getCustSource() {
			return custSource;
		}

		public void setCustSource(String custSource) {
			this.custSource = custSource;
		}

		public String getCustIndustry() {
			return custIndustry;
		}

		public void setCustIndustry(String custIndustry) {
			this.custIndustry = custIndustry;
		}

		public String getCustLevel() {
			return custLevel;
		}

		public void setCustLevel(String custLevel) {
			this.custLevel = custLevel;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

	

		public void setStart(Integer start) {
			this.start = start;
		}

		public Integer getCurrentPage() {
			return currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getStart() {
			return (currentPage-1)*pageSize;
		}
		
		
}
