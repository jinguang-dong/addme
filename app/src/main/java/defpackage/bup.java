package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bup extends bij {
    public final int x = bwj.b(this);
    public bij y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [bij] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void cP(int i, boolean z) {
        bij bijVar;
        int i2 = this.n;
        this.n = i;
        if (i2 != i) {
            if (B() == this) {
                this.o = i;
            }
            if (this.w) {
                bij bijVar2 = this.m;
                ?? r2 = this;
                while (r2 != 0) {
                    i |= r2.n;
                    r2.n = i;
                    if (r2 == bijVar2) {
                        break;
                    } else {
                        r2 = r2.p;
                    }
                }
                if (z && r2 == bijVar2) {
                    i = bwj.c(bijVar2);
                    bijVar2.n = i;
                }
                int i3 = 0;
                if (r2 != 0 && (bijVar = r2.q) != null) {
                    i3 = bijVar.o;
                }
                int i4 = i | i3;
                for (bij bijVar3 = r2; bijVar3 != null; bijVar3 = bijVar3.p) {
                    i4 |= bijVar3.n;
                    bijVar3.o = i4;
                }
            }
        }
    }

    @Override // defpackage.bij
    public final void D() {
        super.D();
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.K(this.s);
            if (!bijVar.w) {
                bijVar.D();
            }
        }
    }

    @Override // defpackage.bij
    public final void E() {
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.E();
        }
        super.E();
    }

    @Override // defpackage.bij
    public final void F() {
        super.F();
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.F();
        }
    }

    @Override // defpackage.bij
    public final void G() {
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.G();
        }
        super.G();
    }

    @Override // defpackage.bij
    public final void H() {
        super.H();
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.H();
        }
    }

    @Override // defpackage.bij
    public final void I(bij bijVar) {
        this.m = bijVar;
        for (bij bijVar2 = this.y; bijVar2 != null; bijVar2 = bijVar2.q) {
            bijVar2.I(bijVar);
        }
    }

    @Override // defpackage.bij
    public final void K(bwi bwiVar) {
        this.s = bwiVar;
        for (bij bijVar = this.y; bijVar != null; bijVar = bijVar.q) {
            bijVar.K(bwiVar);
        }
    }

    public final void L(buo buoVar) {
        bij bijVar = null;
        for (bij bijVar2 = this.y; bijVar2 != null; bijVar2 = bijVar2.q) {
            if (bijVar2 == buoVar) {
                if (bijVar2.w) {
                    bwj.f(bijVar2);
                    bijVar2.H();
                    bijVar2.E();
                }
                bijVar2.I(bijVar2);
                bijVar2.o = 0;
                if (bijVar == null) {
                    this.y = bijVar2.q;
                } else {
                    bijVar.q = bijVar2.q;
                }
                bijVar2.q = null;
                bijVar2.p = null;
                int i = this.n;
                int iC = bwj.c(this);
                cP(iC, true);
                if (this.w && (i & 2) != 0 && (iC & 2) == 0) {
                    bwe bweVar = bko.B(this).s;
                    this.m.K(null);
                    bweVar.i();
                    return;
                }
                return;
            }
            bijVar = bijVar2;
        }
        Objects.toString(buoVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(buoVar)));
    }

    public final void M(buo buoVar) {
        bij bijVarB = buoVar.B();
        if (bijVarB != buoVar) {
            if (true != (buoVar instanceof bij)) {
                buoVar = null;
            }
            bij bijVar = buoVar != null ? ((bij) buoVar).p : null;
            if (bijVarB != this.m || !a.ao(bijVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (bijVarB.w) {
            bqs.c("Cannot delegate to an already attached node");
        }
        bijVarB.I(this.m);
        int i = this.n;
        int iC = bwj.c(bijVarB);
        bijVarB.n = iC;
        int i2 = iC & 2;
        int i3 = this.n;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof bve)) {
            bqs.c(a.bC(bijVarB, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        bijVarB.q = this.y;
        this.y = bijVarB;
        bijVarB.p = this;
        cP(iC | this.n, false);
        if (this.w) {
            if (i2 == 0 || (i & 2) != 0) {
                K(this.s);
            } else {
                bwe bweVar = bko.B(this).s;
                this.m.K(null);
                bweVar.i();
            }
            bijVarB.D();
            bijVarB.G();
            bwj.d(bijVarB);
        }
    }
}
