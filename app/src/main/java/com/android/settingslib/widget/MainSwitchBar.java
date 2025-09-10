package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;
import defpackage.dbi;
import defpackage.eol;
import defpackage.eom;
import defpackage.eoq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainSwitchBar extends LinearLayout implements CompoundButton.OnCheckedChangeListener {
    public final List a;
    protected TextView b;
    protected TextView c;
    protected CompoundButton d;
    private final View e;

    public MainSwitchBar(Context context) {
        this(context, null);
    }

    private final void f(boolean z) {
        this.e.setActivated(z);
    }

    public final void a(eom eomVar) {
        List list = this.a;
        if (list.contains(eomVar)) {
            return;
        }
        list.add(eomVar);
    }

    public final void b(boolean z) {
        CompoundButton compoundButton = this.d;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
        f(z);
    }

    public final void c(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(charSequence);
            this.c.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        }
    }

    public final void d(CharSequence charSequence) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean e() {
        return getVisibility() == 0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        f(z);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((eom) list.get(i)).dD(this.d, z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        eol eolVar = (eol) parcelable;
        super.onRestoreInstanceState(eolVar.getSuperState());
        this.d.setChecked(eolVar.a);
        b(eolVar.a);
        f(eolVar.a);
        setVisibility(true != eolVar.b ? 8 : 0);
        this.d.setOnCheckedChangeListener(true != eolVar.b ? null : this);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        eol eolVar = new eol(super.onSaveInstanceState());
        eolVar.a = this.d.isChecked();
        eolVar.b = e();
        return eolVar;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.d.performClick();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        TextView textView;
        super.setEnabled(z);
        this.b.setEnabled(z);
        this.d.setEnabled(z);
        View view = this.e;
        view.setEnabled(z);
        view.setActivated(this.d.isChecked());
        if (!eoq.a(getContext()) || (textView = this.c) == null) {
            return;
        }
        textView.setEnabled(z);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i, int i2) throws Exception {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
        boolean zA = eoq.a(context);
        LayoutInflater.from(context).inflate(zA ? R.layout.settingslib_expressive_main_switch_bar : R.layout.settingslib_main_switch_bar, this);
        setFocusable(true);
        setClickable(true);
        this.e = findViewById(R.id.frame);
        this.b = (TextView) findViewById(R.id.switch_text);
        if (zA) {
            this.c = (TextView) findViewById(R.id.switch_summary);
        }
        this.d = (CompoundButton) findViewById(android.R.id.switch_widget);
        a(new eom() { // from class: eok
            @Override // defpackage.eom
            public final void dD(CompoundButton compoundButton, boolean z) {
                this.a.b(z);
            }
        });
        if (this.d.getVisibility() == 0) {
            this.d.setOnCheckedChangeListener(this);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbi.g, 0, 0);
            d(typedArrayObtainStyledAttributes.getText(4));
            if (zA) {
                c(typedArrayObtainStyledAttributes.getText(7));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
