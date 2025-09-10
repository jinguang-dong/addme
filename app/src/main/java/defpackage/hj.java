package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hj extends jr {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public hj() {
        super(-2);
        this.a = false;
    }

    public hj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public hj(hj hjVar) {
        super((ViewGroup.LayoutParams) hjVar);
        this.a = hjVar.a;
    }

    public hj(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
