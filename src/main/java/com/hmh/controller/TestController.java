package com.hmh.controller;

import com.hmh.bean.UserInfo;
import com.hmh.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 62450 on 2018/5/29.
 */
@Controller
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

//    Semaphore semaphore=new Semaphore(5);

//    ExecutorService executorService= Executors.newSingleThreadExecutor();

//   public void test()throws Exception{
//       FutureTask<String> futureTask=new FutureTask<String>(new Callable<String>() {
//           @Override
//           public String call() throws Exception {
//               return null;
//           }
//       });
//       String result = futureTask.get();
//   }

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ResponseBody
    public UserInfo getUser(@RequestParam int id){
        return userService.getById(id);
    }

    @GetMapping("/down")
    public void down(HttpServletResponse response, HttpServletRequest request) throws IOException {
//        response.setCharacterEncoding("utf-8");
//        response.setContentType("multipart/form-data");
//        File file=new File("C:\\Users\\62450\\Desktop\\面试题.docx");
//        response.setHeader("Content-Disposition", "attachment;fileName=" + "test.docx");
//        BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream(file));
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(response.getOutputStream());
//        byte[] b = new byte[2048];
//        int length = 0;
//        while ((length = bufferedInputStream.read(b)) > 0) {
//            bufferedOutputStream.write(b, 0, length);
//        }
//        bufferedInputStream.close();
//        bufferedOutputStream.close();
    }

}
