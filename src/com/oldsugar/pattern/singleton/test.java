package com.oldsugar.pattern.singleton;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * 
 * @author Oldsugar
 *
 *	本程序为临时程序：从三区8003EMS系统获取历史事项，生成文件于中转服务器（10.124.10.4：d/xftp中）
 *	
 *	以后，变电一所获取事项，将会从信息中心（通过OGG）获取
 */
public class test extends Thread{
	
    public static void main(String[] args) {
        test writeFileThread = new test();
        writeFileThread.setName("createData2BianYi");
        writeFileThread.start();  
    }
	
//    public void run(){
//		for (int j = 0; j < 10000; j++) {
//			try {
//				System.out.println(new Date().getTime()/1000);
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//    }
	public void run() {
		File file = new File("D:/test.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			
			// 对该文件加锁
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

			FileChannel fileChannel = randomAccessFile.getChannel();
			FileLock fileLock = null;
				fileLock = fileChannel.tryLock();
				randomAccessFile.write("\\n".toString().getBytes("utf-8"));
				sleep(10000);
				
				//输出文件至变电一所
				createData2BianYi();
				
			fileLock.release();
			fileChannel.close();
			randomAccessFile.close();
		} catch (IOException e) {
			System.out.println("不能处理"+37);
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("不能处理"+40);
			e.printStackTrace();
		}
	}

	private void createData2BianYi() {
		
	}
}
