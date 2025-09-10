package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class unx extends unz {
    final /* synthetic */ uob a;
    private final umk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unx(uob uobVar, long j, umk umkVar) {
        super(j);
        this.a = uobVar;
        this.c = umkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this.a, ufg.a);
    }

    @Override // defpackage.unz
    public final String toString() {
        String string = super.toString();
        umk umkVar = this.c;
        Objects.toString(umkVar);
        return string.concat(umkVar.toString());
    }
}
