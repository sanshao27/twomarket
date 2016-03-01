// Generated code from Butter Knife. Do not modify!
package com.szcx.market.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ViewPagerTabListViewFragment$$ViewBinder<T extends com.szcx.market.fragment.ViewPagerTabListViewFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492976, "field 'scroll'");
    target.scroll = finder.castView(view, 2131492976, "field 'scroll'");
  }

  @Override public void unbind(T target) {
    target.scroll = null;
  }
}
