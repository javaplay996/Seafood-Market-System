package com.dao;

import com.entity.MiaoshashangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MiaoshashangpinVO;
import com.entity.view.MiaoshashangpinView;


/**
 * 秒杀商品
 * 
 * @author 
 * @email 
 * @date 2023-03-08 09:39:22
 */
public interface MiaoshashangpinDao extends BaseMapper<MiaoshashangpinEntity> {
	
	List<MiaoshashangpinVO> selectListVO(@Param("ew") Wrapper<MiaoshashangpinEntity> wrapper);
	
	MiaoshashangpinVO selectVO(@Param("ew") Wrapper<MiaoshashangpinEntity> wrapper);
	
	List<MiaoshashangpinView> selectListView(@Param("ew") Wrapper<MiaoshashangpinEntity> wrapper);

	List<MiaoshashangpinView> selectListView(Pagination page,@Param("ew") Wrapper<MiaoshashangpinEntity> wrapper);
	
	MiaoshashangpinView selectView(@Param("ew") Wrapper<MiaoshashangpinEntity> wrapper);
	

}
