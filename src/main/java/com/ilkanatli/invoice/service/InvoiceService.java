package com.ilkanatli.invoice.service;

import com.ilkanatli.invoice.api.dto.InvoiceRequest;
import com.ilkanatli.invoice.api.dto.InvoiceResponse;
import com.ilkanatli.invoice.db.Invoice;

import java.util.List;

public interface InvoiceService {
    public Invoice createInvoice(InvoiceRequest invoiceRequest);
    public Invoice findInvoice(Long id);
    public InvoiceResponse getInvoiceById(Long id);
    public InvoiceResponse updateInvoice(Long id, InvoiceRequest invoiceRequest);
    public List<InvoiceResponse> getAllInvoices();
    public void deleteInvoice(Long id);
    public Invoice  findByBillType(int bill_type);

    public InvoiceResponse makePayment(int invoiceType, String memberCode, double amount);

    public InvoiceResponse inquirePayment(int invoiceType, String memberCode);
    public InvoiceResponse cancelPayment(int invoiceType, String memberCode, double amount);


}
