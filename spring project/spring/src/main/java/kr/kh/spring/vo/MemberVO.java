package kr.kh.spring.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	String me_id;
	String me_pw;
	String me_email;
	Date me_birthday;
	int me_authority;
	Date me_join_time;
	String me_session_id;
	Date me_session_limit;
	boolean autoLogin;
	
	public void setMe_birthday(String me_birthday) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.me_birthday = format.parse(me_birthday);
		} catch (ParseException e) {
			this.me_birthday = null;
		}
	}
}
