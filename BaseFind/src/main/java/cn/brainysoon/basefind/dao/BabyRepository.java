package cn.brainysoon.basefind.dao;

import cn.brainysoon.basefind.Model.Baby;

import java.util.List;

/**
 * Created by brainy on 17-6-2.
 */
public interface BabyRepository {

    /**
     * 插入宝贝
     */
    String INSERT_BABY = "INSERT INTO baby VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    /**
     * 根据半径来查找
     */
    String QUERY_BABY_BASE_LONG_LAT_CIRCLE = "SELECT * FROM baby WHERE (BabyLong-?)*(BabyLong-?)+(BabyLat-?)*(BabyLat-?)<=? AND BabySlead>0";

    /**
     * @param baby
     * @return
     */
    int insertBaby(Baby baby);

    /**
     * @param Long
     * @param Lat
     * @param Circle
     * @return
     */
    List<Baby> queryBabyByLongLatAndCircle(Double Long, Double Lat, Double Circle);
}