package test.mapper;

import test.model.Link;

public interface LinkMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(Link record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Link record);

    /**
     *
     * @mbggenerated
     */
    Link selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Link record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Link record);
}