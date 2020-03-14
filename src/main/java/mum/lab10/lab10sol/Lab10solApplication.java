package mum.lab10.lab10sol;

import mum.lab10.lab10sol.first.ArrayFlattener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Lab10solApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab10solApplication.class, args);
        int[][] arr = {{1,3},{0},{4, 5, 9}};
        ArrayFlattener arrFlat=new ArrayFlattener();
        int res[] = arrFlat.flattenArray(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
