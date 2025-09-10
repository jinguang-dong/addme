package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oub extends Exception {
    public oub() {
    }

    public oub(String str) {
        super(str);
    }

    public oub(Throwable th) {
        super("ContentProvider query failed", th);
    }
}
