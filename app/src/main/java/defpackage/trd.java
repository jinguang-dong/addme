package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class trd extends tod {
    final tre a;
    tof b = b();
    final /* synthetic */ trf c;

    public trd(trf trfVar) {
        this.c = trfVar;
        this.a = new tre(trfVar);
    }

    private final tof b() {
        tre treVar = this.a;
        if (treVar.hasNext()) {
            return treVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.tof
    public final byte a() {
        tof tofVar = this.b;
        if (tofVar == null) {
            throw new NoSuchElementException();
        }
        byte bA = tofVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
