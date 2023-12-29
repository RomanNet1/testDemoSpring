package com.example.testdemospring.system_profile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Настройки с ДЕВ";
    }
}
