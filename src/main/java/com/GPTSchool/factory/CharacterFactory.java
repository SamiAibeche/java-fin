package com.GPTSchool.factory;

class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type) {
            case "warrior": return new Warrior();
            case "archer": return new Archer();
            case "mage": return new Mage();
            default: throw new IllegalArgumentException("Unknown type");
        }
    }
}