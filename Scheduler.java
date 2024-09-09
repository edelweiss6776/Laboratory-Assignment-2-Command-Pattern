public class Scheduler {
    public void scheduleTask(Command command, Date time) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                command.execute();
            }
        }, time);
    }
}
