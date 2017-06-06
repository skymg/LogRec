package q.dms.test;

/**
 * 1.1 创建日志业务类对象logRecServe 1.2 调用inputLog()进行日志数据采集 1.3 调用showLog()显示采集到的日志数据
 * 
 * @author sky_mg 2017年6月4日下午5:16:10 TODO
 */
public class TestLogRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个记录日志业务对象
		LogRecServe logRecServe = new LogRecServe();
		// 只有一个对象时可用这种方式创建
		// LogRec logRec = new LogRec();
		// logRec = logRecServe.inputLog();
		// logRecServe.showLog(logRec);
		System.out.println("------------------------------------------------");

		// 当有多个日志信息时,采用数组方式创建对象
		// 创建一个日志对象数组,用于存放采集的日志信息
		 LogRec[] logRecs = new LogRec[2];
		 for (int i = 0; i < logRecs.length; i++) {
		 System.out.println("第" + (i + 1) + "个日志数据采集");
		 logRecs[i] = logRecServe.inputLog();
		 }
		 // 显示日志信息
		 logRecServe.showLog(logRecs);
	}

}
