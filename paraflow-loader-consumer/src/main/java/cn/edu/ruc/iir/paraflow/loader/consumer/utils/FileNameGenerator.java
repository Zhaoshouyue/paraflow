package cn.edu.ruc.iir.paraflow.loader.consumer.utils;

import java.util.concurrent.ThreadLocalRandom;

public class FileNameGenerator
{
    private FileNameGenerator()
    {}

    public static String generator(String dbName, String tblName, long beginTime, long endTime)
    {
        ConsumerConfig config = ConsumerConfig.INSTANCE();
        String hdfsWarehouse = config.getHDFSWarehouse();
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        long random = tlr.nextLong();
        return String.format("%s/%s/%s/%s-%s-%d%d%d", hdfsWarehouse, dbName, tblName, dbName, tblName, beginTime, endTime, random);
    }
}
