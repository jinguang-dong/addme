package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jht implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ jht(fdq fdqVar, owq owqVar, fuf fufVar, hyh hyhVar, out outVar, int i) {
        this.f = i;
        this.e = fdqVar;
        this.b = owqVar;
        this.d = fufVar;
        this.c = hyhVar;
        this.a = outVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, owf] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            Object obj = this.e;
            owf owfVarA = owl.a(this.a, this.b, ((jho) obj).a);
            Object obj2 = this.c;
            paq paqVarDK = owfVarA.dK(new fun(obj2, obj, 9, null), sxo.a);
            our ourVar = (our) this.d;
            ourVar.d(paqVarDK);
            ourVar.d(new iew(obj2, 7));
            return;
        }
        if (i == 1) {
            ((fdq) this.e).j().d(this.b.dK(new fun(this.d, this.c, 1), this.a));
            return;
        }
        Object obj3 = this.d;
        if (((rwr) obj3).a) {
            Object obj4 = this.e;
            ?? r5 = this.b;
            owf owfVarC = owl.c(owl.h(this.a, new leb(6)), this.c);
            obj3.getClass();
            ((fdq) obj4).j().d(owfVarC.dK(new ksq(obj3, 11), r5));
        }
    }

    public /* synthetic */ jht(our ourVar, owf owfVar, owf owfVar2, jho jhoVar, ovx ovxVar, int i) {
        this.f = i;
        this.d = ourVar;
        this.a = owfVar;
        this.b = owfVar2;
        this.e = jhoVar;
        this.c = ovxVar;
    }

    public /* synthetic */ jht(rwr rwrVar, owf owfVar, ovx ovxVar, Executor executor, fdq fdqVar, int i) {
        this.f = i;
        this.d = rwrVar;
        this.a = owfVar;
        this.c = ovxVar;
        this.b = executor;
        this.e = fdqVar;
    }
}
