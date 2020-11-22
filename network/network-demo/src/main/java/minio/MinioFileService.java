package minio;


import io.minio.MinioClient;
import io.minio.errors.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


public class MinioFileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MinioFileService.class);

    private  String minioAccessUrl = "http://10.122.148.144:9000";

    private  String minioAccessKey = "RRQAMC2VFaoxqK7a";

    private  String minioSecretKey = "PYZFtQr9MRLEf4HDurVKRmgWbThCZwFo";



    private  MinioClient minioClient = null;

    public MinioFileService() throws InvalidPortException, InvalidEndpointException {
        minioClient = new MinioClient(minioAccessUrl,minioAccessKey,minioSecretKey);
    }


    /**
     *
     * @param file
     * @param bucketName
     * @param objectName
     * @param contentType
     */
    public void uploadFile(File file, String bucketName, String objectName, String contentType){

        try{
            if(minioClient.bucketExists(bucketName) && file.exists() && file.isFile()){
                minioClient.putObject(bucketName,objectName,new FileInputStream(file),contentType);
            }
        } catch (XmlPullParserException | InternalException | NoResponseException | IOException | ErrorResponseException | InvalidKeyException | InsufficientDataException | NoSuchAlgorithmException | InvalidBucketNameException | InvalidArgumentException e) {
            LOGGER.error("上传minio失败， bucketName={},objectName={}",bucketName,objectName);
        }

    }



    public InputStream download(String bucketName, String objectName){
        try{
            if(minioClient.bucketExists(bucketName)){
                return minioClient.getObject(bucketName,objectName);
            }
        } catch (XmlPullParserException | InvalidBucketNameException | NoSuchAlgorithmException | InsufficientDataException | InvalidKeyException | ErrorResponseException | IOException | NoResponseException | InternalException | InvalidArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }



}
