package kr.co.tjoeun.a20200319_02_fragment02.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.a20200319_02_fragment02.R;
import kr.co.tjoeun.a20200319_02_fragment02.adapters.ChickenStoreAdapter;
import kr.co.tjoeun.a20200319_02_fragment02.databinding.FragmentChickenStoreBinding;
import kr.co.tjoeun.a20200319_02_fragment02.datas.ChickenStore;

public class ChickenStoreFragment extends Fragment {
    List<ChickenStore> chickenStores = new ArrayList<>();
    ChickenStoreAdapter adapter = null;

    FragmentChickenStoreBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chicken_store,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new ChickenStoreAdapter(getActivity(),R.layout.chicken_store_list_item,chickenStores);
        binding.chickenListView.setAdapter(adapter);

        chickenStores.add(new ChickenStore("굽네치킨"));
        chickenStores.add(new ChickenStore("네네치킨"));
        chickenStores.add(new ChickenStore("BBQ"));
        chickenStores.add(new ChickenStore("BHC"));
        chickenStores.add(new ChickenStore("지코바"));
        chickenStores.add(new ChickenStore("교촌치킨"));
        chickenStores.add(new ChickenStore("호식이두마리치킨"));
        chickenStores.add(new ChickenStore("KFC"));

        adapter.notifyDataSetChanged();
    }


}
