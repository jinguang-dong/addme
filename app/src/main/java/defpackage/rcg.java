package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rcg(qoa qoaVar, rwc rwcVar, uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        this.d = qoaVar;
        this.b = rwcVar;
        this.e = uemVar;
        this.c = uemVar2;
        this.a = uemVar3;
        this.f = uemVar4;
    }

    private final rww g(final long j, final int i, final scn scnVar) {
        return rnt.y(new rww() { // from class: pge
            @Override // defpackage.rww
            public final Object fr() {
                scn scnVar2 = scnVar;
                ArrayList arrayList = new ArrayList(scnVar2.size() + 1);
                sgj sgjVarListIterator = scnVar2.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    arrayList.add(((pmg) ((phx) sgjVarListIterator.next()).e.a).b());
                }
                long j2 = j;
                int i2 = 0;
                if (j2 > 0) {
                    arrayList.add(owl.h(((pmg) this.d.d).b(), new pgc(j2, i2)));
                }
                int i3 = i;
                if (i3 > 0) {
                    arrayList.add(new owi(Long.valueOf(i3)));
                }
                return owl.h(owl.e(arrayList), new pgd(i3, 0));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, pbc] */
    private final scn h(Set set) {
        if (set.isEmpty()) {
            return sfd.a;
        }
        scl sclVar = new scl();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pej pejVar = (pej) it.next();
            Object obj = this.e;
            CaptureRequest.Key key = pejVar.a;
            if (((rcg) obj).c(key)) {
                this.f.f("Ignoring blocklisted parameter: ".concat(key.toString()));
            } else {
                sclVar.d(pejVar);
            }
        }
        return sclVar.g();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public final List a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ?? r1 = this.d;
        if (!r1.isEmpty()) {
            Object obj = this.e;
            int i = rce.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                rdv rdvVarA = ((rdw) it.next()).a((Uri) obj);
                if (rdvVarA != null) {
                    arrayList2.add(rdvVarA);
                }
            }
            rce rceVar = !arrayList2.isEmpty() ? new rce(outputStream, arrayList2) : null;
            if (rceVar != null) {
                arrayList.add(rceVar);
            }
        }
        for (rdx rdxVar : this.c) {
            arrayList.add(rdxVar.e());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final boolean b() {
        return !this.c.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pbc] */
    public final boolean c(CaptureRequest.Key key) {
        pgl pglVar;
        if (!this.d.contains(key)) {
            return false;
        }
        if (this.c.contains(key)) {
            pglVar = pgl.SESSION_BLOCKLIST;
        } else if (this.b.contains(key)) {
            pglVar = pgl.AAA_BLOCKLIST;
        } else if (this.f.contains(key)) {
            pglVar = pgl.API_BLOCKLIST;
        } else if (this.e.contains(key)) {
            pglVar = pgl.DEVICE_BLOCKLIST;
        } else {
            rnt.s(!r0.contains(key));
            pglVar = null;
        }
        pglVar.getClass();
        this.a.h("Trying to update a blocklisted parameter : " + key.getName() + ". " + pglVar.f);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, pbc] */
    public final synchronized pdv e(Set set, Set set2) {
        pgb pgbVar;
        ?? r0 = this.c;
        r0.f("createFrameStream");
        scn<peo> scnVarF = scn.F(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = this.a;
            peo peoVar = (peo) it.next();
            peoVar.getClass();
            rnt.B(((scn) ((lat) obj).b).contains(peoVar), String.valueOf(peoVar.toString()).concat(" is not available on this FrameServer."));
        }
        long jA = ((pmg) this.d).a();
        long jBo = ojl.bo(scnVarF);
        int iMin = Integer.MAX_VALUE;
        for (peo peoVar2 : scnVarF) {
            if (peoVar2 instanceof phx) {
                int i = ((phx) peoVar2).d;
                rnt.u(i > 0, "Stream capacity must be > 0", new Object[0]);
                iMin = Math.min(iMin, i);
            }
        }
        int iMin2 = (jBo > 0 || iMin != Integer.MAX_VALUE) ? Math.min(jBo > 0 ? (int) (jA / jBo) : Integer.MAX_VALUE, iMin) : -1;
        long jBo2 = ojl.bo(set);
        scl sclVar = new scl();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            peo peoVar3 = (peo) it2.next();
            if (peoVar3 instanceof phx) {
                sclVar.d((phx) peoVar3);
            }
        }
        scn scnVarG = sclVar.g();
        scn scnVarH = h(set2);
        scl sclVar2 = new scl();
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            peo peoVar4 = (peo) it3.next();
            if (peoVar4 instanceof phy) {
                sclVar2.d((phy) peoVar4);
            }
        }
        pgbVar = new pgb(scnVarF, scnVarG, sclVar2.g(), scnVarH, iMin2, g(jBo2, iMin2, scnVarG));
        r0.g();
        this.b.add(pgbVar);
        this.f.f(String.format(Locale.ROOT, "Created %-10s from %s %.2f MiB/frame%s", pgbVar, scnVarF, Double.valueOf(pgbVar.f / 1048576.0d), (iMin2 < 0 || iMin2 == Integer.MAX_VALUE) ? "" : " with " + pgbVar.e + " frames max"));
        return pgbVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean f(pdv pdvVar) {
        if (pdvVar instanceof pgb) {
            if (this.b.contains(pdvVar)) {
                return true;
            }
        }
        return false;
    }

    public rcg(rcf rcfVar) {
        this.a = rcfVar.a;
        this.b = rcfVar.b;
        this.c = rcfVar.c;
        this.d = rcfVar.d;
        this.e = rcfVar.e;
        this.f = rcfVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x002c, B:10:0x0039, B:14:0x0042, B:27:0x0069, B:32:0x0078, B:34:0x0083, B:36:0x0094, B:38:0x009f, B:43:0x00d0, B:45:0x00e6, B:37:0x009d, B:33:0x0081, B:30:0x0072, B:24:0x005f, B:26:0x0065), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x002c, B:10:0x0039, B:14:0x0042, B:27:0x0069, B:32:0x0078, B:34:0x0083, B:36:0x0094, B:38:0x009f, B:43:0x00d0, B:45:0x00e6, B:37:0x009d, B:33:0x0081, B:30:0x0072, B:24:0x005f, B:26:0x0065), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x002c, B:10:0x0039, B:14:0x0042, B:27:0x0069, B:32:0x0078, B:34:0x0083, B:36:0x0094, B:38:0x009f, B:43:0x00d0, B:45:0x00e6, B:37:0x009d, B:33:0x0081, B:30:0x0072, B:24:0x005f, B:26:0x0065), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x002c, B:10:0x0039, B:14:0x0042, B:27:0x0069, B:32:0x0078, B:34:0x0083, B:36:0x0094, B:38:0x009f, B:43:0x00d0, B:45:0x00e6, B:37:0x009d, B:33:0x0081, B:30:0x0072, B:24:0x005f, B:26:0x0065), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x002c, B:10:0x0039, B:14:0x0042, B:27:0x0069, B:32:0x0078, B:34:0x0083, B:36:0x0094, B:38:0x009f, B:43:0x00d0, B:45:0x00e6, B:37:0x009d, B:33:0x0081, B:30:0x0072, B:24:0x005f, B:26:0x0065), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, pbc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.pdv d(defpackage.peo r26, java.util.Set r27) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rcg.d(peo, java.util.Set):pdv");
    }

    public rcg(rcg rcgVar, syx syxVar, Random random, uem uemVar, uem uemVar2, uem uemVar3) {
        this.d = rcgVar;
        this.b = syxVar;
        this.f = random;
        this.e = uemVar;
        this.a = uemVar2;
        this.c = uemVar3;
    }

    public rcg(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6) {
        uemVar.getClass();
        this.f = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        this.a = uemVar4;
        uemVar5.getClass();
        this.e = uemVar5;
        uemVar6.getClass();
        this.d = uemVar6;
    }

    public rcg(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, byte[] bArr) {
        this.f = uemVar;
        this.c = uemVar2;
        this.e = uemVar3;
        this.a = uemVar4;
        uemVar5.getClass();
        this.b = uemVar5;
        uemVar6.getClass();
        this.d = uemVar6;
    }

    public rcg(lat latVar, pmg pmgVar, rcg rcgVar, pbc pbcVar, pbn pbnVar) {
        this.a = latVar;
        this.d = pmgVar;
        this.e = rcgVar;
        this.c = pbnVar;
        this.f = pbcVar.a("FrameStreamMap");
        this.b = new HashSet();
    }

    public rcg(Set set, Set set2, Set set3, Set set4, pbc pbcVar) {
        this.c = scn.F(set);
        this.b = scn.F(set2);
        this.f = scn.F(set4);
        this.e = scn.F(set3);
        this.a = pbcVar.a("ParamBlkList");
        scl sclVar = new scl();
        sclVar.j(set);
        sclVar.j(set3);
        sclVar.j(set4);
        sclVar.j(set2);
        this.d = sclVar.g();
    }
}
