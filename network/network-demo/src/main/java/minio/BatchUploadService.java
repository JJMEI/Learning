package minio;

import io.minio.errors.InvalidEndpointException;
import io.minio.errors.InvalidPortException;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BatchUploadService {



    @Test
    public void batchUpload() throws InvalidPortException, InvalidEndpointException, InterruptedException {
        MinioFileService minioFileService = new MinioFileService();

        List<File>  fileList = new ArrayList<>();

        findFile(new File("/Users/meijunjie/Documents/letv/filestore"),fileList);

        for(File file : fileList){
            String objectName = file.getAbsolutePath().replace("/Users/meijunjie/Documents/","");

            String contentType = null;

            if(objectName.endsWith("txt")){
                contentType = "text/plain";
            }else if(objectName.endsWith("apk")){
                contentType = "application/vnd.android.package-archive";
            }

            minioFileService.uploadFile(file,"cms",objectName,contentType);
            Thread.sleep(100);
        }


    }



    public void findFile(File file, List<File> fileList){
        File[] files = file.listFiles();

        for (File a : files){
            if(a.isFile()){
                fileList.add(a);
            }else {
                findFile(a,fileList);
            }
        }
    }

}
