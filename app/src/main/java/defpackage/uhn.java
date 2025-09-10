package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uhn implements Serializable, uhb, uhq {
    public final uhb q;

    public uhn(uhb uhbVar) {
        this.q = uhbVar;
    }

    protected abstract Object b(Object obj);

    @Override // defpackage.uhq
    public uhq cK() {
        uhb uhbVar = this.q;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.uhq
    public void cL() {
    }

    protected void f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uhb
    public final void fW(Object obj) {
        while (true) {
            this.getClass();
            uhn uhnVar = this;
            uhb uhbVar = uhnVar.q;
            uhbVar.getClass();
            try {
                obj = uhnVar.b(obj);
                if (obj == uhi.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = rnt.aM(th);
            }
            uhnVar.f();
            if (!(uhbVar instanceof uhn)) {
                uhbVar.fW(obj);
                return;
            }
            this = uhbVar;
        }
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    public uhb c(Object obj, uhb uhbVar) {
        throw new UnsupportedOperationException(SHXc.BUlm);
    }
}
