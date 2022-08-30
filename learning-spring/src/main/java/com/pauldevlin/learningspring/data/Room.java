package com.pauldevlin.learningspring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ROOM_ID")
  private Long id;

  @Column(name = "NAME")
  private String name;

  @Column(name = "ROOM_NUMBER")
  private String roomNumber;

  @Column(name = "BED_INFO")
  private String bedInfo;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRoomNumber() {
    return this.roomNumber;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public String getBedInfo() {
    return this.bedInfo;
  }

  public void setBedInfo(String bedInfo) {
    this.bedInfo = bedInfo;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", name='" +
      getName() +
      "'" +
      ", roomNumber='" +
      getRoomNumber() +
      "'" +
      ", bedInfo='" +
      getBedInfo() +
      "'" +
      "}"
    );
  }
}
