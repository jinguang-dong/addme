package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzu {
    public static final /* synthetic */ int a = 0;
    private static final qaq d = new qaq(qyt.a);
    private static final Object b = new Object();
    private static volatile ree c = null;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = a(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzu.a(java.io.File):boolean");
    }

    public static ren b(qxf qxfVar) {
        reb rebVarA = rec.a();
        Pattern pattern = rcl.a;
        rck rckVar = new rck(qxfVar.c);
        rckVar.d("phenotype");
        rckVar.e("all_accounts.pb");
        rebVarA.e(rckVar.a());
        rebVarA.d(qyt.a);
        rebVarA.b = rwc.j(d);
        rebVarA.c();
        rec recVarA = rebVarA.a();
        ree reeVar = c;
        if (reeVar == null) {
            synchronized (b) {
                reeVar = c;
                if (reeVar == null) {
                    rer rerVar = rer.a;
                    HashMap map = new HashMap();
                    syx syxVarB = qxfVar.b();
                    lat latVarF = qxfVar.f();
                    qsy.g(rek.a, map);
                    ree reeVar2 = new ree(syxVarB, latVarF, rerVar, map, (ret) null);
                    c = reeVar2;
                    reeVar = reeVar2;
                }
            }
        }
        return reeVar.a(recVarA);
    }
}
