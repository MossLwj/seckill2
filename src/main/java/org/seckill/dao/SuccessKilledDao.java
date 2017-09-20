package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * @param seckillId
	 * @param userPhone
	 * @return �����������=1��ʾ����ɹ���=0��ʾ����ʧ��
	 */
	int insertSuccessKilled(long seckillId, long userPhone);

	/**
	 * ͨ����ɱid��ѯSuccessKilled��Я����ɱ��Ʒʵ��
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);



}
