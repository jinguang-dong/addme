package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhh implements uhb, uhq {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(uhh.class, Object.class, "result");
    private final uhb b;
    private volatile Object result;

    public uhh(uhb uhbVar, Object obj) {
        this.b = uhbVar;
        this.result = obj;
    }

    @Override // defpackage.uhq
    public final uhq cK() {
        uhb uhbVar = this.b;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        while (true) {
            Object obj2 = this.result;
            uhi uhiVar = uhi.b;
            if (obj2 != uhiVar) {
                uhi uhiVar2 = uhi.a;
                if (obj2 != uhiVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (a.G(a, this, uhiVar2, uhi.c)) {
                    this.b.fW(obj);
                    return;
                }
            } else if (a.G(a, this, uhiVar, obj)) {
                return;
            }
        }
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.b.q();
    }

    public final String toString() {
        uhb uhbVar = this.b;
        Objects.toString(uhbVar);
        return "SafeContinuation for ".concat(uhbVar.toString());
    }

    @Override // defpackage.uhq
    public final void cL() {
    }
}
