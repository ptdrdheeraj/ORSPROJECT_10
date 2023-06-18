package com.rays.dao;

import java.util.List;

import com.rays.common.BaseDAOInt;
import com.rays.dto.MarksheetDTO;

/**
 * Marksheet DAO interface.
 * @author Dheeraj Patidar
 */
public interface MarksheetDAOInt extends BaseDAOInt<MarksheetDTO> {

	/**
	 * Get merit list
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<MarksheetDTO> getMeritList();
}
