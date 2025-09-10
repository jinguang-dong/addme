package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kpm implements rww {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kpm(gno gnoVar, int i, rww rwwVar, int i2) {
        this.d = i2;
        this.b = gnoVar;
        this.a = i;
        this.c = rwwVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, rww] */
    @Override // defpackage.rww
    public final Object fr() {
        int i = this.d;
        if (i == 0) {
            boolean zE = ((ibb) this.b).e();
            int iIntValue = this.a;
            if (zE) {
                iIntValue = ((Integer) ((ovx) this.c).d).intValue();
            }
            return Integer.valueOf(iIntValue);
        }
        if (i != 1) {
            return ojl.cf((our) this.b, (String) this.c, this.a);
        }
        SystemClock.elapsedRealtime();
        String str = this.a != 1 ? "PREWARM" : "ACTIVITY";
        Object obj = this.b;
        ?? r5 = this.c;
        gno gnoVar = (gno) obj;
        pbp pbpVarA = gnoVar.a.a("Warmup:".concat(str));
        syu syuVar = (syu) r5.fr();
        ske.W(syuVar, new fsz(pbpVarA, 1), gnoVar.b);
        return syuVar;
    }

    public /* synthetic */ kpm(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
