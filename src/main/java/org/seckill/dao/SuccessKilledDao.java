package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的行数，=1表示插入成功，=0表示插入失败
	 */
	int insertSuccessKilled(long seckillId, long userPhone);

	/**
	 * 通过秒杀id查询SuccessKilled并携带秒杀产品实体
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);



}
