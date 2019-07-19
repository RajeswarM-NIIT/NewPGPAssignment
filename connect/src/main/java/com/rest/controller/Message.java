package com.rest.controller;

public class Message {
	private String msgtype, msgbody;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Message(String mt, String mb) {
		msgtype=mt;
		msgbody=mb;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getMsgbody() {
		return msgbody;
	}

	public void setMsgbody(String msgbody) {
		this.msgbody = msgbody;
	}
	
}
