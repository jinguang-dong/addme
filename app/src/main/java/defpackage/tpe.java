package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tpe extends tpc implements tqs {
    public tpe() {
        throw null;
    }

    private final toy aJ() {
        toy toyVar = ((tpf) this.b).r;
        if (!toyVar.c) {
            return toyVar;
        }
        toy toyVarC = toyVar.clone();
        ((tpf) this.b).r = toyVarC;
        return toyVarC;
    }

    private final void aK(tql tqlVar) {
        if (tqlVar.d != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.tpc, defpackage.tqq
    /* renamed from: aG, reason: merged with bridge method [inline-methods] */
    public final tpf m() {
        if (!((tpf) this.b).C()) {
            return (tpf) this.b;
        }
        ((tpf) this.b).r.e();
        return (tpf) super.m();
    }

    public final void aH(tql tqlVar) {
        Map map = tph.aU;
        aK(tqlVar);
        if (!this.b.C()) {
            o();
        }
        toy toyVarAJ = aJ();
        Object obj = tqlVar.c;
        trl trlVar = toyVarAJ.b;
        trlVar.remove(obj);
        if (trlVar.isEmpty()) {
            toyVarAJ.d = false;
        }
    }

    public final void aI(tql tqlVar, Object obj) {
        Map map = tph.aU;
        aK(tqlVar);
        if (!this.b.C()) {
            o();
        }
        toy toyVarAJ = aJ();
        tpg tpgVar = (tpg) tqlVar.c;
        if (tpgVar.a() == trz.ENUM) {
            obj = Integer.valueOf(((tpk) obj).a());
        }
        toyVarAJ.l(tpgVar, obj);
    }

    @Override // defpackage.tpc
    public final void o() {
        super.o();
        if (((tpf) this.b).r != toy.a) {
            tpf tpfVar = (tpf) this.b;
            tpfVar.r = tpfVar.r.clone();
        }
    }

    public tpe(tpf tpfVar) {
        super(tpfVar);
    }
}
