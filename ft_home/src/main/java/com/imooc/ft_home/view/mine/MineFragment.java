package com.imooc.ft_home.view.mine;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.imooc.ft_home.R;
import com.qihoo360.replugin.RePlugin;

public class MineFragment extends Fragment {

  private Context mContext;

  public static Fragment newInstance() {
    MineFragment fragment = new MineFragment();
    return fragment;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mContext = getActivity();
  }

  @Nullable @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    //宿主工程的LayoutInflater不能加载插件工程中的资源，需要使用插件工程的Context创建出来的LayoutInflater
    View rootView = LayoutInflater.from(RePlugin.getPluginContext()).inflate(R.layout.fragment_mine_layout, null);
    return rootView;
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    //发请求更新UI
  }
}
