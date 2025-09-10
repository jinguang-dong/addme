package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsh extends rsi {
    public static final rsi a;
    static final rsi b;

    static {
        rsi rsiVarB = new rsh(null, new aaa(0)).b();
        a = rsiVarB;
        rsh rshVar = new rsh(rsiVarB, new aaa());
        rnt rntVar = rsi.e;
        rnt.M(!rshVar.d, "Can't mutate after handing to trace");
        rnt.M(true ^ rshVar.e(rntVar), "Key already present");
        rshVar.c.put(rntVar, true);
        b = rshVar.b();
    }

    public rsh(rsi rsiVar, aaa aaaVar) {
        super(rsiVar, aaaVar);
    }
}
