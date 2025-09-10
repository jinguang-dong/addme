package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rsi {
    public static final rnt e = new rnt();
    private final rsi a;
    public final aaa c;
    public boolean d = false;

    public rsi(rsi rsiVar, aaa aaaVar) {
        if (rsiVar != null) {
            a.I(rsiVar.d);
        }
        this.a = rsiVar;
        this.c = aaaVar;
    }

    static rsi a(rsi rsiVar, rsi rsiVar2) {
        if (rsiVar.c()) {
            return rsiVar2;
        }
        if (rsiVar2.c()) {
            return rsiVar;
        }
        scn<rsi> scnVarH = scn.H(rsiVar, rsiVar2);
        if (scnVarH.isEmpty()) {
            return rsh.a;
        }
        if (scnVarH.size() == 1) {
            return (rsi) scnVarH.iterator().next();
        }
        int i = 0;
        for (rsi rsiVar3 : scnVarH) {
            do {
                i += rsiVar3.c.d;
                rsiVar3 = rsiVar3.a;
            } while (rsiVar3 != null);
        }
        if (i == 0) {
            return rsh.a;
        }
        aaa aaaVar = new aaa(i);
        for (rsi rsiVar4 : scnVarH) {
            do {
                int i2 = 0;
                while (true) {
                    aaa aaaVar2 = rsiVar4.c;
                    if (i2 >= aaaVar2.d) {
                        break;
                    }
                    rnt.F(aaaVar.put((rnt) aaaVar2.d(i2), aaaVar2.g(i2)) == null, "Duplicate bindings: %s", aaaVar2.d(i2));
                    i2++;
                }
                rsiVar4 = rsiVar4.a;
            } while (rsiVar4 != null);
        }
        return new rsh(null, aaaVar).b();
    }

    final rsi b() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        rsi rsiVar = this.a;
        return (rsiVar == null || !this.c.isEmpty()) ? this : rsiVar;
    }

    public final boolean c() {
        return this == rsh.a;
    }

    public final Object d(rnt rntVar) {
        rsi rsiVar;
        rnt.L(this.d);
        Object obj = this.c.get(rntVar);
        return (obj != null || (rsiVar = this.a) == null) ? obj : rsiVar.d(rntVar);
    }

    final boolean e(rnt rntVar) {
        if (this.c.containsKey(rntVar)) {
            return true;
        }
        rsi rsiVar = this.a;
        return rsiVar != null && rsiVar.e(rntVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (rsi rsiVar = this; rsiVar != null; rsiVar = rsiVar.a) {
            for (int i = 0; i < rsiVar.c.d; i++) {
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
