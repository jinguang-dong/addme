package defpackage;

import com.google.android.apps.camera.stats.timing.TimingSession;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mex implements TimingSession {
    public static final mew j = mew.a().a();
    public static final mew k;
    private Runnable a;
    public final pqm l;
    public long m;
    public final long[] n;
    public final Enum[] o;
    public final qpt p;

    static {
        mev mevVarA = mew.a();
        mevVarA.c(false);
        mevVarA.b(false);
        k = mevVarA.a();
    }

    protected mex(pqm pqmVar, qpt qptVar, long j2, Enum[] enumArr) {
        this.l = pqmVar;
        this.p = qptVar;
        this.m = j2;
        this.o = enumArr;
        long[] jArr = new long[enumArr.length];
        this.n = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.android.apps.camera.stats.timing.TimingSession
    public final void b(Runnable runnable) {
        this.a = runnable;
    }

    protected void c() {
        Arrays.fill(this.n, -1L);
        this.m = this.l.a();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final long i(Enum r1) {
        return this.n[r1.ordinal()];
    }

    public final void j(Enum r3) {
        k(r3, this.l.a());
    }

    public final void k(Enum r2, long j2) {
        m(r2, j2, j);
    }

    public final void l(Enum r3, mew mewVar) {
        m(r3, this.l.a(), mewVar);
    }

    public final void m(Enum r3, long j2, mew mewVar) {
        if (n(r3)) {
            return;
        }
        int iOrdinal = r3.ordinal();
        Enum[] enumArr = this.o;
        enumArr[iOrdinal] = r3;
        long[] jArr = this.n;
        jArr[iOrdinal] = j2;
        long j3 = iOrdinal > 0 ? jArr[iOrdinal - 1] : -1L;
        Enum r2 = iOrdinal > 0 ? enumArr[iOrdinal - 1] : null;
        boolean z = false;
        if (j3 >= 0 && mewVar.b) {
            z = true;
        }
        boolean z2 = mewVar.a;
        if (z && z2) {
            if (r2 != null) {
                r2.name();
            }
            r3.name();
        } else if (z) {
            if (r2 != null) {
                r2.name();
            }
            r3.name();
        } else if (z2) {
            r3.name();
        }
    }

    public final boolean n(Enum r5) {
        Enum[] enumArr = this.o;
        int iOrdinal = r5.ordinal();
        a.I(enumArr[iOrdinal] == r5);
        return this.n[iOrdinal] >= 0;
    }

    public final String toString() {
        long[] jArr;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{\n");
        long j2 = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            jArr = this.n;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 >= 0 && j3 < j2) {
                j2 = j3;
            }
            i++;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            sb.append("\t");
            sb.append(this.o[i2]);
            sb.append(": ");
            sb.append(jArr[i2]);
            if (jArr[i2] >= 0) {
                sb.append(" (");
                sb.append(ojl.ba(jArr[i2] - j2));
                sb.append("ms)");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    protected mex(pqm pqmVar, long j2, Enum[] enumArr) {
        this(pqmVar, new qpt((byte[]) null), j2, enumArr);
    }

    protected mex(pqm pqmVar, Enum[] enumArr) {
        this(pqmVar, new qpt((byte[]) null), pqmVar.a(), enumArr);
    }
}
