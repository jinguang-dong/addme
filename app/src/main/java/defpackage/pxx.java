package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxx extends pxz {
    private final syu a;

    public pxx(syu syuVar) {
        this.a = syuVar;
    }

    @Override // defpackage.pya
    public final int b() {
        return 2;
    }

    @Override // defpackage.pxz, defpackage.pya
    public final syu c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pya) {
            pya pyaVar = (pya) obj;
            if (pyaVar.b() == 2 && this.a.equals(pyaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
