package com.google.android.apps.camera.util.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.ir;
import defpackage.nhp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GcaTextView extends ir {
    public GcaTextView(Context context) {
        super(context);
        a();
    }

    private final void a() {
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setMarqueeRepeatLimit(-1);
        postDelayed(new nhp(this, 11), 1500L);
    }

    public GcaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public GcaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
