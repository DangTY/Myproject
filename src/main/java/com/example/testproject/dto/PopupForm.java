package com.example.testproject.dto;

import com.example.testproject.entity.Popup;
import com.example.testproject.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class PopupForm {
    private Long popupNum;
    private Long productNum;
    private int popupCount;

    public Popup toEntity(){
        return new Popup(popupNum, productNum, popupCount);
    }
}
