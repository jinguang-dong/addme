package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gpu implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gpu(fdq fdqVar, tzj tzjVar, out outVar, int i) {
        this.d = i;
        this.c = fdqVar;
        this.a = tzjVar;
        this.b = outVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, uem] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            our ourVarJ = ((fdq) this.c).j();
            got gotVar = (got) this.a.a();
            gotVar.getClass();
            ourVarJ.d(new ffy(ske.P(new fnf(gotVar, 10), this.b), 8));
            return;
        }
        if (i == 1) {
            Object obj = this.a;
            Optional optional = (Optional) obj;
            if (optional.isPresent()) {
                Object obj2 = this.c;
                Object obj3 = this.b;
                ((nqm) obj3).b((nqo) optional.get());
                ((fdq) obj2).j().d(new ffx(obj3, obj, 0));
                return;
            }
            return;
        }
        if (i == 2) {
            ((fdq) this.c).j().d(((pfl) this.b).y(((jmg) this.a).a()));
        } else {
            if (i == 3) {
                ((fdq) this.c).j().d(owb.a(this.b).dK(new jjl(this.a, 17), sxo.a));
                return;
            }
            String str = (String) this.b;
            String strConcat = "get:".concat(str);
            ?? r2 = this.c;
            r2.f(strConcat);
            Runnable runnable = (Runnable) this.a.a();
            r2.h("run:".concat(str));
            runnable.run();
            r2.g();
        }
    }

    public /* synthetic */ gpu(Optional optional, nqm nqmVar, fdq fdqVar, int i) {
        this.d = i;
        this.a = optional;
        this.b = nqmVar;
        this.c = fdqVar;
    }

    public /* synthetic */ gpu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
