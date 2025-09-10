package defpackage;

import android.os.SystemClock;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mal {
    public boolean a;
    public final luj b;
    public final luj c;
    private final owf d;
    private final mdy f;
    private final Map e = new EnumMap(mak.class);
    private final tpc g = stn.a.m();

    public mal(mdy mdyVar, owq owqVar, luj lujVar, luj lujVar2) {
        this.f = mdyVar;
        this.d = owqVar;
        this.b = lujVar;
        this.c = lujVar2;
    }

    final void a() {
        b();
        d(mak.POPUP_SHARE_HANDLE);
        f(2);
    }

    final void b() {
        rnt.L(!this.a);
        this.a = true;
        this.e.clear();
        tpc tpcVar = this.g;
        if (tpcVar.a.C()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        tpcVar.b = tpcVar.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void c() {
        /*
            r9 = this;
            boolean r0 = r9.a
            defpackage.rnt.L(r0)
            luj r0 = r9.b
            lur r1 = defpackage.luf.aj
            java.lang.Object r1 = r0.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            tpc r2 = r9.g
            tph r3 = r2.b
            boolean r3 = r3.C()
            if (r3 != 0) goto L20
            r2.o()
        L20:
            tph r3 = r2.b
            stn r3 = (defpackage.stn) r3
            stn r4 = defpackage.stn.a
            int r4 = r3.b
            r4 = r4 | 64
            r3.b = r4
            r3.i = r1
            lur r1 = defpackage.luf.ai
            java.lang.Object r0 = r0.b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            tph r1 = r2.b
            boolean r1 = r1.C()
            if (r1 != 0) goto L45
            r2.o()
        L45:
            tph r1 = r2.b
            stn r1 = (defpackage.stn) r1
            int r3 = r1.b
            r3 = r3 | 128(0x80, float:1.8E-43)
            r1.b = r3
            r1.j = r0
            java.lang.String r0 = r1.h
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L97
            tph r0 = r2.b
            stn r0 = (defpackage.stn) r0
            int r3 = r0.e
            int r3 = defpackage.a.am(r3)
            r4 = 1
            if (r3 != 0) goto L68
            goto L6b
        L68:
            if (r3 == r4) goto L6b
            goto L97
        L6b:
            int r0 = r0.d
            int r0 = defpackage.a.ay(r0)
            if (r0 != 0) goto L75
        L73:
            r0 = r4
            goto L78
        L75:
            if (r0 == r4) goto L73
            r0 = r1
        L78:
            r0 = r0 ^ r4
            defpackage.rnt.L(r0)
            tph r0 = r2.b
            boolean r0 = r0.C()
            if (r0 != 0) goto L87
            r2.o()
        L87:
            tph r0 = r2.b
            stn r0 = (defpackage.stn) r0
            int r3 = r0.b
            r3 = r3 | r4
            r0.b = r3
            r0.c = r4
            java.lang.String r3 = r0.h
            int r0 = r0.d
            goto L9f
        L97:
            tph r0 = r2.b
            stn r0 = (defpackage.stn) r0
            int r3 = r0.d
            int r0 = r0.e
        L9f:
            mdy r3 = r9.f
            owf r0 = r9.d
            java.lang.Object r0 = r0.dL()
            nkw r0 = (defpackage.nkw) r0
            ssc r4 = r0.v
            tph r0 = r2.l()
            r7 = r0
            stn r7 = (defpackage.stn) r7
            r8 = 0
            r5 = 0
            r6 = 0
            r3.a(r4, r5, r6, r7, r8)
            r9.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mal.c():void");
    }

    final void d(mak makVar) {
        rnt.L(this.a);
        Map map = this.e;
        rnt.L(!map.containsKey(makVar));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        map.put(makVar, Long.valueOf(jElapsedRealtime));
        int iOrdinal = makVar.ordinal();
        if (iOrdinal == 1) {
            Long l = (Long) map.get(mak.POPUP_SHARE_HANDLE);
            if (l != null) {
                long jLongValue = jElapsedRealtime - l.longValue();
                tpc tpcVar = this.g;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                stn stnVar = (stn) tpcVar.b;
                stn stnVar2 = stn.a;
                stnVar.b |= 8;
                stnVar.f = (int) jLongValue;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            makVar.name();
            return;
        }
        Long l2 = (Long) map.get(mak.LAUNCH_SHARE_PANEL);
        l2.getClass();
        long jLongValue2 = jElapsedRealtime - l2.longValue();
        tpc tpcVar2 = this.g;
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        stn stnVar3 = (stn) tpcVar2.b;
        stn stnVar4 = stn.a;
        stnVar3.b |= 16;
        stnVar3.g = (int) jLongValue2;
    }

    final void e(int i) {
        rnt.L(this.a);
        tpc tpcVar = this.g;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        stn stnVar = (stn) tpcVar.b;
        stn stnVar2 = stn.a;
        stnVar.d = i - 1;
        stnVar.b |= 2;
    }

    final void f(int i) {
        rnt.L(this.a);
        tpc tpcVar = this.g;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        stn stnVar = (stn) tpcVar.b;
        stn stnVar2 = stn.a;
        stnVar.e = i - 1;
        stnVar.b |= 4;
    }
}
