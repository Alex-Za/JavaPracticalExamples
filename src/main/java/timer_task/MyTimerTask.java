package timer_task;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private Thread t;
    private Timer timer;

    public MyTimerTask(Thread t, Timer timer) {
        this.t = t;
        this.timer = timer;
    }

    @Override
    public void run() {
        if (t != null && t.isAlive()) {
            t.interrupt();
            timer.cancel();
        }
    }
}
