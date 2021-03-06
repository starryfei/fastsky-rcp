import com.fastsky.bean.BeanRegister;
import com.fastsky.socket.server.FastSkyServer;
import com.starry.service.impl.HelloServiceImpl;

/**
 * ClassName: Main
 * Description: 测试服务
 *
 * @author: starryfei
 * @date: 2019-01-22 17:17
 **/
public class Main {
    public static void main(String[] args){
        FastSkyServer skyServer = new FastSkyServer();
        BeanRegister.getInstance().registerBeans(HelloServiceImpl.class);
        skyServer.start();

    }
}
