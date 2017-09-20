-- ���ݿ��ʼ���ű�

-- �������ݿ�
CREATE DATABASE seckill;
-- ʹ�����ݿ�
USE seckill;
-- ������ɱ����
CREATE TABLE seckill(
  `seckill_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���id',
  `name` VARCHAR(120) NOT NULL COMMENT '��Ʒ����',
  `number` INT NOT NULL COMMENT '�������',
  `start_time` TIMESTAMP NOT NULL NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '��ɱ����ʱ��',
  `end_time` TIMESTAMP NOT NULL COMMENT '��ɱ����ʱ��',
  `create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET = utf8 COMMENT = '��ɱ����';

-- ��ʼ������
INSERT INTO seckill(name, number, start_time, end_time)
  VALUES ('1000Ԫ��ɱIphone6',100,'2017-9-11 00:00:00','2017-11-13 00:00:00'),
    ('2000Ԫ��ɱIphone6s',200,'2017-9-11 00:00:00','2017-11-13 00:00:00'),
    ('3000Ԫ��ɱIphone7',300,'2017-9-11 00:00:00','2017-11-13 00:00:00'),
    ('4000Ԫ��ɱIphoneX',400,'2017-9-11 00:00:00','2017-11-13 00:00:00');

-- ��ɱ�ɹ���ϸ��
-- �û���¼��֤��ص���Ϣ
CREATE TABLE success_killed(
  `seckill_id` BIGINT NOT NULL COMMENT '��ɱ��Ʒid',
  `user_phone` BIGINT NOT NULL COMMENT '�û��ֻ���',
  `state` TINYINT NOT NULL DEFAULT -1 COMMENT '״̬��ʾ��-1����Ч��0���ɹ���1���Ѹ��2���ѷ���',
  `create_time` TIMESTAMP NOT NULL COMMENT '����ʱ��',
  PRIMARY KEY (seckill_id,user_phone), /** �������� **/
  KEY idx_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COMMENT = '��ɱ�ɹ���ϸ��';

