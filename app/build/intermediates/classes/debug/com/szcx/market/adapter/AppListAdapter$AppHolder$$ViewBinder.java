// Generated code from Butter Knife. Do not modify!
package com.szcx.market.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AppListAdapter$AppHolder$$ViewBinder<T extends com.szcx.market.adapter.AppListAdapter.AppHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492977, "field 'ivLogo'");
    target.ivLogo = finder.castView(view, 2131492977, "field 'ivLogo'");
    view = finder.findRequiredView(source, 2131492978, "field 'tvName'");
    target.tvName = finder.castView(view, 2131492978, "field 'tvName'");
    view = finder.findRequiredView(source, 2131492979, "field 'btnDownload'");
    target.btnDownload = finder.castView(view, 2131492979, "field 'btnDownload'");
    view = finder.findRequiredView(source, 2131492980, "field 'tvType'");
    target.tvType = finder.castView(view, 2131492980, "field 'tvType'");
    view = finder.findRequiredView(source, 2131492981, "field 'dowload_msg'");
    target.dowload_msg = finder.castView(view, 2131492981, "field 'dowload_msg'");
  }

  @Override public void unbind(T target) {
    target.ivLogo = null;
    target.tvName = null;
    target.btnDownload = null;
    target.tvType = null;
    target.dowload_msg = null;
  }
}
