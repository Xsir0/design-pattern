package cflms;

/**
 * @ClassName SHDnsServer
 * @Description
 * @Author xsir
 * @Date 2021/8/10 上午8:26
 * @Version V1.0
 */
public class TopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
