
package com.sinosure.exchange.edi.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sinosure.exchange.edi.po.ArrayOfQuotaApplyBackInfo;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quotaApplyBackInfoList" type="{http://po.edi.exchange.sinosure.com}ArrayOfQuotaApplyBackInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quotaApplyBackInfoList"
})
@XmlRootElement(name = "doQuota_BackApply")
public class DoQuotaBackApply {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfQuotaApplyBackInfo quotaApplyBackInfoList;

    /**
     * 获取quotaApplyBackInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotaApplyBackInfo }
     *     
     */
    public ArrayOfQuotaApplyBackInfo getQuotaApplyBackInfoList() {
        return quotaApplyBackInfoList;
    }

    /**
     * 设置quotaApplyBackInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotaApplyBackInfo }
     *     
     */
    public void setQuotaApplyBackInfoList(ArrayOfQuotaApplyBackInfo value) {
        this.quotaApplyBackInfoList = value;
    }

}
