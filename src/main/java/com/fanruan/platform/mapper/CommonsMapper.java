package com.fanruan.platform.mapper;

import com.fanruan.platform.bean.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;

/**
 * <p>TODO</p>
 *
 * @author DELk
 * @@version 1.0.0
 * @since 2020/9/28
 */
@Repository
public interface CommonsMapper {
    /**黑名单*/
    List<BlackList> getBlackList(String userCode);
    /**子管理员获取可选公司*/
    public List<UserCompany> getUserCompany(String username);
    /**信保报告审核列表*/
    List<ZhongXinBaoLog> getZxbApplyList(HashMap<String, Object> hs, Integer pageIndex, Integer pageSize,
                                        String zxbCode, String zxbCompanyName,String approveCode,String zxbInformant,String zxbApprover,Integer isSubAdmin, String operator);
    /**信保报告审核列表-条数*/
    Integer getZxbApplyListCount(Integer pageIndex,Integer pageSize,
                                String zxbCode,String zxbCompanyName,String approveCode,String zxbInformant,String zxbApprover,Integer isSubAdmin,String operator);
    /**审核不通过向OA推送消息*/
    Integer insertOAMsg(String updateBy, String approveBy);
    /**获取组织结构树的数据*/
    List<CompanyLevel> getAllCompanyLevel(@Param(value="companyCode") String companyCode);
    /**获取公司信息*/
    CompanyLevel getCompanyLevel(@Param(value="companyCode") String companyCode);
    /**判断公司是否启用   1：代表启用 */
    String getCompanyStatus(@Param(value="companyCode") String companyCode);
}
