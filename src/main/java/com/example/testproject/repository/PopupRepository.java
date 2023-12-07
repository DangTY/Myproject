package com.example.testproject.repository;

import com.example.testproject.entity.Popup;
import com.example.testproject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface PopupRepository extends JpaRepository<Popup, Long> {
    @Override
    ArrayList<Popup> findAll();
}
