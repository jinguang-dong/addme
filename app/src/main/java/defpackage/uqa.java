package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uqa implements upr {
    public Object a = uqk.p;
    public uml b;
    final /* synthetic */ uqi c;

    public uqa(uqi uqiVar) {
        this.c = uqiVar;
    }

    @Override // defpackage.upr
    public final void C(uvb uvbVar, int i) {
        uml umlVar = this.b;
        if (umlVar != null) {
            umlVar.C(uvbVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqa.a(uhb):java.lang.Object");
    }

    public final Object b() {
        Object obj = this.a;
        uwc uwcVar = uqk.p;
        if (obj == uwcVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = uwcVar;
        if (obj != uqk.l) {
            return obj;
        }
        throw uwb.b(this.c.m());
    }
}
