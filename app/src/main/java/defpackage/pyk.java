package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pyk implements sxi {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pyk(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.b;
                if (!zBooleanValue) {
                    ((pzb) obj2).b.l(1036);
                    return ske.L(new IOException("Unable to update file group metadata"));
                }
                ?? r8 = this.c;
                if (this.a) {
                    new qev(((pzb) obj2).b, 1).b((pvc) ske.U(r8));
                }
                return ske.M((pvc) ske.U(r8));
            }
            if (i == 2) {
                rwc rwcVar = (rwc) obj;
                if (!this.a) {
                    return ske.M(rwcVar);
                }
                Object obj3 = this.b;
                Object obj4 = this.c;
                pzb pzbVar = (pzb) obj4;
                return pzbVar.q(pzbVar.d.i((pvl) obj3), new hve(obj4, rwcVar, 13));
            }
            if (i != 3) {
                return ((pzr) this.c).d.g((pvl) this.b, this.a);
            }
            pzr pzrVar = (pzr) this.b;
            if (!pzrVar.m.R()) {
                return syq.a;
            }
            Object obj5 = this.c;
            boolean z = this.a;
            pzrVar.c.l(1031);
            pzb pzbVar2 = pzrVar.d;
            return pzbVar2.r(pzbVar2.d.d(), rsx.c(new pyk(pzbVar2, z, obj5, 0)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (true) {
            Object obj6 = this.b;
            if (!it.hasNext()) {
                return qsp.N(arrayList).f(new ire(12), ((pzb) obj6).g);
            }
            final pvl pvlVar = (pvl) it.next();
            if (!pvlVar.f) {
                final ?? r3 = this.c;
                final boolean z2 = this.a;
                final pzb pzbVar3 = (pzb) obj6;
                arrayList.add(pzbVar3.r(pzbVar3.d.g(pvlVar), new sxi() { // from class: pyw
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
                    @Override // defpackage.sxi
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.syu a(java.lang.Object r10) {
                        /*
                            r9 = this;
                            pvc r10 = (defpackage.pvc) r10
                            r0 = 0
                            if (r10 == 0) goto Lcd
                            int r1 = r10.r
                            int r1 = defpackage.qsp.w(r1)
                            r2 = 1
                            if (r1 != 0) goto Lf
                            goto L13
                        Lf:
                            if (r1 == r2) goto L13
                            goto Lcd
                        L13:
                            pve r1 = r10.m
                            if (r1 != 0) goto L19
                            pve r1 = defpackage.pve.a
                        L19:
                            int r1 = r1.d
                            int r1 = defpackage.a.ax(r1)
                            r3 = 2
                            if (r1 != 0) goto L23
                            goto L27
                        L23:
                            if (r1 != r3) goto L27
                            goto Lac
                        L27:
                            pve r1 = r10.m
                            if (r1 != 0) goto L2d
                            pve r1 = defpackage.pve.a
                        L2d:
                            int r1 = r1.d
                            int r1 = defpackage.a.ax(r1)
                            r4 = 0
                            if (r1 != 0) goto L38
                        L36:
                            r2 = r4
                            goto Lac
                        L38:
                            r5 = 3
                            if (r1 != r5) goto L36
                            long r5 = defpackage.prh.q()
                            pvb r1 = r10.c
                            if (r1 != 0) goto L45
                            pvb r1 = defpackage.pvb.a
                        L45:
                            long r7 = r1.d
                            long r5 = r5 - r7
                            pve r1 = r10.m
                            if (r1 != 0) goto L4e
                            pve r1 = defpackage.pve.a
                        L4e:
                            r7 = 1000(0x3e8, double:4.94E-321)
                            long r5 = r5 / r7
                            long r7 = r1.e
                            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                            if (r1 <= 0) goto L36
                            r1 = 5
                            java.lang.Object r4 = r10.a(r1, r0)
                            tpc r4 = (defpackage.tpc) r4
                            r4.r(r10)
                            pve r10 = r10.m
                            if (r10 != 0) goto L67
                            pve r10 = defpackage.pve.a
                        L67:
                            java.lang.Object r1 = r10.a(r1, r0)
                            tpc r1 = (defpackage.tpc) r1
                            r1.r(r10)
                            tph r10 = r1.b
                            boolean r10 = r10.C()
                            if (r10 != 0) goto L7b
                            r1.o()
                        L7b:
                            tph r10 = r1.b
                            pve r10 = (defpackage.pve) r10
                            r10.d = r2
                            int r5 = r10.b
                            r3 = r3 | r5
                            r10.b = r3
                            tph r10 = r4.b
                            boolean r10 = r10.C()
                            if (r10 != 0) goto L91
                            r4.o()
                        L91:
                            tph r10 = r4.b
                            pvc r10 = (defpackage.pvc) r10
                            tph r1 = r1.l()
                            pve r1 = (defpackage.pve) r1
                            r1.getClass()
                            r10.m = r1
                            int r1 = r10.b
                            r1 = r1 | 2048(0x800, float:2.87E-42)
                            r10.b = r1
                            tph r10 = r4.l()
                            pvc r10 = (defpackage.pvc) r10
                        Lac:
                            boolean r1 = r2
                            java.lang.String r3 = r10.d
                            int r3 = defpackage.qbu.a
                            if (r1 != 0) goto Lbc
                            if (r2 == 0) goto Lb7
                            goto Lbc
                        Lb7:
                            syu r9 = defpackage.ske.M(r0)
                            return r9
                        Lbc:
                            pve r10 = r10.m
                            if (r10 != 0) goto Lc2
                            pve r10 = defpackage.pve.a
                        Lc2:
                            sxi r0 = r4
                            pvl r1 = r3
                            pzb r9 = r1
                            syu r9 = r9.e(r1, r10, r0)
                            return r9
                        Lcd:
                            syu r9 = defpackage.ske.M(r0)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.pyw.a(java.lang.Object):syu");
                    }
                }));
            }
        }
    }

    public /* synthetic */ pyk(pzb pzbVar, boolean z, pvl pvlVar, int i) {
        this.d = i;
        this.c = pzbVar;
        this.a = z;
        this.b = pvlVar;
    }

    public /* synthetic */ pyk(pzr pzrVar, pvl pvlVar, boolean z, int i) {
        this.d = i;
        this.c = pzrVar;
        this.b = pvlVar;
        this.a = z;
    }
}
