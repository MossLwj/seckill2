package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

	/**
	 * 减库存的接口
	 * @param seckillId
	 * @param killTime
	 * @return 如果影响行数=1 ,表示更新的行数为1行,sql运行成功；否则运行失败
	 */
	int reduceNumber(long seckillId,Date killTime);

	/**
	 * 通过秒杀商品id查询秒杀商品对象
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);


	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offset,int limit);

}
