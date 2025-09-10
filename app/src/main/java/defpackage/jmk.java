package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmk extends ojl {
    final /* synthetic */ Executor a;
    final /* synthetic */ cnh b;
    final /* synthetic */ pdk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmk(Executor executor, cnh cnhVar, pdk pdkVar) {
        super((short[]) null);
        this.a = executor;
        this.b = cnhVar;
        this.c = pdkVar;
    }

    @Override // defpackage.ojl
    public final void dY() {
        this.a.execute(new imf(this.b, this.c, 18));
    }
}
