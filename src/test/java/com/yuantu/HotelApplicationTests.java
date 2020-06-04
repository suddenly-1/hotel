package com.yuantu;

import com.yuantu.bl.user.AccountService;
import com.yuantu.data.hotel.RoomMapper;
import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.Room;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HotelApplicationTests {

    @Autowired
    RoomMapper roomMapper;

  /*  @Test
    public void getRoomMapper() {

        Room room = new Room();
        room.setRooms(66);
        room.setPrice(66.6);
        roomMapper.updateRoomInfo(room,"大床房",1);

    }*/
}
