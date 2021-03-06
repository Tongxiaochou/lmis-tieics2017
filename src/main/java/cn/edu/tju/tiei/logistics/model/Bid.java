package cn.edu.tju.tiei.logistics.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bid implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bid.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bid.waybill_id
     *
     * @mbg.generated
     */
    private String waybillId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bid.carrier_id
     *
     * @mbg.generated
     */
    private String carrierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bid.bid_time
     *
     * @mbg.generated
     */
    private Date bidTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bid.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bid
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bid.id
     *
     * @return the value of bid.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bid.id
     *
     * @param id the value for bid.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bid.waybill_id
     *
     * @return the value of bid.waybill_id
     *
     * @mbg.generated
     */
    public String getWaybillId() {
        return waybillId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bid.waybill_id
     *
     * @param waybillId the value for bid.waybill_id
     *
     * @mbg.generated
     */
    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId == null ? null : waybillId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bid.carrier_id
     *
     * @return the value of bid.carrier_id
     *
     * @mbg.generated
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bid.carrier_id
     *
     * @param carrierId the value for bid.carrier_id
     *
     * @mbg.generated
     */
    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId == null ? null : carrierId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bid.bid_time
     *
     * @return the value of bid.bid_time
     *
     * @mbg.generated
     */
    public Date getBidTime() {
        return bidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bid.bid_time
     *
     * @param bidTime the value for bid.bid_time
     *
     * @mbg.generated
     */
    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bid.price
     *
     * @return the value of bid.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bid.price
     *
     * @param price the value for bid.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bid
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Bid other = (Bid) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWaybillId() == null ? other.getWaybillId() == null : this.getWaybillId().equals(other.getWaybillId()))
            && (this.getCarrierId() == null ? other.getCarrierId() == null : this.getCarrierId().equals(other.getCarrierId()))
            && (this.getBidTime() == null ? other.getBidTime() == null : this.getBidTime().equals(other.getBidTime()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bid
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWaybillId() == null) ? 0 : getWaybillId().hashCode());
        result = prime * result + ((getCarrierId() == null) ? 0 : getCarrierId().hashCode());
        result = prime * result + ((getBidTime() == null) ? 0 : getBidTime().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bid
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", waybillId=").append(waybillId);
        sb.append(", carrierId=").append(carrierId);
        sb.append(", bidTime=").append(bidTime);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}