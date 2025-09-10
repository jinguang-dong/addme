package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ugy implements uhe {
    private final uiq a;
    private final uhe b;

    public ugy(uhe uheVar, uiq uiqVar) {
        this.a = uiqVar;
        this.b = uheVar instanceof ugy ? ((ugy) uheVar).b : uheVar;
    }

    public final uhd a(uhd uhdVar) {
        return (uhd) this.a.a(uhdVar);
    }

    public final boolean b(uhe uheVar) {
        uheVar.getClass();
        return uheVar == this || this.b == uheVar;
    }

    public ugy() {
        this(uhc.k, new umz(0));
    }
}
