package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.cnn;
import defpackage.con;
import defpackage.gd;
import defpackage.gn;
import defpackage.jr;
import defpackage.rlc;
import defpackage.rld;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends rlc implements gn {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private gd l;
    private final cnn m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.gn
    public final gd a() {
        return this.l;
    }

    @Override // defpackage.gn
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gn
    public final void f(gd gdVar) {
        StateListDrawable stateListDrawable;
        this.l = gdVar;
        int i = gdVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != gdVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.ar.core.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = gdVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.m.e(this.j, 2048);
        }
        boolean zIsChecked = gdVar.isChecked();
        refreshDrawableState();
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(gdVar.isEnabled());
        checkedTextView.setText(gdVar.d);
        Drawable icon = gdVar.getIcon();
        if (icon != null) {
            int i2 = this.i;
            icon.setBounds(0, 0, i2, i2);
        }
        checkedTextView.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = gdVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.ar.core.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(gdVar.l);
        setTooltipText(gdVar.m);
        gd gdVar2 = this.l;
        if (gdVar2.d == null && gdVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                jr jrVar = (jr) frameLayout.getLayoutParams();
                jrVar.width = -1;
                this.k.setLayoutParams(jrVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            jr jrVar2 = (jr) frameLayout2.getLayoutParams();
            jrVar2.width = -2;
            this.k.setLayoutParams(jrVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        gd gdVar = this.l;
        if (gdVar != null && gdVar.isCheckable() && gdVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        rld rldVar = new rld(this);
        this.m = rldVar;
        r(0);
        LayoutInflater.from(context).inflate(com.google.ar.core.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.ar.core.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.ar.core.R.id.design_menu_item_text);
        this.j = checkedTextView;
        con.i(checkedTextView, rldVar);
    }
}
