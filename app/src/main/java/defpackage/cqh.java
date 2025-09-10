package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqh {
    public cqh() {
    }

    public static float a(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static cxy d(cxt cxtVar) {
        return cxtVar instanceof cvw ? ((cvw) cxtVar).getDefaultViewModelCreationExtras() : cxw.a;
    }

    public cqh(byte[] bArr) {
    }
}
