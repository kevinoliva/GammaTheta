package com.example.koliva.gammatheta;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.*;
import java.util.List;

public class DropDownAdapter extends BaseExpandableListAdapter {

    private Context cntxt;
    private LinkedHashMap<String, List<String>> brothersHashMap;
    private List<String> brothersList;

    public DropDownAdapter(Context con, LinkedHashMap<String, List<String>> hsh, List<String> lst) {
        cntxt = con;
        brothersHashMap = hsh;
        brothersList = lst;
    }

    public int getGroupCount() {
        return brothersList.size();
    }

    public int getChildrenCount(int i) {
        return brothersHashMap.get(brothersList.get(i)).size();
    }

    public Object getGroup(int i) {
        return brothersList.get(i);
    }

    public Object getChild(int parent, int child) {
        return brothersHashMap.get(brothersList.get(parent)).get(child);
    }

    public long getGroupId(int i) {
        return i;
    }

    public long getChildId(int parent, int child) {
        return child;
    }

    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean expanded, View view, ViewGroup parent) {
        String title = (String) getGroup(i);
        if (view == null) {
            LayoutInflater infl = (LayoutInflater) cntxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = infl.inflate(R.layout.parent_layout, parent, false);
        }
        TextView parentTV = (TextView) view.findViewById(R.id.parent);
        parentTV.setText(title);
        parentTV.setTextColor(Color.WHITE);
        return view;
    }

    @Override
    public View getChildView(int group, int child, boolean lastItem, View view, ViewGroup parent) {
        String title = (String) getChild(group, child);
        if (view == null) {
            LayoutInflater infl = (LayoutInflater) cntxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = infl.inflate(R.layout.child_layout, parent, false);
        }
        TextView childTV = (TextView) view.findViewById(R.id.child);
        childTV.setText(title);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
