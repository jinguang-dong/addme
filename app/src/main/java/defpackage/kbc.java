package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbc implements jzf {
    private final /* synthetic */ int a;

    public kbc(int i) {
        this.a = i;
    }

    @Override // defpackage.jzf
    public final boolean a(poj pojVar) {
        if (this.a != 0) {
            pojVar.close();
            return false;
        }
        pojVar.close();
        return false;
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }
}
