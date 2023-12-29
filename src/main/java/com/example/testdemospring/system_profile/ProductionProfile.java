package com.example.testdemospring.system_profile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Продуктовые настройки";
    }
}