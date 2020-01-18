package com.eb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lol.comm.Action;
import com.lol.comm.ForwardAction;

public class EBInsertAction implements Action {

	@Override
	public ForwardAction execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ForwardAction forward=new ForwardAction();
		forward.setForward(true);
		forward.setUrl("/main.jsp?page=calBoard/CALInsert.jsp");
		
		return forward;
	}

}
