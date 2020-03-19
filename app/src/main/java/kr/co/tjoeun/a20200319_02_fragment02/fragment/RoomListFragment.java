package kr.co.tjoeun.a20200319_02_fragment02.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200319_02_fragment02.R;
import kr.co.tjoeun.a20200319_02_fragment02.adapters.RoomAdapter;
import kr.co.tjoeun.a20200319_02_fragment02.databinding.FragmentRoomListBinding;
import kr.co.tjoeun.a20200319_02_fragment02.datas.Room;

public class RoomListFragment extends Fragment {

//    실무 : 서버에서 내려주는 방 목록을 담아두는 List
//    강의 : 코드로 직접 roomList에 방들을 추가.
    List<Room> roomList = new ArrayList<>();

//    목록을 받아서 => 하나하나의 Room -> XML에 반영해주는 adapter.
//    생성자가 context (어느화면?)를 필요로 하면, onCreate dlgndp todtjd.
//    그 전에 변수로 만들때는 null로 초기화.
    RoomAdapter adapter = null;

    FragmentRoomListBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_room_list,container,false);
        return binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//                프래그먼트의 동작 코드 => 리스트뷰 띄워주기.

//        null상태인 어댑터를 실제로 생성
//        화면 / XML이름 / 뿌려줄방이 담긴리스트 => 전달
//        getActivity() / R.Layout.room_list_item / roomList

        adapter = new RoomAdapter(getActivity(),R.layout.room_list_item,roomList);

//        Adapter클래스는 리스트뷰의 재료로서 역할을 함.
//        리스트뷰의 어댑터 => 방금만든 adapter 변수라고 명시.
        binding.roomListView.setAdapter(adapter);

//        방 목록이 비어있어서 => 아무것도 출력되지 않는다.
//        목록에 방을 여러개 추가하고, 어댑터 새로고침.

        roomList.add(new Room(5000,"서울시 은평구"));

//         어댑터에게 내용 변경이 있었다고 공지 => 새로고침.
        adapter.notifyDataSetChanged();

    }
}
