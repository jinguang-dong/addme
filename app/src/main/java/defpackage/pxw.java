package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxw extends pxz {
    private final pts a;

    public pxw(pts ptsVar) {
        this.a = ptsVar;
    }

    @Override // defpackage.pxz, defpackage.pya
    public final pts a() {
        return this.a;
    }

    @Override // defpackage.pya
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pya) {
            pya pyaVar = (pya) obj;
            if (pyaVar.b() == 3 && this.a.equals(pyaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        pts ptsVar = this.a;
        if (ptsVar.C()) {
            return ptsVar.j();
        }
        int i = ptsVar.aT;
        if (i != 0) {
            return i;
        }
        int iJ = ptsVar.j();
        ptsVar.aT = iJ;
        return iJ;
    }
}
