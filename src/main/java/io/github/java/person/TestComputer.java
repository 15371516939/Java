package io.github.java.person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author duyunjian
 * @date 2021/101
 *14
 */
public class TestComputer {
    public static void main(String[] args ) throws IOException {
        Computer pc = new Computer("Dell","Black","Inter","16G","1TB",6666.66,"开机" );
        while (true){
        //从键盘通过输入流接受数据
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请输入0-9,输入0结束1：");
        String choice = br.readLine();
        switch (choice) {
            case "1": {
                System.out.println(pc.getBand());
                break;
            }
            case "2": {
                System.out.println(pc.getPrice());
                break;

            }
            case "3": {
                pc.start();
                break;

            }
            case "4": {
                pc.off();
                break;

        }
        case "5": {
            System.out.println(pc.getCpu());
            break;
        }
        default:
        break;
    }
    if (choice.equals("0")) {
        break;
    }
        }
        }
    }


