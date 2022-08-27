package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void  test() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStationAboveMin() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxStation() {
        Radio radio = new Radio(9);
        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinStation() {
        Radio radio = new Radio(9);
        radio.setToMinStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextCurrentStation() {
        Radio radio = new Radio(9);
        radio.nextCurrentStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldZeroNextCurrentStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevCurrentStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(9);
        radio.prevCurrentStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldZeroPrevCurrentStation() {
        Radio radio = new Radio(9);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio(100);
        radio.setToMaxVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio(100);
        radio.setToMinVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(100);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void  shouldIncreaseVolumeZero() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolumeMore() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldIncreaseVolumeBorder() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldIncreaseVolumeAdd() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldZeroDecreaseVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeBorder() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}