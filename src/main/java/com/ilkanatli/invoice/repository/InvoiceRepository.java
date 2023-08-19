package com.ilkanatli.invoice.repository;

import com.ilkanatli.invoice.db.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
    public Invoice  findByBillType(int billType);
}