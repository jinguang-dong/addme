package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.eo;
import defpackage.gb;
import defpackage.iw;
import defpackage.rnu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public TypedValue g;
    public final Rect h;
    public rnu i;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rnu rnuVar = this.i;
        if (rnuVar != null) {
            Object obj = rnuVar.a;
            eo eoVar = (eo) obj;
            iw iwVar = eoVar.m;
            if (iwVar != null) {
                iwVar.a();
            }
            if (eoVar.p != null) {
                eoVar.i.getDecorView().removeCallbacks(eoVar.q);
                if (eoVar.p.isShowing()) {
                    try {
                        ((eo) obj).p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                eoVar.p = null;
            }
            eoVar.A();
            gb gbVar = eoVar.M(0).h;
            if (gbVar != null) {
                gbVar.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
    }
}
