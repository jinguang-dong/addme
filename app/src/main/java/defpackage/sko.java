package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sko {
    public final int a;
    public final sia b;

    protected sko(sia siaVar, int i) {
        if (siaVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.bv(i, "invalid index: "));
        }
        this.a = i;
        this.b = siaVar;
    }

    public abstract void a(sks sksVar, Object obj);
}
