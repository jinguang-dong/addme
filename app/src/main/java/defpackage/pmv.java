package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pmv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public pmv(Context context, hcb hcbVar, hcf hcfVar) {
        this.b = swa.a;
        this.a = context;
        this.c = hcbVar;
        this.d = hcfVar;
    }

    public static final void r() {
        gzi gziVar = gzo.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, sfo] */
    private final void w(Long l, paq paqVar) {
        ((ryo) this.b).v(l, paqVar);
        this.c.remove(l);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owf] */
    private final boolean x() {
        if (!((Boolean) this.d.dL()).booleanValue()) {
            if (!((hbj) this.b).p(gzo.ba)) {
                return false;
            }
        }
        return !((Boolean) this.c.dL()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(java.lang.Object r6, java.lang.Object[] r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            r1 = r0
            pmq[] r1 = (defpackage.pmq[]) r1
            int r2 = r1.length
            int r3 = r7.length
            if (r2 != r3) goto L4a
            r2 = 0
        La:
            int r3 = r1.length
            if (r2 >= r3) goto L33
            r3 = r1[r2]
            java.lang.Class r3 = r3.b
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L1c
            r4 = r7[r2]
            boolean r4 = r4 instanceof java.lang.String
            if (r4 == 0) goto L4a
            goto L26
        L1c:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r3 != r4) goto L26
            r4 = r7[r2]
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L4a
        L26:
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r3 != r4) goto L30
            r3 = r7[r2]
            boolean r3 = r3 instanceof java.lang.Boolean
            if (r3 == 0) goto L4a
        L30:
            int r2 = r2 + 1
            goto La
        L33:
            java.lang.Object r0 = r5.d
            pmr r7 = defpackage.pmr.a(r7)
            pmo r0 = (defpackage.pmo) r0
            r0.a(r6, r7)
            java.lang.Object r5 = r5.c
            pna r5 = (defpackage.pna) r5
            pmw r5 = r5.b
            if (r5 == 0) goto L49
            r5.a()
        L49:
            return
        L4a:
            java.lang.Object r5 = r5.a
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = (java.lang.String) r5
            r1.append(r5)
            java.lang.String r5 = " has: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = " which does not match: "
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = r1.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmv.a(java.lang.Object, java.lang.Object[]):void");
    }

    public final void b(Object... objArr) {
        a(1L, objArr);
    }

    public final void c(double d, Object... objArr) {
        a(Double.valueOf(d), objArr);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Map] */
    public final List d(List list) {
        qk qkVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            phj phjVar = (phj) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = phjVar.c.iterator();
            while (it2.hasNext()) {
                pv pvVar = (pv) this.a.get((peo) it2.next());
                if (pvVar != null) {
                    arrayList2.add(new rh(pvVar.a));
                }
            }
            Set<pej> set = phjVar.b;
            set.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(ske.bq(set, 10)), 16));
            for (pej pejVar : set) {
                linkedHashMap.put(pejVar.a, pejVar.b);
            }
            phv phvVar = new phv(pdr.a(phjVar.d), this.d, (uma) this.c);
            int i = phjVar.a;
            rwc rwcVar = phjVar.e;
            if (rwcVar.h()) {
                pee peeVar = (pee) rwcVar.c();
                Object obj = peeVar.a.j().a;
                obj.getClass();
                xj xjVar = new xj((Image) obj);
                poe poeVar = peeVar.b;
                Object objEx = poeVar.ex(TotalCaptureResult.class);
                if (objEx == null) {
                    throw new IllegalStateException("Cannot unwrap input image metadata!");
                }
                String strB = poeVar.b();
                if (strB == null) {
                    throw new IllegalStateException("CameraId cannot be null!");
                }
                pp.b(strB);
                new rb(ufw.a, null, null, null, null, 62);
                qkVar = new qk(xjVar, new phm((TotalCaptureResult) objEx));
            } else {
                qkVar = null;
            }
            arrayList.add(new rb(arrayList2, linkedHashMap, ske.bj(phvVar), new rd(i), qkVar, 4));
        }
        return arrayList;
    }

    public final void e() throws pnv {
        try {
            ukc.B(new htc(this, (uhb) null, 5));
        } catch (CancellationException e) {
            throw new pnv(e);
        }
    }

    public final void f(phj phjVar) throws pco {
        try {
            ukc.B(new ve(this, phjVar, (uhb) null, 9));
        } catch (CancellationException e) {
            throw new pco(e);
        }
    }

    public final void g() throws pco {
        try {
            ukc.B(new htc(this, null, 6, null));
        } catch (CancellationException e) {
            throw new pco(e);
        }
    }

    public final void h(phj phjVar) throws pco {
        rwc rwcVar = phjVar.e;
        if (rwcVar.h()) {
            ((pee) rwcVar.c()).a.h(new phr(phjVar, this));
        } else {
            i(ske.bj(phjVar));
        }
    }

    public final void i(List list) throws pco {
        try {
            ukc.B(new crq(this, list, (uhb) null, 12));
        } catch (CancellationException e) {
            throw new pco(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uem] */
    public final pfz j(pgo pgoVar) {
        lat latVar = (lat) this.d.a();
        latVar.getClass();
        pbn pbnVar = (pbn) this.a.a();
        pbnVar.getClass();
        pbc pbcVarB = ((pba) this.b).a();
        ojl ojlVar = (ojl) this.c.a();
        ojlVar.getClass();
        return new pfz(latVar, pbnVar, pbcVarB, ojlVar, pgoVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sfo] */
    public final paq k(long j) {
        synchronized (this.a) {
            ?? r1 = this.c;
            Long lValueOf = Long.valueOf(j);
            if (!r1.contains(lValueOf)) {
                return null;
            }
            return (paq) ((ryo) this.b).b(lValueOf).get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sfo] */
    public final paq l() {
        synchronized (this.a) {
            ?? r1 = this.c;
            if (r1.isEmpty()) {
                return null;
            }
            return (paq) ((ryo) this.b).b((Long) r1.j().b()).get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sfo] */
    public final paq m() {
        synchronized (this.a) {
            ?? r1 = this.c;
            if (r1.isEmpty()) {
                return null;
            }
            Long l = (Long) r1.j().b();
            paq paqVar = (paq) ((ryo) this.b).b(l).get(0);
            w(l, paqVar);
            return paqVar;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, sed] */
    public final List n() {
        ArrayList arrayList;
        synchronized (this.a) {
            Object obj = this.b;
            arrayList = new ArrayList(((ryb) obj).b);
            Iterator itAt = ujp.at(this.c);
            long j = -1;
            while (itAt.hasNext()) {
                Long l = (Long) itAt.next();
                long jLongValue = l.longValue();
                if (j != jLongValue) {
                    arrayList.addAll(((ryo) obj).b(l));
                    j = jLongValue;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, sfo] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, nnn] */
    public final /* bridge */ /* synthetic */ void o(long j, Object obj) {
        paq paqVar = (paq) obj;
        synchronized (this.a) {
            ?? r1 = this.c;
            Long lValueOf = Long.valueOf(j);
            r1.add(lValueOf);
            Object obj2 = this.b;
            ((ryo) obj2).o(lValueOf, paqVar);
            if (!((ryo) obj2).u()) {
                while (!r1.isEmpty() && this.d.a(new sgl(r1))) {
                    Long l = (Long) r1.j().b();
                    paq paqVar2 = (paq) ((ryo) obj2).b(l).get(0);
                    w(l, paqVar2);
                    paqVar2.close();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mhq] */
    public final boolean p() {
        return ((hbj) this.b).p(gzo.aZ) && x() && !this.a.a().a(mhp.HEAT_CRITICAL);
    }

    public final boolean q() {
        return ((hbj) this.b).p(gzo.aY) && x();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, pbb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pbn] */
    public final kmr s(kmz kmzVar) {
        return new kmr(kmzVar, rvk.a, this.b, this.c, false, false, this.d, this.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, pbb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pbn] */
    public final kmr t(kmz kmzVar, kmz kmzVar2) {
        return new kmr(kmzVar, rwc.j(kmzVar2), this.b, this.c, true, false, this.d, this.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, pbb] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, pbn] */
    public final kmr u(kmz kmzVar, kmz kmzVar2) {
        return new kmr(kmzVar, rwc.j(kmzVar2), this.b, this.c, true, true, this.d, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [uiq] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, pbr] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, pbr] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(defpackage.iuh r8, defpackage.iue r9, defpackage.uiq r10, defpackage.uhb r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmv.v(iuh, iue, uiq, uhb):java.lang.Object");
    }

    public pmv(hbj hbjVar, owq owqVar, mhq mhqVar, owf owfVar) {
        this.b = hbjVar;
        this.d = owqVar;
        this.a = mhqVar;
        this.c = owfVar;
    }

    public pmv(String str, pmq[] pmqVarArr, pmw pmwVar, pmo pmoVar) {
        this.a = str;
        this.b = pmqVarArr;
        this.c = pmwVar;
        this.d = pmoVar;
    }

    public pmv(owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4) {
        this.b = owqVar;
        this.a = owqVar2;
        this.c = owqVar3;
        this.d = owqVar4;
    }

    public pmv(qpf qpfVar, SensorDirectChannel sensorDirectChannel, Sensor sensor, pkz pkzVar) {
        this.c = qpfVar;
        this.d = sensorDirectChannel;
        this.b = sensor;
        this.a = pkzVar;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, nkw nkwVar) {
        this.a = uemVar;
        this.b = uemVar2;
        this.c = uemVar3;
        this.d = nkwVar;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        this.b = uemVar;
        this.d = uemVar2;
        this.a = uemVar3;
        this.c = uemVar4;
    }

    public pmv(nnn nnnVar) {
        this.d = nnnVar;
        this.b = new ryo();
        this.c = new sgi(sel.a);
        this.a = this;
    }

    public pmv(pbn pbnVar, cxb cxbVar) {
        pbnVar.getClass();
        cxbVar.getClass();
        this.c = pbnVar;
        this.a = cxbVar;
        this.d = pbnVar.b("Lap.drop1s");
        this.b = pbnVar.b("Lap.drop3s");
    }

    public pmv(tzj tzjVar, tzj tzjVar2, tzj tzjVar3, Executor executor, pbb pbbVar, pbn pbnVar) {
        this.b = tzjVar2;
        this.c = tzjVar3;
        this.d = pbbVar;
        this.a = pbnVar;
        executor.execute(new iff(pbnVar, tzjVar, tzjVar2, tzjVar3, 3));
    }

    public pmv(vp vpVar, Map map) {
        vpVar.getClass();
        map.getClass();
        this.b = vpVar;
        this.a = map;
        AtomicLongFieldUpdater atomicLongFieldUpdater = uma.a;
        this.c = new uma(0L, umc.a);
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ukc.n(ske.aZ(ske.bq(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            uev uevVar = new uev(new rh(((pv) entry.getValue()).a), (peo) entry.getKey());
            linkedHashMap.put(uevVar.a, uevVar.b);
        }
        this.d = linkedHashMap;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, char[] cArr) {
        this.d = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        this.b = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, byte[] bArr) {
        this.b = uemVar;
        this.c = uemVar2;
        this.d = uemVar3;
        uemVar4.getClass();
        this.a = uemVar4;
    }

    public pmv(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, short[] sArr) {
        this.b = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
    }
}
