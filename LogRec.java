package q.dms.test;

import java.util.Date;

/**
 * 实体类 包含用户登录的id,ip,userName,Long_in,Log_out,address,type
 * 
 * @author sky_mg 2017年6月4日下午3:07:44 
 * TODO 记录用户登录,登出信息记录
 */

public class LogRec {
	// ID标识
	private int id;
	// 时间
	private Date time;
	// 地址
	private String address;
	// 状态
	private int type;
	// 登录用户名
	private String userName;
	// 登录IP
	private String ip;
	/**
	 * 登录状态 包含LOG_IN,LOG_OUT
	 */
	private int logType;
	// LOG_IN
	public static final int LOG_IN = 1;
	// LOG_OUT
	public static final int LOG_OUT = 0;

	// 状态常量

	public static final int GATHER = 1;
	public static final int MATCH = 2;
	public static final int RECORD = 3;
	public static final int SEND = 4;
	public static final int RECEIVE = 5;
	public static final int WRITE = 6;
	public static final int SAVE = 7;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUser() {
		return userName;
	}

	public void setUser(String user) {
		this.userName = user;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLogType() {
		return logType;
	}

	public void setLogType(int logType) {
		this.logType = logType;
	}

	public LogRec(int id, Date time, String address, int type, String user, String ip, int logType) {
		super();
		this.id = id;
		this.time = time;
		this.address = address;
		this.type = type;
		this.userName = user;
		this.ip = ip;
		this.logType = logType;
	}

	public LogRec() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LogRec [id=" + id + ", time=" + time + ", address=" + address + ", type=" + type + ", user=" 
	+ userName+ ", ip=" + ip + ", logType=" + logType + "]";
	}

}
