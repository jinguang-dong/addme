package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npg extends ojl {
    final /* synthetic */ nph a;
    private final pdk b;
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npg(nph nphVar, pdk pdkVar, boolean z) {
        super((short[]) null);
        this.a = nphVar;
        this.b = pdkVar;
        this.c = z;
    }

    @Override // defpackage.ojl
    public final void dJ() {
        if (this.c) {
            return;
        }
        this.a.i(this.b);
    }

    @Override // defpackage.ojl
    public final Executor dX() {
        return this.a.d;
    }

    @Override // defpackage.ojl
    public final void dY() {
        if (this.c) {
            this.a.i(this.b);
        }
    }
}
