package test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String url = "http://yuanxian.cp21.ott.cibntv.net/letv/v2/open.ldo?order_no=5820091514506651241549824&user_ip=123.125.37.228&pay_channel_id=-103&create_time=1600136588881&pay_order_no=18020200915196340489901875201&businessId=511703141887278862336&sign=652084890618f1bf5dd03ff29c8e1c6e&product_info=%5B%7B%22duration%22%3A1%2C%22product_type%22%3A%22100%22%2C%22price%22%3A1.0%2C%22product_id%22%3A%229%22%2C%22duration_type%22%3A1%7D%5D&device_type=2&success_time=1600136593000&terminal=141007&type=orderSuccessNotify&platform=0&order_name=%E8%B6%85%E7%BA%A7%E5%AE%B6%E5%BA%AD%E4%BC%9A%E5%91%981%E5%B9%B4-cibn&sku_no=5320072713942172198637568&user_id=310389133&spu_no=5220072713942256948875264&user_mac=C80E7772AC2D&pay_channel=25&cps_id=8817957578693858&vendor_no=511703141887278862336";

        String originUrl = URLDecoder.decode(url,"UTF-8");

        String pattern = "\"product_id\":\".+\"";

        Pattern matcher = Pattern.compile(pattern);

        Matcher result = matcher.matcher(originUrl);

        if(result.find()){
            System.out.println(result.group().split(",")[0].split(":")[1]);
        }

        System.out.println(originUrl);
    }
}
