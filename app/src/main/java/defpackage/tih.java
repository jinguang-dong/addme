package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tih {
    static final int b;
    static final int c;
    static final int d;
    final List a;
    private final ThreadLocal e;
    private final ConcurrentMap f;
    private final tjb g;
    private final tkg h;

    static {
        tib tibVar = tib.a;
        b = 1;
        c = 1;
        d = 2;
        try {
            Class.forName("tqr");
        } catch (ClassNotFoundException unused) {
        }
    }

    public tih() {
        tjd tjdVar = tjd.a;
        int i = b;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        List list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        int i2 = c;
        int i3 = d;
        List list4 = Collections.EMPTY_LIST;
        this.e = new ThreadLocal();
        this.f = new ConcurrentHashMap();
        tjb tjbVar = new tjb(map, list4);
        this.g = tjbVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tma.U);
        arrayList.add(i2 == 1 ? tkn.a : new tkm(0));
        arrayList.add(tjdVar);
        arrayList.addAll(list3);
        arrayList.add(tma.A);
        arrayList.add(tma.m);
        arrayList.add(tma.g);
        arrayList.add(tma.i);
        arrayList.add(tma.k);
        tiv tivVar = tma.t;
        arrayList.add(new tlq(Long.TYPE, Long.class, tivVar, 1, null));
        arrayList.add(new tlq(Double.TYPE, Double.class, new tic(), 1, null));
        arrayList.add(new tlq(Float.TYPE, Float.class, new tid(), 1, null));
        arrayList.add(i3 == 2 ? tkl.a : tkl.c(i3));
        arrayList.add(tma.o);
        arrayList.add(tma.q);
        arrayList.add(new tls(AtomicLong.class, new tie(tivVar).b(), 1));
        arrayList.add(new tls(AtomicLongArray.class, new tif(tivVar).b(), 1));
        arrayList.add(tma.s);
        arrayList.add(tma.v);
        arrayList.add(tma.C);
        arrayList.add(tma.E);
        arrayList.add(new tls(BigDecimal.class, tma.x, 1));
        arrayList.add(new tls(BigInteger.class, tma.y, 1));
        arrayList.add(new tls(tjj.class, tma.z, 1));
        arrayList.add(tma.G);
        arrayList.add(tma.I);
        arrayList.add(tma.M);
        arrayList.add(tma.O);
        arrayList.add(tma.S);
        arrayList.add(tma.K);
        arrayList.add(tma.d);
        arrayList.add(tkd.a);
        arrayList.add(tma.Q);
        if (tmj.a) {
            arrayList.add(tmj.c);
            arrayList.add(tmj.b);
            arrayList.add(tmj.d);
        }
        arrayList.add(tka.a);
        arrayList.add(tma.b);
        arrayList.add(new tkj(tjbVar, 1));
        arrayList.add(new tkj(tjbVar, 0));
        tkg tkgVar = new tkg(tjbVar);
        this.h = tkgVar;
        arrayList.add(tkgVar);
        arrayList.add(tma.V);
        arrayList.add(new tku(tjbVar, i, tjdVar, tkgVar, list4));
        this.a = DesugarCollections.unmodifiableList(arrayList);
    }

    public final tiv a(tmk tmkVar) {
        boolean z;
        tiv tivVar = (tiv) this.f.get(tmkVar);
        if (tivVar != null) {
            return tivVar;
        }
        ThreadLocal threadLocal = this.e;
        Map map = (Map) threadLocal.get();
        boolean z2 = false;
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            tiv tivVar2 = (tiv) map.get(tmkVar);
            if (tivVar2 != null) {
                return tivVar2;
            }
            z = false;
        }
        try {
            tig tigVar = new tig();
            map.put(tmkVar, tigVar);
            Iterator it = this.a.iterator();
            tiv tivVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                tivVarA = ((tiw) it.next()).a(this, tmkVar);
                if (tivVarA != null) {
                    if (tigVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    tigVar.a = tivVarA;
                    map.put(tmkVar, tivVarA);
                }
            }
            if (z) {
                this.e.remove();
                z2 = true;
            }
            if (tivVarA == null) {
                throw new IllegalArgumentException("GSON (2.12.1) cannot handle ".concat(tmkVar.toString()));
            }
            if (z2) {
                this.f.putAll(map);
            }
            return tivVarA;
        } catch (Throwable th) {
            if (z) {
                this.e.remove();
            }
            throw th;
        }
    }

    public final tiv b(Class cls) {
        return a(new tmk(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tiv c(defpackage.tiw r5, defpackage.tmk r6) {
        /*
            r4 = this;
            tiw r0 = defpackage.tkg.a
            if (r5 != r0) goto L5
            goto L36
        L5:
            tkg r0 = r4.h
            java.lang.Class r1 = r6.a
            java.util.concurrent.ConcurrentMap r2 = r0.c
            java.lang.Object r2 = r2.get(r1)
            tiw r2 = (defpackage.tiw) r2
            if (r2 == 0) goto L16
            if (r2 != r5) goto L38
            goto L36
        L16:
            tix r2 = defpackage.tkg.d(r1)
            if (r2 == 0) goto L38
            java.lang.Class r2 = r2.a()
            java.lang.Class<tiw> r3 = defpackage.tiw.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L38
            tjb r3 = r0.b
            java.lang.Object r2 = defpackage.tkg.e(r3, r2)
            tiw r2 = (defpackage.tiw) r2
            tiw r0 = r0.c(r1, r2)
            if (r0 != r5) goto L38
        L36:
            tkg r5 = r4.h
        L38:
            java.util.List r0 = r4.a
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            tiw r2 = (defpackage.tiw) r2
            if (r1 != 0) goto L51
            if (r2 != r5) goto L3f
            r1 = 1
            goto L3f
        L51:
            tiv r2 = r2.a(r4, r6)
            if (r2 == 0) goto L3f
            return r2
        L58:
            if (r1 != 0) goto L5f
            tiv r4 = r4.a(r6)
            return r4
        L5f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "GSON cannot serialize or deserialize "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tih.c(tiw, tmk):tiv");
    }

    public final String toString() {
        tjb tjbVar = this.g;
        return "{serializeNulls:false,factories:" + String.valueOf(this.a) + ",instanceCreators:" + tjbVar.toString() + "}";
    }
}
