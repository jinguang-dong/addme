package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kar implements jzf {
    public final /* synthetic */ kas a;

    public kar(kas kasVar) {
        this.a = kasVar;
    }

    @Override // defpackage.jzf
    public final boolean a(poj pojVar) {
        this.a.d.post(new jnw(this, pojVar, 19, null));
        return true;
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        kas kasVar = this.a;
        kasVar.e.b("DBG closing sink");
        kasVar.d.post(new jxr(this, 15));
    }
}
