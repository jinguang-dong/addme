package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qn {
    private final int a;
    private final int b;
    private final byi c;

    public qn() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn qnVar = (qn) obj;
        int i = qnVar.a;
        int i2 = qnVar.b;
        return a.ao(this.c, qnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public /* synthetic */ qn(byte[] bArr) {
        byi byiVar = new byi();
        this.a = 0;
        this.b = 0;
        this.c = byiVar;
    }

    public final String toString() {
        return qcjAcSmlN.tPxXNCvt + this.c + ')';
    }
}
