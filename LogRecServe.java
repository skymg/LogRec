package q.dms.test;

import java.util.Date;
import java.util.Scanner;


/**
 * 
 * @author sky_mg 2017年6月4日下午3:53:39 TODO 实现日志信息的采集显示功能
 */
public class LogRecServe {

	public LogRec inputLog() {
		Scanner scanner = new Scanner(System.in);
		// 输入ID标识
		System.out.println("请输入用户ID标识");
		// 接受键盘输入的整数
		int id = scanner.nextInt();
		// 获取系统当前时间
		Date dateNow = new Date();
		// 输入地址
		System.out.println("请输入地址");
		// 接受键盘输入地址
		String address = scanner.next();
		// 设置数据状态为采集状态
		int type = LogRec.GATHER;
		// 用户名输入
		System.out.println("请输入用户名");
		// 接受用用户名输入
		String userName = scanner.next();
		// 主机ip输入
		System.out.println("请输入主机IP");
		// 接受用户输入的主机IP地址
		String ip = scanner.next();
		// 登录状态输入 :登录状态:1=>登录,0=>登出
		System.out.println("请输入登录状态:1=>登录,0=>登出");
		// 接受输入的登录状态
		int logType = scanner.nextInt();
		// 实例化logRec对象
		LogRec logRec = new LogRec(id, dateNow, address, type, userName, ip, logType);
		
		return logRec;
		
	}

	public void showLog(LogRec... logRecs) {
		// forEach循环
		for (LogRec e : logRecs) {
			if (e != null) {
				System.out.println(e.toString());
			}
		}
	}

}
