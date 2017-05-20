package tech.zafrani.pubgapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import tech.zafrani.pubgapp.PUBGApplication;
import tech.zafrani.pubgapp.R;
import tech.zafrani.pubgapp.adapters.ItemTabAdapter;

public class ItemFragment extends BaseFragment {

    public static String TAG = ItemFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_item, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.fragment_item_viewpager);
        viewPager.setAdapter(new ItemTabAdapter(getActivity(), getChildFragmentManager(), PUBGApplication.getInstance().getItems().getCategories()));
        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.fragment_item_tablayout);
        tabLayout.setupWithViewPager(viewPager);


    }


}
