package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfi {
    private static final CoroutineExceptionHandler c = new cfh(CoroutineExceptionHandler.c);
    public final cey a;
    public und b;

    public cfi() {
        this(null, 3);
    }

    public /* synthetic */ cfi(cey ceyVar, int i) {
        ceyVar = (i & 1) != 0 ? new cey() : ceyVar;
        uhg uhgVar = uhg.a;
        this.a = ceyVar;
        uhf uhfVarPlus = c.plus(cgr.a).plus(uhgVar);
        uhgVar.get(uol.c);
        this.b = ung.j(uhfVarPlus.plus(new upi()));
    }
}
