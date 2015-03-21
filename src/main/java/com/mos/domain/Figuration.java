package com.mos.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.mos.domain.DomainEnums.EntityType;


/**
 * The persistent class for the FIGURATION database table.
 * 
 */
@Entity
@NamedQuery(name="Figuration.findAll", query="SELECT f FROM Figuration f")
public class Figuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1990412421596961492L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long figurationId;

	private BigDecimal commission;

	private BigDecimal commissionAmount;

	private BigDecimal commissionType;

	private long entityId;

	@Enumerated(EnumType.STRING)
	private EntityType entityType;

	private BigDecimal fee1;

	private BigDecimal fee2;

	private BigDecimal fee3;

	private BigDecimal fee4;

	private BigDecimal fee5;

	private BigDecimal fee6;

	private BigDecimal fee7;

	private BigDecimal fee8;

	private BigDecimal fee9;

	private BigDecimal levy;

	private BigDecimal netPrice;

	private BigDecimal netProceed;

	private BigDecimal netProcessFx;

	private BigDecimal price;

	private BigDecimal principal;

	private BigDecimal quantity;

	private BigDecimal tax;

	private int tradeDate;

	public Figuration() {
	}

	public long getFigurationId() {
		return figurationId;
	}

	public void setFigurationId(long figurationId) {
		this.figurationId = figurationId;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public BigDecimal getCommissionType() {
		return commissionType;
	}

	public void setCommissionType(BigDecimal commissionType) {
		this.commissionType = commissionType;
	}

	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public BigDecimal getFee1() {
		return fee1;
	}

	public void setFee1(BigDecimal fee1) {
		this.fee1 = fee1;
	}

	public BigDecimal getFee2() {
		return fee2;
	}

	public void setFee2(BigDecimal fee2) {
		this.fee2 = fee2;
	}

	public BigDecimal getFee3() {
		return fee3;
	}

	public void setFee3(BigDecimal fee3) {
		this.fee3 = fee3;
	}

	public BigDecimal getFee4() {
		return fee4;
	}

	public void setFee4(BigDecimal fee4) {
		this.fee4 = fee4;
	}

	public BigDecimal getFee5() {
		return fee5;
	}

	public void setFee5(BigDecimal fee5) {
		this.fee5 = fee5;
	}

	public BigDecimal getFee6() {
		return fee6;
	}

	public void setFee6(BigDecimal fee6) {
		this.fee6 = fee6;
	}

	public BigDecimal getFee7() {
		return fee7;
	}

	public void setFee7(BigDecimal fee7) {
		this.fee7 = fee7;
	}

	public BigDecimal getFee8() {
		return fee8;
	}

	public void setFee8(BigDecimal fee8) {
		this.fee8 = fee8;
	}

	public BigDecimal getFee9() {
		return fee9;
	}

	public void setFee9(BigDecimal fee9) {
		this.fee9 = fee9;
	}

	public BigDecimal getLevy() {
		return levy;
	}

	public void setLevy(BigDecimal levy) {
		this.levy = levy;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public BigDecimal getNetProceed() {
		return netProceed;
	}

	public void setNetProceed(BigDecimal netProceed) {
		this.netProceed = netProceed;
	}

	public BigDecimal getNetProcessFx() {
		return netProcessFx;
	}

	public void setNetProcessFx(BigDecimal netProcessFx) {
		this.netProcessFx = netProcessFx;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public int getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(int tradeDate) {
		this.tradeDate = tradeDate;
	}

	
}