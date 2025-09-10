package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bha {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final void b() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
