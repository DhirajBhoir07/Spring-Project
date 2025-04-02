package com.spring.standAloneColl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;


@Getter
@Setter
@ToString
public class Players {

    private List playerNames;
    private Map<String , Integer> accessories;


}
