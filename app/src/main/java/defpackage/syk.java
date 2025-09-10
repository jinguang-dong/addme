package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class syk extends swn {
    private syl a;

    public syk(syl sylVar) {
        this.a = sylVar;
    }

    @Override // defpackage.swn, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        syl sylVar = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        sylVar.getClass();
        sylVar.a = true;
        if (!z) {
            sylVar.b = false;
        }
        sylVar.a();
        return true;
    }

    @Override // defpackage.swn
    protected final void d() {
        this.a = null;
    }

    @Override // defpackage.swn
    protected final String ez() {
        syl sylVar = this.a;
        if (sylVar == null) {
            return null;
        }
        syu[] syuVarArr = sylVar.d;
        AtomicInteger atomicInteger = sylVar.c;
        return "inputCount=[" + syuVarArr.length + "], remaining=[" + atomicInteger.get() + "]";
    }
}
