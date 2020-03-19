package kr.co.tjoeun.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.tjoeun.a20200319_02_fragment02.R;
import kr.co.tjoeun.a20200319_02_fragment02.datas.Room;



public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext; // 어느 화면에서 어댑터를 쓰는지 보관.
    List<Room> mList; // (액티비티에서 보내주는) 방 목록을 보관하는 변수.
    LayoutInflater inflater; // (XML => 객체화) 담당 클래스.

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inflater = LayoutInflater.from(mContext);
    }

//        getView : 각각의 줄을 그려주는 메쏘드.
//          목록 : 0 ~ 9까지 있다? => 0번그릴때 실행, 1번 그릴때 실행..
//          실행될때마다 몇번 줄을 그리러 오는건지 : position 에 담겨있음.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView; // 한 줄이라는 의미를 강화 : 변수 이름 변경

//        row : 한 줄이 없다? => 새로 XML => Java로 그려줘야함. (inflate).
//        리스트뷰의 재활용성(이론)에서 다시 설명.
        if (row == null) {
            row = inflater.inflate(R.layout.room_list_item, null);
        }
        return row; // row변수에 담긴 XML을 화면에 뿌려줘라! 결과로 선정.
    }
}

