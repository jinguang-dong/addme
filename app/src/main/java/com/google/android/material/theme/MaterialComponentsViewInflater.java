package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.hm;
import defpackage.ho;
import defpackage.hx;
import defpackage.ir;
import defpackage.rjw;
import defpackage.rnf;
import defpackage.rpw;
import defpackage.rpz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final hm a(Context context, AttributeSet attributeSet) {
        return new rpw(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ho c(Context context, AttributeSet attributeSet) {
        return new rjw(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final hx d(Context context, AttributeSet attributeSet) {
        return new rnf(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ir e(Context context, AttributeSet attributeSet) {
        return new rpz(context, attributeSet);
    }
}
