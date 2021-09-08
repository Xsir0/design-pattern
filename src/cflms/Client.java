package cflms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Client
 * @Description
 * @Author xsir
 * @Date 2021/8/10 上午8:28
 * @Version V1.0
 */
public class Client {

    public static void main(String[] args) throws IOException {
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaDnsServer();
        DnsServer top = new TopDnsServer();
        china.setUpperServer(top);
        sh.setUpperServer(china);

        while (true){
            System.out.println("\n 输入域名");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("n")){
                return;
            }

            Recorder recorder = new Recorder();
            recorder.setDomain(domain);
            sh.update(null,recorder);
            System.out.println("-----DNS 服务器解析结果------");
            System.out.println(recorder);
        }
    }

}
