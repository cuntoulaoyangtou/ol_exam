package cn.ctlyt.exam.utils;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: exam
 * @description: 难度表
 * @author: 村头老杨头
 * @create: 2020-04-04 20:44
 */
public class QuestionUtil {
    public static Map getDefCount(int dif,List<Integer> nums){
        Map map = new HashMap();

        List<Integer> easys = new ArrayList<>();
        List<Integer> mediums = new ArrayList<>();
        List<Integer> difficultys = new ArrayList<>();
        switch (dif){
            case 0:
                for (int num : nums) {
                    easys.add(num);
                }
                break;
            case 1:
                for(int num : nums) {
                    int round = Math.round(num * 0.2f);
                    mediums.add(round);
                    easys.add(num-round);
                }
                break;
            case 2:
                for(int num : nums) {
                    int round = Math.round(num * 0.3f);
                    mediums.add(round);
                    easys.add(num-round);
                }
                break;
            case 3:
                for(int num : nums) {
                    int round = Math.round(num * 0.1f);
                    int round1 = Math.round(num * 0.2f);

                    difficultys.add(round);
                    mediums.add(round1);
                    easys.add(num-round-round1 );
                }
                break;
            case 4:
                for(int num : nums) {
                    int round = Math.round(num * 0.1f);
                    int round1 = Math.round(num * 0.3f);

                    difficultys.add(round);
                    mediums.add(round1);
                    easys.add(num-round-round1 );
                }
                break;
            case 5:
                for(int num : nums) {
                    int round = Math.round(num * 0.1f);
                    int round1 = Math.round(num * 0.4f);

                    difficultys.add(round);
                    mediums.add(round1);
                    easys.add(num-round-round1 );
                }
                break;
            case 6:
                for(int num : nums) {
                    int round = Math.round(num * 0.2f);
                    int round1 = Math.round(num * 0.4f);

                    difficultys.add(round);
                    mediums.add(round1);
                    easys.add(num-round-round1 );
                }
                break;
            case 7:
                for(int num : nums) {
                    int round = Math.round(num * 0.4f);
                    int round1 = Math.round(num * 0.3f);

                    difficultys.add(round);
                    mediums.add(round1);
                    easys.add(num-round-round1 );
                }
                break;
            case 8:
                for(int num : nums) {
                    int round = Math.round(num * 0.6f);

                    difficultys.add(round);
                    mediums.add(num-round);
                }
                break;
            case 9:
                for(int num : nums) {
                    int round = Math.round(num * 0.8f);

                    difficultys.add(round);
                    mediums.add(num-round);
                }
                break;
            case 10:
                for(int num : nums) {
                    difficultys.add(num);
                }
                break;

        }
        map.put("easys",easys);
        map.put("mediums",mediums);
        map.put("difficultys",difficultys);
        return map;
    }

    public static Map getMap(List<Integer> nums, List<Question> questions){
        if(nums != null && questions!= null){
            Map map = new HashMap();
            //单选题
            if(nums.get(0)>0){
                map.put("single",getQuestionByTyepID(1, questions));
            }
            //多选题
            if(nums.get(1)>0){
                map.put("multiple",getQuestionByTyepID(2, questions));
            }
            //判断题
            if(nums.get(2)>0){
                map.put("judge",getQuestionByTyepID(3, questions));
            }

            //填空题
            if(nums.get(3)>0){
                map.put("filling",getQuestionByTyepID(4, questions));
            }
            //简答题
            if(nums.get(4)>0){
                map.put("shortn",getQuestionByTyepID(5, questions));
            }
            return map;
        }
        throw new BizException("参数异常");
    }

    private static List<Question> getQuestionByTyepID(int tid,List<Question> questions){
        ArrayList<Question> objects = new ArrayList<>();
        questions.forEach(item->{
            if(item.getQt_id() == tid){
                objects.add(item);
            }
        });
        return objects;
    }
}