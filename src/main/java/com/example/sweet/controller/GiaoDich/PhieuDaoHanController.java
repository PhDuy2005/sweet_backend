package com.example.sweet.controller.GiaoDich;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sweet.database.repository.dto.PhieuDaoHanDTO;
import com.example.sweet.database.repository.dto.PhieuDaoHanDTO_inp;
import com.example.sweet.database.schema.GiaoDich.PhieuDaoHan;
import com.example.sweet.services.GiaoDich.PhieuDaoHanService;
import com.example.sweet.util.annotation.ApiMessage;
import com.example.sweet.util.mapper.PhieuDaoHanMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/phieu-dao-han")
public class PhieuDaoHanController {
    private final PhieuDaoHanService phieuDaoHanService;
    // private final PhieuDaoHanMapper phieuDaoHanMapper;

    public PhieuDaoHanController(PhieuDaoHanService phieuDaoHanService) {
        this.phieuDaoHanService = phieuDaoHanService;
        // this.phieuDaoHanMapper = new PhieuDaoHanMapper();
    }

    @GetMapping("/phieu-dao-han")
    @ApiMessage("Lấy các phiếu đáo hạn")
    public String getAllPhieuDaoHan() {
        return new String();
    }

    @PostMapping("/phieu-dao-han")
    @ApiMessage("Tạo phiếu đáo hạn")
    public String postMethodName(@RequestBody PhieuDaoHanDTO_inp dto) {
        // TODO: process POST request
        // PhieuDaoHan phieuDaoHan = phieuDaoHanMapper.toEntity(dto);
        this.phieuDaoHanService.handleCreatePhieuDaoHan(dto);
        return null;
    }

}
