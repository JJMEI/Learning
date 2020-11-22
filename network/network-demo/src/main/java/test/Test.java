package test;


//import com.arronlong.httpclientutil.exception.HttpProcessException;

import com.mjj.demo.HttpsUtil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

//    static HCB hcb = HCB.custom();
//    static final String regrexp = "user_id=\\d+";
//
//    static HttpClient client = hcb.build();
//    static HttpConfig config = HttpConfig.custom()
//            .url("http://localhost:8010/tencent/u/notify/receiveTradePushing.json")
//            .client(client)
//            .encoding("utf-8");

    static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());


    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/letv/data/tencet_ext_not_null_tencet_uid_null.txt")));

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/meijunjie/Documents/Mango_patch_20200828.csv")));

        String line = null;
        while ((line = reader.readLine()) != null){
//            Pattern pattern = Pattern.compile(regrexp);
//            Matcher matcher = pattern.matcher(line);
//            if(matcher.find()){
//                System.out.println(matcher.group(0).split("=")[1]+",");
//            }
            final String notifyUrl = "http://10.110.154.80:8010/patch/mangoForSingle.json?profile=prod&mangoVendorNo=511708211815898872758272&superHomeVipVendorNo=511803124110985523245056&userIds=" + line;
            executorService.submit(() -> {

                try {
                    HttpsUtil.get(notifyUrl,null,1000,1000);
                } catch (NoSuchAlgorithmException | KeyStoreException | KeyManagementException | IOException e) {
                    e.printStackTrace();
                }


            });



//            config.json(line);
//
//            System.out.println(HttpClientUtil.post(config));
        }

    }
}
