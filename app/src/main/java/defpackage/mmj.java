package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmj {
    private static final sgv a = sgv.g("mmj");

    public static rwc a(rwc rwcVar) {
        if (!rwcVar.h()) {
            return rvk.a;
        }
        mly mlyVarA = mly.a(((Integer) rwcVar.c()).intValue());
        if (mlyVarA != mly.UNKNOWN) {
            return rwc.j(mlyVarA);
        }
        ((sgt) a.b().M(4943)).s("Unsupported tracker type");
        return rvk.a;
    }
}
