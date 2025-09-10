package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pir extends pog {
    private final paq a;

    public pir(poj pojVar, paq paqVar) {
        super(pojVar);
        this.a = paqVar;
    }

    @Override // defpackage.pog, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }
}
