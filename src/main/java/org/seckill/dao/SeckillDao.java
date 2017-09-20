package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {

	/**
	 * �����Ľӿ�
	 * @param seckillId
	 * @param killTime
	 * @return ���Ӱ������=1 ,��ʾ���µ�����Ϊ1��,sql���гɹ�����������ʧ��
	 */
	int reduceNumber(long seckillId,Date killTime);

	/**
	 * ͨ����ɱ��Ʒid��ѯ��ɱ��Ʒ����
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);


	/**
	 * ����ƫ������ѯ��ɱ��Ʒ�б�
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offset,int limit);

}
