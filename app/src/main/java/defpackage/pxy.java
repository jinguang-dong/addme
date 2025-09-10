package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxy extends pxz {
    private final pvc a;

    public pxy(pvc pvcVar) {
        this.a = pvcVar;
    }

    @Override // defpackage.pya
    public final int b() {
        return 1;
    }

    @Override // defpackage.pxz, defpackage.pya
    public final pvc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pya) {
            pya pyaVar = (pya) obj;
            if (pyaVar.b() == 1 && this.a.equals(pyaVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        pvc pvcVar = this.a;
        if (pvcVar.C()) {
            return pvcVar.j();
        }
        int i = pvcVar.aT;
        if (i != 0) {
            return i;
        }
        int iJ = pvcVar.j();
        pvcVar.aT = iJ;
        return iJ;
    }
}
