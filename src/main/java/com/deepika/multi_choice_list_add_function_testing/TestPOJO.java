package com.deepika.multi_choice_list_add_function_testing;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TestPOJO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String strVal;
	private java.util.List<Integer> list1 = new java.util.ArrayList<Integer>();
	private java.util.List<Integer> list2 = new java.util.ArrayList<Integer>();
	private java.util.List<Integer> list3 = new java.util.ArrayList<Integer>();

	private java.util.List<java.lang.String> l1;

	private java.util.List<java.lang.String> l2;

	public java.lang.String getStrVal() {
		return this.strVal;
	}

	public void setStrVal(java.lang.String strVal) {
		this.strVal = strVal;
	}

	public java.util.List<Integer> getList1() {
		return list1;
	}

	public void setList1(Integer val) {
		this.list1.add(val);
	}

	public java.util.List<Integer> getList2() {
		return list2;
	}

	public void setList2(Integer val) {
		this.list2.add(val);
	}

	public java.util.List<Integer> getList3() {
		return list3;
	}

	public void setList3(Integer val) {
		this.list3.add(val);
	}

	public java.util.List<java.lang.String> getL1() {
		return this.l1;
	}

	public void setL1(java.util.List<java.lang.String> l1) {
		this.l1 = l1;
	}

	public java.util.List<java.lang.String> getL2() {
		return this.l2;
	}

	public void setL2(java.util.List<java.lang.String> l2) {
		this.l2 = l2;
	}

	public TestPOJO() {
	}

	public TestPOJO(java.lang.String strVal,
			java.util.List<java.lang.Integer> list1,
			java.util.List<java.lang.Integer> list2,
			java.util.List<java.lang.Integer> list3,
			java.util.List<java.lang.String> l1,
			java.util.List<java.lang.String> l2) {
		this.strVal = strVal;
		this.list1 = list1;
		this.list2 = list2;
		this.list3 = list3;
		this.l1 = l1;
		this.l2 = l2;
	}

}