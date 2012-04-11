import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class CountDown {

	/**
	 * @param args
	 */
	long longTime;
	long currentTime;
	long distTime;
	long day,hour,minutes,seconds;
	public CountDown()
	{
		CDown();
	
	}
	public void CDown()
	{
		Timer timer = new Timer();
		JFrame jf = new JFrame();
		final JLabel jl = new JLabel();
		jf.add(jl);
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.getDefaultCloseOperation();
		timer.schedule(new TimerTask()
		{
			public void run()
		    {
				Calendar cal = Calendar.getInstance();
				cal.set(2013,3,31,0,0,0);
				//返回历元到指定时间的毫秒数
				longTime = cal.getTimeInMillis();
				currentTime = new Date().getTime();
				distTime = longTime-currentTime;
				day = ((distTime/1000)/(3600*24));
				hour = ((distTime/1000)-day*86400)/3600;
				minutes = ((distTime/1000)-day*86400-hour*3600)/60;
				seconds = ((distTime/1000)-day*86400-hour*3600-minutes*60);
				jl.setText("倒计时"+day+"天"+hour+"小时:"+minutes+"分钟："+seconds+"秒");
			
			}
		
		},0,1000);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountDown();
	}

}
