package pl.com.pt4q.nlp;

class ExecutionTimeMeasurer {

    private static Long startTime;
    private static Long stopTime;

    private static ExecutionTimeMeasurer measurer;

    private ExecutionTimeMeasurer() {
    }

    public static ExecutionTimeMeasurer getInstance(){
        if (measurer == null)
            measurer = new ExecutionTimeMeasurer();

        return measurer;
    }

    public void start(){
        startTime = new Long(System.nanoTime());
    }

    private Long stop(){
        return System.nanoTime() - startTime;
    }

    public void stopToNanos(){
        System.out.println(stop().toString());
    }

    public void stopToMillis(){
        Long executionTime = stop();
        Double millis = Double.valueOf(executionTime/1000000);
        System.out.println("Execution time: " + millis.toString() + "ms");
    }

}
