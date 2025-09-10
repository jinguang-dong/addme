package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.ar.core.R;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfh {
    public final List a;
    public volatile int b;
    public volatile int c;
    public volatile int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Optional h;
    public boolean i;
    public final Object j;
    public int k;
    public imi l;
    private final nfg m;
    private final List n;
    private final List o;
    private final List p;
    private volatile View q;
    private volatile int r;
    private volatile boolean s;
    private volatile int t;
    private volatile int u;
    private volatile boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public nfh(nfg nfgVar) {
        this.t = 500;
        this.u = 500;
        this.e = false;
        this.g = true;
        this.h = Optional.empty();
        this.i = false;
        this.j = new Object();
        this.m = nfgVar;
        this.n = DesugarCollections.synchronizedList(new ArrayList());
        this.a = DesugarCollections.synchronizedList(new ArrayList());
        this.o = DesugarCollections.synchronizedList(new ArrayList());
        this.p = DesugarCollections.synchronizedList(new ArrayList());
        this.d = 0;
        this.c = 0;
        this.v = true;
        this.s = false;
        this.z = 0;
    }

    public final paq a() {
        int i;
        Object context = this.q.getContext();
        int i2 = 7;
        if ((context instanceof fdi) && ((fdi) context).b().p(gzo.aO)) {
            return new kxk(7);
        }
        this.l.getClass();
        View viewA = this.m.a(this.q.getContext());
        nfi nfiVar = new nfi(this.q);
        nfe nfeVar = new nfe(nfiVar, viewA, this.r, this.q, this.b, this.x, this.y, this.d, this.k, this.w, this.e, this.f);
        long j = this.t;
        nfk nfkVar = nfeVar.a;
        nfkVar.s = j;
        nfkVar.t = this.u;
        nfkVar.r = this.c;
        nfkVar.g = this.v;
        byte[] bArr = null;
        mzq mzqVar = new mzq(this, nfeVar, 4, bArr);
        nfeVar.c = mzqVar;
        nfkVar.h = mzqVar;
        int i3 = this.z;
        nfkVar.b.setColor(i3);
        nfkVar.c.setColor(i3);
        this.h.ifPresent(new mdw(nfeVar, 9));
        nfeVar.b = this.a;
        nfkVar.u = this.n;
        synchronized (nfiVar.d) {
            View view = (View) nfiVar.a.get();
            i = 6;
            if (!nfiVar.e && view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(nfiVar);
                viewTreeObserver.addOnScrollChangedListener(nfiVar);
                nfiVar.e = true;
                nfiVar.f = new loe(nfiVar, viewTreeObserver, i);
                nfiVar.g = new loe(nfiVar, viewTreeObserver, i2);
            }
        }
        nfiVar.c.add(new mzq(this, nfeVar, 5, bArr));
        List list = this.o;
        List list2 = nfeVar.a.d;
        list2.clear();
        list2.addAll(list);
        if (this.g) {
            nfiVar.b.add(new mzq(this, nfeVar, i, bArr));
        } else {
            View view2 = (View) nfiVar.a.get();
            if (view2 != null && view2.getVisibility() == 0) {
                b(nfeVar);
            }
        }
        return new kyc(this, nfeVar, nfiVar, 3);
    }

    public final void b(nfe nfeVar) {
        synchronized (this.j) {
            if (!this.i) {
                Iterator it = this.p.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) ((Supplier) it.next()).get()).booleanValue()) {
                    }
                }
                this.l.a(nfeVar);
            }
        }
    }

    public final void c(View view, int i) {
        this.q = view;
        this.r = 1;
        this.y = i;
    }

    public final void d(Supplier supplier) {
        this.p.add(supplier);
    }

    public final void e(Runnable runnable, Executor executor) {
        this.n.add(Pair.create(runnable, executor));
    }

    public final void f(Runnable runnable, Executor executor) {
        this.a.add(new nfd(runnable, executor, 0L));
    }

    public final void g(View view, int i) {
        this.q = view;
        this.r = 4;
        this.x = i;
    }

    public final void h() {
        this.b = 2;
    }

    public final void i(View view, int i) {
        this.q = view;
        this.r = 3;
        this.x = i;
    }

    public final void j() {
        this.z = qpt.P(this.q, R.attr.colorTertiaryContainer);
    }

    public final void k() {
        this.w = true;
    }

    public final void l() {
        this.v = true;
    }

    public final void m() {
        this.t = 400;
    }

    public final void n() {
        this.u = 300;
    }

    public final void o(View view) {
        c(view, 0);
    }

    public final void p(View view) {
        this.q = view;
        this.r = 2;
        this.y = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nfh(String str) {
        final SpannableString spannableStringValueOf = SpannableString.valueOf(str);
        this(new nfg() { // from class: nff
            @Override // defpackage.nfg
            public final View a(Context context) {
                TextView textView = new TextView(context);
                textView.setTextAppearance(R.style.Tooltip);
                textView.setText(spannableStringValueOf);
                return textView;
            }
        });
    }
}
