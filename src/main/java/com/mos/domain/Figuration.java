package com.mos.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FIGURATION database table.
 * 
 */
@Entity
@NamedQuery(name="Figuration.findAll", query="SELECT f FROM Figuration f")
public class Figuration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private long figurationid;

	private BigDecimal commission;

	private BigDecimal commissionamount;

	private BigDecimal commissiontype;

	private BigDecimal entityid;

	private String entitytype;

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

	private BigDecimal netprice;

	private BigDecimal netproceed;

	private BigDecimal netprocessfx;

	private BigDecimal price;

	private BigDecimal principal;

	private BigDecimal quantity;

	private BigDecimal tax;

	private BigDecimal tradedate;

	public Figuration() {
	}

	public long getFigurationid() {
		return this.figurationid;
	}

	public void setFigurationid(long figurationid) {
		this.figurationid = figurationid;
	}

	public BigDecimal getCommission() {
		return this.commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getCommissionamount() {
		return this.commissionamount;
	}

	public void setCommissionamount(BigDecimal commissionamount) {
		this.commissionamount = commissionamount;
	}

	public BigDecimal getCommissiontype() {
		return this.commissiontype;
	}

	public void setCommissiontype(BigDecimal commissiontype) {
		this.commissiontype = commissiontype;
	}

	public BigDecimal getEntityid() {
		return this.entityid;
	}

	public void setEntityid(BigDecimal entityid) {
		this.entityid = entityid;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public BigDecimal getFee1() {
		return this.fee1;
	}

	public void setFee1(BigDecimal fee1) {
		this.fee1 = fee1;
	}

	public BigDecimal getFee2() {
		return this.fee2;
	}

	public void setFee2(BigDecimal fee2) {
		this.fee2 = fee2;
	}

	public BigDecimal getFee3() {
		return this.fee3;
	}

	public void setFee3(BigDecimal fee3) {
		this.fee3 = fee3;
	}

	public BigDecimal getFee4() {
		return this.fee4;
	}

	public void setFee4(BigDecimal fee4) {
		this.fee4 = fee4;
	}

	public BigDecimal getFee5() {
		return this.fee5;
	}

	public void setFee5(BigDecimal fee5) {
		this.fee5 = fee5;
	}

	public BigDecimal getFee6() {
		return this.fee6;
	}

	public void setFee6(BigDecimal fee6) {
		this.fee6 = fee6;
	}

	public BigDecimal getFee7() {
		return this.fee7;
	}

	public void setFee7(BigDecimal fee7) {
		this.fee7 = fee7;
	}

	public BigDecimal getFee8() {
		return this.fee8;
	}

	public void setFee8(BigDecimal fee8) {
		this.fee8 = fee8;
	}

	public BigDecimal getFee9() {
		return this.fee9;
	}

	public void setFee9(BigDecimal fee9) {
		this.fee9 = fee9;
	}

	public BigDecimal getLevy() {
		return this.levy;
	}

	public void setLevy(BigDecimal levy) {
		this.levy = levy;
	}

	public BigDecimal getNetprice() {
		return this.netprice;
	}

	public void setNetprice(BigDecimal netprice) {
		this.netprice = netprice;
	}

	public BigDecimal getNetproceed() {
		return this.netproceed;
	}

	public void setNetproceed(BigDecimal netproceed) {
		this.netproceed = netproceed;
	}

	public BigDecimal getNetprocessfx() {
		return this.netprocessfx;
	}

	public void setNetprocessfx(BigDecimal netprocessfx) {
		this.netprocessfx = netprocessfx;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getTradedate() {
		return this.tradedate;
	}

	public void setTradedate(BigDecimal tradedate) {
		this.tradedate = tradedate;
	}

}