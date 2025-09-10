package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edv extends Exception {
    public final int a;

    public edv(String str, int i) {
        super(str);
        this.a = i;
    }

    public edv(String str, int i, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
