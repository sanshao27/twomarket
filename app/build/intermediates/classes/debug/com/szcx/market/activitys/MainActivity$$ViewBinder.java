// Generated code from Butter Knife. Do not modify!
package com.szcx.market.activitys;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.szcx.market.activitys.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492967, "field 'view_toolbar'");
    target.view_toolbar = view;
    view = finder.findRequiredView(source, 2131492966, "field 'mToolbarView'");
    target.mToolbarView = view;
    view = finder.findRequiredView(source, 2131492968, "field 'toolbar'");
    target.toolbar = view;
    view = finder.findRequiredView(source, 2131492972, "field 'search'");
    target.search = view;
    view = finder.findRequiredView(source, 2131492962, "field 'mPager'");
    target.mPager = finder.castView(view, 2131492962, "field 'mPager'");
    view = finder.findRequiredView(source, 2131492970, "field 'title_down'");
    target.title_down = finder.castView(view, 2131492970, "field 'title_down'");
    view = finder.findRequiredView(source, 2131492965, "field 'slidingTabLayout'");
    target.slidingTabLayout = finder.castView(view, 2131492965, "field 'slidingTabLayout'");
    view = finder.findRequiredView(source, 2131492960, "field 'mInterceptionLayout'");
    target.mInterceptionLayout = finder.castView(view, 2131492960, "field 'mInterceptionLayout'");
    view = finder.findRequiredView(source, 2131492961, "field 'pager_wrapper'");
    target.pager_wrapper = finder.castView(view, 2131492961, "field 'pager_wrapper'");
  }

  @Override public void unbind(T target) {
    target.view_toolbar = null;
    target.mToolbarView = null;
    target.toolbar = null;
    target.search = null;
    target.mPager = null;
    target.title_down = null;
    target.slidingTabLayout = null;
    target.mInterceptionLayout = null;
    target.pager_wrapper = null;
  }
}
