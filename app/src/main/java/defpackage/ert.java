package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ert extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public ert(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
