package com.google.android.apps.camera.ui.wirers;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import defpackage.nkk;
import defpackage.noy;
import defpackage.nqe;
import defpackage.nql;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class PreviewOverlay extends View {
    public GestureDetector a;
    public View.OnTouchListener b;
    public boolean c;
    public boolean d;
    public noy e;
    private final int[] f;

    public PreviewOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[]{0, 0};
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        noy noyVar;
        nql nqlVar;
        int i;
        if (this.c) {
            if (!this.d || (noyVar = this.e) == null) {
                GestureDetector gestureDetector = this.a;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
                View.OnTouchListener onTouchListener = this.b;
                if (onTouchListener != null) {
                    onTouchListener.onTouch(this, motionEvent);
                }
            } else if (!((nkk) noyVar.b).a.a(motionEvent)) {
                Object obj = noyVar.a;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    ((nql) obj).e.a(new PointF(motionEvent.getX(), motionEvent.getY()));
                } else if (actionMasked == 1) {
                    nql nqlVar2 = (nql) obj;
                    nqlVar2.a().b();
                    nqlVar2.e.b();
                    nqlVar2.m = 0.0f;
                    nqlVar2.l = 0.0f;
                    nqlVar2.p = 1;
                    nqlVar2.j = false;
                    nqlVar2.k = false;
                    nqlVar2.n = 0;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        nqlVar = (nql) obj;
                        i = nqlVar.n + 1;
                    } else if (actionMasked == 6) {
                        nqlVar = (nql) obj;
                        i = nqlVar.n - 1;
                    }
                    nqlVar.n = i;
                } else {
                    nql nqlVar3 = (nql) obj;
                    nqlVar3.a().c();
                    (nqlVar3.k ? nqlVar3.e : nqe.y).c();
                    nqlVar3.n = 0;
                }
                nql nqlVar4 = (nql) obj;
                if (nqlVar4.j) {
                    nqlVar4.d.onTouchEvent(motionEvent);
                } else if (nqlVar4.p != 1 || nqlVar4.k) {
                    nqlVar4.c.onTouchEvent(motionEvent);
                } else {
                    nqlVar4.d.onTouchEvent(motionEvent);
                    nqlVar4.c.onTouchEvent(motionEvent);
                }
            }
        }
        return true;
    }
}
