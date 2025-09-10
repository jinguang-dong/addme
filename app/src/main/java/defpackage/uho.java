package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uho implements uhb {
    public static final uho a = new uho();

    private uho() {
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.uhb
    public final uhf q() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
