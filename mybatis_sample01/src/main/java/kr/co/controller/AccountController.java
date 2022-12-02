package kr.co.controller;

import java.util.List;

import kr.co.dao.AccountDAO;
import kr.co.view.AccountView;
import kr.co.vo.AccountVO;

public class AccountController {

	public void getAccountRequest() {
		AccountDAO dao= new AccountDAO();
		AccountView view = new AccountView();
		
		List<AccountVO> data =dao.selectReqAccount();
		view.show(data);
	}
}
