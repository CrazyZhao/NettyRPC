import com.zbl.nettyrpc.service.OrderFundDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by Administrator on 2017/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:appcontext/app-spring-config-order.xml")
public class TradeTransferTest {
//    public  static  void  main(String [] args)
//    {
//        String traceId = UUID.randomUUID().toString().replace("-", "");
//        TradeTransferBankdetailServiceImpl bankdetailService=new TradeTransferBankdetailServiceImpl();
//        bankdetailService.getTransferBankResult();
//
//    }

    @Autowired
    private OrderFundDetailService orderFundDetailService;

    @Test
    public void Test() {
        String traceId = UUID.randomUUID().toString().replace("-", "");
        Long count = orderFundDetailService.listOrderFundDetailCount(1100l);
        System.out.println("=============" + count);
        return;
    }
}
