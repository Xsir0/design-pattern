package cflms;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @ClassName DnsServer
 * @Description
 * @Author xsir
 * @Date 2021/8/10 上午8:20
 * @Version V1.0
 */
public abstract class DnsServer extends Observable implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        Recorder recorder = (Recorder) arg;

        if (isLocal(recorder)){
            recorder.setIp(genIpAddress());
        }else{
            responseFromUpperServer(recorder);
        }

        sign(recorder);
    }

    public void setUpperServer(DnsServer dnsServer){
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    private void responseFromUpperServer(Recorder recorder){
        super.setChanged();
        super.notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    private String genIpAddress(){
        Random rand = new Random();
        String address = rand.nextInt(255)+"."+rand.nextInt(255)+"."+rand.nextInt(255)+"."+rand.nextInt(255);
        return address;
    }
}
