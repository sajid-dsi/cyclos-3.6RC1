/*
 *
 *    This file is part of Cyclos.
 *
 *    Cyclos is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    Cyclos is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with Cyclos; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 *
 */

package nl.strohalm.cyclos.entities.tokens;

import nl.strohalm.cyclos.entities.Entity;
import nl.strohalm.cyclos.entities.accounts.transactions.Transfer;

import java.math.BigDecimal;

public class Token extends Entity {

    private String tokenId;

    private String senderMobilePhone;

    private String pin;

    private BigDecimal amount;

    private Status status;

    private Transfer transferFrom;

    private Transfer transferTo;

    @Override
    public String toString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String id) {
        this.tokenId = id;
    }

    public String getSenderMobilePhone() {
        return senderMobilePhone;
    }

    public void setSenderMobilePhone(String senderMobilePhone) {
        this.senderMobilePhone = senderMobilePhone;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Transfer getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(Transfer transferFrom) {
        this.transferFrom = transferFrom;
    }

    public Transfer getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(Transfer transferTo) {
        this.transferTo = transferTo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}