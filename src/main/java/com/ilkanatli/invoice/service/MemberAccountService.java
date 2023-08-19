package com.ilkanatli.invoice.service;

import com.ilkanatli.invoice.api.dto.MemberAccountRequest;
import com.ilkanatli.invoice.db.MemberAccount;
import com.ilkanatli.invoice.api.dto.MemberAccountResponse;

import java.util.List;

public interface MemberAccountService {
    public MemberAccount createMemberAccount(MemberAccountRequest memberAccountRequest);
    public MemberAccount findMemberAccount(Long id);
    public MemberAccountResponse getMemberAccountById(Long id);
    public MemberAccountResponse updateMemberAccount(Long id, MemberAccountRequest memberAccountRequest);
    public List<MemberAccountResponse> getAllMemberAccounts();
    public void deleteMemberAccount(Long id);

    MemberAccount findByCode(String code);

    public MemberAccountResponse getMemberCode(String code);


}
