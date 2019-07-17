package www.yy.main.cases;


import www.yy.main.annotation.Benchmark;
import www.yy.main.annotation.Case;
import www.yy.main.annotation.Measurement;
import www.yy.main.annotation.WarmUp;

/**
 * @Author : YangY
 * @Description :   cases这个包专门用来存放测试用例
 * @Time : Created in 20:36 2019/7/12
 */
@Measurement(iterations = 100,group = 5)
public class StringContactCase implements Case {

    @Benchmark
    //@Measurement(iterations = 100,group = 8)
    @WarmUp(iterations = 5)
    public  void contactAdd() {
        String s = "";
        for(int i=0; i<10; i++) {
            s += "a";
        }
    }

    @Benchmark
    //@Measurement(iterations = 100,group = 8)
    @WarmUp(iterations = 5)
    public void contactStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<10; i++) {
            stringBuilder.append("a");
        }
    }

}
