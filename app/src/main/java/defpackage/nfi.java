package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfi implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, paq {
    public final AtomicReference a;
    private final List h = DesugarCollections.synchronizedList(new ArrayList());
    private final Handler j = new Handler();
    public paq f = new kxk(8);
    public paq g = new kxk(9);
    private final AtomicInteger i = new AtomicInteger(-1);
    public final Object d = new Object();
    public final List b = DesugarCollections.synchronizedList(new ArrayList());
    public final List c = DesugarCollections.synchronizedList(new ArrayList());
    public boolean e = false;

    public nfi(View view) {
        this.a = new AtomicReference(view);
    }

    public final void a() {
        synchronized (this.d) {
            View view = (View) this.a.get();
            if (this.e && view != null) {
                this.f.close();
                this.g.close();
                this.f = new kxk(10);
                this.g = new kxk(11);
                this.e = false;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        a();
        this.b.clear();
        this.c.clear();
        this.h.clear();
        this.a.set(null);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int andSet;
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            if (!view.isShown()) {
                return;
            } else {
                visibility = 0;
            }
        }
        if (visibility == 4) {
            if (view.isShown()) {
                return;
            } else {
                visibility = 4;
            }
        }
        if ((visibility == 8 && view.isShown()) || (andSet = this.i.getAndSet(visibility)) == visibility) {
            return;
        }
        if (visibility == 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } else if (andSet >= 0) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        AtomicReference atomicReference = this.a;
        if (((View) atomicReference.get()) == null) {
            return;
        }
        View view = (View) atomicReference.get();
        if (view != null && view.getParent() != null) {
            if (view.getParent().getChildVisibleRect(view, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()), new Point())) {
                Handler handler = this.j;
                handler.removeCallbacksAndMessages(null);
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    handler.postDelayed((Runnable) it.next(), 500L);
                }
                return;
            }
        }
        this.j.removeCallbacksAndMessages(null);
    }
}
