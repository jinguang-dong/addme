package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qgg extends Exception {
    protected qgg(Throwable th) {
        super(th);
        setStackTrace(th.getStackTrace());
    }

    public static qgg a(Throwable th) {
        return th instanceof qgg ? (qgg) th : new qgg(th);
    }
}
