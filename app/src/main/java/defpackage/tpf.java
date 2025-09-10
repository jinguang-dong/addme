package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tpf extends tph implements tqs {
    public toy r = toy.a;

    public final toy c() {
        toy toyVar = this.r;
        if (toyVar.c) {
            this.r = toyVar.clone();
        }
        return this.r;
    }

    public final void i(tql tqlVar) {
        if (tqlVar.d != ((tph) a(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
