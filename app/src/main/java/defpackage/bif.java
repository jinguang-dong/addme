package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bif implements bik {
    public final bik a;
    public final bik b;

    public bif(bik bikVar, bik bikVar2) {
        this.a = bikVar;
        this.b = bikVar2;
    }

    @Override // defpackage.bik
    public final boolean c(uiq uiqVar) {
        return this.a.c(uiqVar) && this.b.c(uiqVar);
    }

    @Override // defpackage.bik
    public final /* synthetic */ bik cM(bik bikVar) {
        return bay.t(this, bikVar);
    }

    @Override // defpackage.bik
    public final Object cN(Object obj, uiu uiuVar) {
        return this.b.cN(this.a.cN(obj, uiuVar), uiuVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bif)) {
            return false;
        }
        bif bifVar = (bif) obj;
        return a.ao(this.a, bifVar.a) && a.ao(this.b, bifVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) cN("", cca.b)) + ']';
    }
}
