package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import j$.lang.Iterable$EL;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgt {
    public static final /* synthetic */ int f = 0;
    private static final Bundle g = new Bundle();
    public jgs c;
    public jgs d;
    public jgs e;
    private jgs i;
    private jgs j;
    private jgs k;
    private jgs l;
    private jgs m;
    final List a = new ArrayList();
    final List b = new ArrayList();
    private final HashSet h = new HashSet();

    public static final String E(jhh jhhVar) {
        if (jhhVar instanceof fdy) {
            return jhhVar instanceof jhi ? ((jhi) jhhVar).a() : jhhVar.getClass().getName();
        }
        return null;
    }

    public static final Bundle G(jhh jhhVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String strE = E(jhhVar);
        return strE != null ? bundle.getBundle(strE) : g;
    }

    public final void A(final boolean z) {
        b(new Consumer() { // from class: jgh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void d(Object obj) {
                jhh jhhVar = (jhh) obj;
                int i = jgt.f;
                if (jhhVar instanceof jfz) {
                    ((jfz) jhhVar).l(z);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean B(final MotionEvent motionEvent) {
        return ((Boolean) a(new BiFunction() { // from class: jgg
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                jhh jhhVar = (jhh) obj;
                Boolean bool = (Boolean) obj2;
                int i = jgt.f;
                if (!bool.booleanValue() && (jhhVar instanceof jfp) && ((jfp) jhhVar).a()) {
                    return true;
                }
                return bool;
            }
        }, false)).booleanValue();
    }

    public final boolean C() {
        return ((Boolean) a(new jge(0), false)).booleanValue();
    }

    public final boolean D(final int i, final KeyEvent keyEvent) {
        return ((Boolean) a(new BiFunction() { // from class: jgc
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
            
                if (r5.i(r0, true) != false) goto L28;
             */
            @Override // java.util.function.BiFunction
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    jhh r5 = (defpackage.jhh) r5
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    int r0 = defpackage.jgt.f
                    boolean r0 = r6.booleanValue()
                    if (r0 != 0) goto L53
                    boolean r0 = r5 instanceof defpackage.itl
                    if (r0 == 0) goto L53
                    int r0 = r1
                    itl r5 = (defpackage.itl) r5
                    r1 = 22
                    r2 = 1
                    if (r0 != r1) goto L1d
                    r5.j(r2)
                    goto L4e
                L1d:
                    hbj r1 = r5.i
                    gzi r1 = defpackage.gzo.a
                    int r1 = r5.h
                    r3 = 3
                    if (r1 != r3) goto L27
                    goto L53
                L27:
                    android.view.KeyEvent r4 = r2
                    int r4 = r4.getRepeatCount()
                    if (r4 != 0) goto L32
                    r4 = 0
                    r5.g = r4
                L32:
                    int r4 = r5.h
                    r1 = 2
                    if (r4 == r1) goto L4e
                    boolean r4 = r5.g
                    if (r4 != 0) goto L4e
                    r4 = 24
                    if (r0 == r4) goto L48
                    r4 = 25
                    if (r0 == r4) goto L48
                    r4 = 27
                    if (r0 != r4) goto L53
                    r0 = r4
                L48:
                    boolean r4 = r5.i(r0, r2)
                    if (r4 == 0) goto L53
                L4e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                    return r4
                L53:
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jgc.apply(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, false)).booleanValue();
    }

    public final boolean F() {
        return ((Boolean) a(new jge(1), false)).booleanValue();
    }

    public final void H(final int i, final int i2) {
        b(new Consumer() { // from class: jgq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void d(Object obj) {
                jhh jhhVar = (jhh) obj;
                int i3 = jgt.f;
                if (jhhVar instanceof jgu) {
                    jgu jguVar = (jgu) jhhVar;
                    jguVar.f(i, i2);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final boolean I() {
        return ((Boolean) a(new jge(2), false)).booleanValue();
    }

    public final void J() {
        b(new jgf(4));
    }

    public final boolean K() {
        return ((Boolean) a(new jge(4), false)).booleanValue();
    }

    public final void L() {
        b(new irn(7));
    }

    public final boolean M(int i) {
        return ((Boolean) a(new ljn(i, 1), false)).booleanValue();
    }

    public final boolean N() {
        return ((Boolean) a(new jge(3), false)).booleanValue();
    }

    public final void O() {
        b(new irn(11));
    }

    public final boolean P() {
        return ((Boolean) a(new kqm(1), false)).booleanValue();
    }

    final Object a(BiFunction biFunction, Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return obj;
            }
            obj = biFunction.apply((jhh) list.get(i), obj);
            i++;
        }
    }

    final void b(Consumer consumer) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            consumer.d((jhh) list.get(i));
            i++;
        }
    }

    public final void c(Bundle bundle) {
        jgb jgbVar = new jgb(this, bundle, 2);
        j(jgbVar);
        this.c = jgbVar;
    }

    public final void d() {
        b(new jgf(2));
    }

    public final void e() {
        jgp jgpVar = new jgp(2);
        j(jgpVar);
        this.d = jgpVar;
    }

    public final void f(final Bundle bundle) {
        jgs jgsVar = new jgs() { // from class: jgr
            @Override // defpackage.jgs
            public final void a(jhh jhhVar) {
                if (jhhVar instanceof fdy) {
                    Bundle bundle2 = bundle;
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("PermissionsCheckerImpl.permissionsRequestCount", ((fdy) jhhVar).d.get());
                    String strE = jgt.E(jhhVar);
                    strE.getClass();
                    bundle2.putBundle(strE, bundle3);
                }
            }
        };
        j(jgsVar);
        this.e = jgsVar;
    }

    public final void g() {
        jgp jgpVar = new jgp(0);
        j(jgpVar);
        this.i = jgpVar;
    }

    public final void h() {
        i(this.i);
        b(new jgf(3));
    }

    public final void i(jgs jgsVar) {
        this.b.remove(jgsVar);
    }

    public final void j(jgs jgsVar) {
        b(new ird(jgsVar, 9));
        this.b.add(jgsVar);
    }

    public final void k(jhh jhhVar) {
        rnt.M(Looper.getMainLooper().isCurrentThread(), "addObserver must be called on the main thread.");
        String strE = E(jhhVar);
        if (strE != null) {
            HashSet hashSet = this.h;
            if (hashSet.contains(strE)) {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", strE));
            }
            hashSet.add(strE);
        }
        this.a.add(jhhVar);
        Iterable$EL.forEach(this.b, new gok(jhhVar, 6));
    }

    public final void l() {
        b(new jgf(1));
    }

    public final void m() {
        b(new irn(6));
    }

    public final void n() {
        b(new irn(5));
    }

    public final void o() {
        jgp jgpVar = new jgp(1);
        j(jgpVar);
        this.m = jgpVar;
    }

    public final void p(Configuration configuration) {
        b(new ird(configuration, 7));
    }

    public final void q() {
        i(this.k);
        i(this.j);
        i(this.e);
        i(this.c);
        b(new irn(12));
    }

    public final void r() {
        i(this.m);
        b(new irn(8));
    }

    public final void s(Intent intent) {
        b(new ird(intent, 8));
    }

    public final void t() {
        i(this.l);
        i(this.d);
        b(new irn(13));
    }

    public final void u(Bundle bundle) {
        jgb jgbVar = new jgb(this, bundle, 0);
        j(jgbVar);
        this.j = jgbVar;
    }

    public final void v() {
        jgi jgiVar = new jgi(1);
        j(jgiVar);
        this.l = jgiVar;
    }

    public final void w(int i, String[] strArr, int[] iArr) {
        b(new jgd(i, strArr, iArr, 0));
    }

    public final void x(Bundle bundle) {
        jgb jgbVar = new jgb(this, bundle, 1);
        j(jgbVar);
        this.k = jgbVar;
    }

    public final void y() {
        b(new irn(9));
    }

    public final void z() {
        b(new irn(10));
    }
}
