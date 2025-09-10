package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uha implements Serializable, uhf {
    private final uhf a;
    private final uhd b;

    public uha(uhf uhfVar, uhd uhdVar) {
        uhfVar.getClass();
        this.a = uhfVar;
        this.b = uhdVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            uhf uhfVar = this.a;
            this = uhfVar instanceof uha ? (uha) uhfVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(uhd uhdVar) {
        return a.ao(get(uhdVar.getKey()), uhdVar);
    }

    private final Object writeReplace() {
        int iA = a();
        uhf[] uhfVarArr = new uhf[iA];
        ujy ujyVar = new ujy();
        fold(ufg.a, new dmt(uhfVarArr, ujyVar, 2));
        if (ujyVar.a == iA) {
            return new ugz(uhfVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uha) {
            uha uhaVar = (uha) obj;
            if (uhaVar.a() == a()) {
                while (true) {
                    if (!uhaVar.b(this.b)) {
                        break;
                    }
                    uhf uhfVar = this.a;
                    if (uhfVar instanceof uha) {
                        this = (uha) uhfVar;
                    } else if (uhaVar.b((uhd) uhfVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return uiuVar.a(this.a.fold(obj, uiuVar), this.b);
    }

    @Override // defpackage.uhf
    public final uhd get(uhe uheVar) {
        uheVar.getClass();
        while (true) {
            uhd uhdVar = this.b.get(uheVar);
            if (uhdVar != null) {
                return uhdVar;
            }
            uhf uhfVar = this.a;
            if (!(uhfVar instanceof uha)) {
                return uhfVar.get(uheVar);
            }
            this = (uha) uhfVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        uheVar.getClass();
        uhd uhdVar = this.b;
        if (uhdVar.get(uheVar) != null) {
            return this.a;
        }
        uhf uhfVar = this.a;
        uhf uhfVarMinusKey = uhfVar.minusKey(uheVar);
        return uhfVarMinusKey != uhfVar ? uhfVarMinusKey == uhg.a ? uhdVar : new uha(uhfVarMinusKey, uhdVar) : this;
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aJ(this, uhfVar);
    }

    public final String toString() {
        return "[" + fold("", new aud(8)) + "]";
    }
}
