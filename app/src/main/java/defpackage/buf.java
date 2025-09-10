package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class buf {
    public final bug a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private bug i;
    public boolean b = true;
    public final Map h = new HashMap();

    public buf(bug bugVar) {
        this.a = bugVar;
    }

    public abstract int a(bwi bwiVar, bqv bqvVar);

    protected abstract long b(bwi bwiVar, long j);

    public abstract Map c(bwi bwiVar);

    public final void d(bqv bqvVar, int i, bwi bwiVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(bwiVar, jB);
                bwiVar = bwiVar.w;
                bwiVar.getClass();
                if (a.ao(bwiVar, this.a.j())) {
                    break loop0;
                }
            } while (!c(bwiVar).containsKey(bqvVar));
            float fA = a(bwiVar, bqvVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        float fIntBitsToFloat = bqvVar instanceof brn ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32));
        Map map = this.h;
        int iRound = Math.round(fIntBitsToFloat);
        if (map.containsKey(bqvVar)) {
            iRound = ((Number) bqvVar.a.a(Integer.valueOf(((Number) ske.bb(map, bqvVar)).intValue()), Integer.valueOf(iRound))).intValue();
        }
        map.put(bqvVar, Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        bug bugVar = this.a;
        bug bugVarI = bugVar.i();
        if (bugVarI == null) {
            return;
        }
        if (this.c) {
            bugVarI.n();
        } else if (this.e || this.d) {
            bugVarI.m();
        }
        if (this.f) {
            bugVar.n();
        }
        if (this.g) {
            bugVar.m();
        }
        bugVarI.h().e();
    }

    public final void f() {
        Map map = this.h;
        map.clear();
        aaw aawVar = new aaw(this, 10);
        bug bugVar = this.a;
        bugVar.k(aawVar);
        map.putAll(c(bugVar.j()));
        this.b = false;
    }

    public final void g() {
        bug bugVar;
        buf bufVarH;
        buf bufVarH2;
        if (i()) {
            bugVar = this.a;
        } else {
            bug bugVarI = this.a.i();
            if (bugVarI == null) {
                return;
            }
            bugVar = bugVarI.h().i;
            if (bugVar == null || !bugVar.h().i()) {
                bug bugVar2 = this.i;
                if (bugVar2 == null || bugVar2.h().i()) {
                    return;
                }
                bug bugVarI2 = bugVar2.i();
                if (bugVarI2 != null && (bufVarH2 = bugVarI2.h()) != null) {
                    bufVarH2.g();
                }
                bug bugVarI3 = bugVar2.i();
                bugVar = (bugVarI3 == null || (bufVarH = bugVarI3.h()) == null) ? null : bufVarH.i;
            }
        }
        this.i = bugVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
