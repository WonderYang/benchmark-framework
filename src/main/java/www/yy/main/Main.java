package www.yy.main;

import www.yy.main.annotation.Case;
import www.yy.main.annotation.Measurement;
import www.yy.main.annotation.WarmUp;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * @Author : YangY
 * @Description :
 * @Time : Created in 19:15 2019/7/12
 */
@Measurement(iterations = 100,group = 10)
public class Main {
    public static void main(String[] args) throws Exception{

        List<Case> caseList = CaseRunner.InitCase();
        CaseRunner caseRunner = new CaseRunner();
        for(Case bCase: caseList) {
            caseRunner.runCase(bCase);
        }
    }

}
