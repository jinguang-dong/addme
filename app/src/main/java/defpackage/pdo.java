package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdo implements Comparable {
    public static final pdo a = new pdo(-1, -1, -1);
    public final long b;
    public final long c;
    public final long d;

    public pdo(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(pdo pdoVar) {
        return Long.compare(this.d, pdoVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pdo)) {
            return false;
        }
        pdo pdoVar = (pdo) obj;
        return this.d == pdoVar.d && this.b == pdoVar.b && this.c == pdoVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.f(JvFFEwFNdCrxf.pcqZmNPJwdhT, this.b);
        rwbVarW.f("onStartedId", this.d);
        rwbVarW.f("frameNumber", this.c);
        return rwbVarW.toString();
    }
}
