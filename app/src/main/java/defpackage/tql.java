package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tql {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public tql() {
        throw null;
    }

    public static tql g(Executor executor) {
        return new tql(executor, new qcq());
    }

    public final Ctry a() {
        return ((tpg) this.c).b;
    }

    public final void b(Object obj) {
        if (((tpg) this.c).a() != trz.ENUM) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu c(String str, syu syuVar) {
        int i = qbu.a;
        return ((qaq) this.c).i(new qcp(this, str, syuVar, 0), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu d(String str) {
        int i = qbu.a;
        return ((qaq) this.c).h(new fsu(this, str, 8, null), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu e(String str) {
        int i = qbu.a;
        return ((qaq) this.c).h(new fsu(this, str, 9, null), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu f(String str) {
        int i = qbu.a;
        return ((qaq) this.c).i(new pwe(this, str, 7), this.a);
    }

    public tql(pzb pzbVar, pzc pzcVar, qbq qbqVar, Executor executor) {
        this.b = pzbVar;
        this.c = pzcVar;
        this.d = qbqVar;
        this.a = executor;
    }

    public tql(qaq qaqVar, uem uemVar, uem uemVar2, uem uemVar3) {
        this.b = qaqVar;
        this.a = uemVar;
        this.d = uemVar2;
        this.c = uemVar3;
    }

    public tql(Ctry ctry, Object obj, Ctry ctry2, Object obj2) {
        this.c = ctry;
        this.a = obj;
        this.d = ctry2;
        this.b = obj2;
    }

    public tql(Executor executor, qcr qcrVar) {
        this.c = new qaq((byte[]) null);
        this.d = new HashMap();
        this.a = executor;
        this.b = qcrVar;
    }

    public tql(tqr tqrVar, Object obj, tqr tqrVar2, tpg tpgVar) {
        if (tqrVar != null) {
            if (tpgVar.b == Ctry.MESSAGE && tqrVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.d = tqrVar;
            this.b = obj;
            this.a = tqrVar2;
            this.c = tpgVar;
            return;
        }
        throw new IllegalArgumentException("Null containingTypeDefaultInstance");
    }
}
