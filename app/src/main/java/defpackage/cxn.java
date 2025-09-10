package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxn {
    private static final cqh a = new cqh(null);

    public static final und a(cxm cxmVar) {
        cya cyaVar;
        uhf uhfVarI;
        synchronized (a) {
            cyaVar = (cya) cxmVar.fc("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (cyaVar == null) {
                try {
                    una unaVar = unr.a;
                    uhfVarI = uvw.a.i();
                } catch (IllegalStateException | ueu unused) {
                    uhfVarI = uhg.a;
                }
                cya cyaVar2 = new cya(uhfVarI.plus(new upi()));
                cxmVar.fd("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", cyaVar2);
                cyaVar = cyaVar2;
            }
        }
        return cyaVar;
    }
}
