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

    private static int [] nums = new int[5];

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
            for(int i=0; i<nums.size(); i++){
                map.put(i,getQuestionByTyepID(i+1, questions));
            }
            return map;
        }
        throw new BizException("参数异常");
    }

    public static List<Question> getQuestion(Map<String,List<Integer>> countMap, Map questionMap){
        List<Question> qs = new ArrayList<>();
        if(countMap.get("difficultys") != null && countMap.get("difficultys").size()>0){
            qs.addAll(rand(countMap.get("difficultys"), 3, questionMap));
        }
        if(countMap.get("mediums") != null && countMap.get("mediums").size()>0){
            qs.addAll(rand(countMap.get("mediums"), 2, questionMap));
        }
        if(countMap.get("easys") != null && countMap.get("easys").size()>0){
            qs.addAll(rand(countMap.get("easys"), 1, questionMap));
        }
        nums = new int[5];
        return qs;
    }






    private static List<Question> rand(List<Integer> num,Integer dif, Map<Integer,Map<Integer,List<Question>>> questionMap){
        List<Question> objects = new ArrayList<>();
        for(int i=0; i<num.size(); i++) {
            if(num.get(i)>=questionMap.get(i).get(dif).size()){
                //拷贝数据
                objects.addAll(questionMap.get(i).get(dif));
                //记录剩余
                nums[i] +=num.get(i) - questionMap.get(i).get(dif).size();
            }else{
                //随机挑取数据
                for (int j=0; j<(dif==1?num.get(i):num.get(i)+nums[i]); j++){
                    objects.add(questionMap.get(i).get(dif).remove((int)(Math.random()*questionMap.get(i).get(dif).size())));
                }
            }
        }
        return objects;
    }

    private static Map<Integer, List<Question>> getQuestionByTyepID(int tid, List<Question> questions){
        Map<Integer,List<Question>> map = new HashMap();
        map.put(1,new ArrayList<>());
        map.put(2,new ArrayList<>());
        map.put(3,new ArrayList<>());

        questions.forEach(item->{
            if(item.getQt_id() == tid){
                map.get(item.getQ_difficulty()).add(item);
            }
        });
        return map;
    }
}