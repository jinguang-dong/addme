package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dww implements cix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dww(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uhf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uiu] */
    @Override // defpackage.cix
    public final Object a(civ civVar) {
        if (this.c != 0) {
            ?? r0 = this.a;
            civVar.a(new mb((uol) r0.get(uol.c), 20), dwa.a);
            return ukc.C(ung.j(r0), null, 1, new ahq((uiu) this.b, civVar, (uhb) null, 6), 1);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        civVar.a(new dzd(atomicBoolean, 1), dwa.a);
        this.a.execute(new as(atomicBoolean, civVar, (uif) this.b, 2));
        return ufg.a;
    }
}
