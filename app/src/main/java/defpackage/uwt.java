package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwt {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public uwt(Object obj, uiv uivVar, uiv uivVar2, uiv uivVar3) {
        this.a = obj;
        this.b = uivVar;
        this.c = uivVar2;
        this.d = uivVar3;
    }

    public uwt(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4) {
        uemVar.getClass();
        this.d = uemVar;
        uemVar2.getClass();
        this.a = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        uemVar4.getClass();
        this.b = uemVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uwt(defpackage.qyk r32, defpackage.rag r33) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwt.<init>(qyk, rag):void");
    }

    public uwt(rai raiVar, rag ragVar) {
        toj tojVar;
        String str;
        rai.a.equals(raiVar);
        this.b = raiVar.c;
        this.a = raiVar.d;
        String str2 = raiVar.e;
        long j = raiVar.f;
        sfd sfdVar = sfd.a;
        sbr sbrVarJ = sbv.j(raiVar.g.size() + 3);
        for (raj rajVar : raiVar.g) {
            int i = rajVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                sbrVarJ.f(rajVar.e, Long.valueOf(i == 2 ? ((Long) rajVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                sbrVarJ.f(rajVar.e, Boolean.valueOf(i == 3 ? ((Boolean) rajVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                sbrVarJ.f(rajVar.e, Double.valueOf(i == 4 ? ((Double) rajVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = rajVar.e;
                if (i == 5) {
                    str = (String) rajVar.d;
                } else {
                    str = "";
                }
                sbrVarJ.f(str3, str);
            } else if (i3 == 4) {
                String str4 = rajVar.e;
                if (i == 6) {
                    tojVar = (toj) rajVar.d;
                } else {
                    tojVar = toj.b;
                }
                sbrVarJ.f(str4, tojVar.u());
            }
        }
        sbrVarJ.f("__phenotype_server_token", raiVar.e);
        sbrVarJ.f("__phenotype_snapshot_token", raiVar.c);
        sbrVarJ.f("__phenotype_configuration_version", Long.valueOf(raiVar.f));
        this.d = sbrVarJ.e();
        this.c = ragVar;
    }
}
