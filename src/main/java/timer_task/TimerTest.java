package timer_task;

import java.util.Timer;

public class TimerTest {
    public void test() {
        Thread t = new Thread(new LongRunningTask());
        Timer timer = new Timer();

        timer.schedule(new MyTimerTask(t, timer), 10000);
        t.start();
    }
}
